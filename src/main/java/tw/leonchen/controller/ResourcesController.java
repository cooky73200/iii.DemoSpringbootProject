package tw.leonchen.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourcesController {

	@GetMapping(path="/resourcepath.controller",produces = MediaType.IMAGE_PNG_VALUE)
	public byte[] processClassPathResourceAction() throws IOException {
		ClassPathResource resource = new ClassPathResource("static/images/img05.jpg");
		File file = resource.getFile();
		System.out.println(file.getName()+"\n"+file.getPath()+"\n"+file.length());
		InputStream is1 = resource.getInputStream();
		return IOUtils.toByteArray(is1);
	}

	@Autowired
	private ResourceLoader rl1;
	@GetMapping(path= "/resourceloader.controller" ,produces=MediaType.IMAGE_JPEG_VALUE)
	public byte[] processResourceLoaderAction() throws IOException {
		Resource resource = rl1.getResource("classpath:static/images/img05.jpg");

		File file = resource.getFile();
		System.out.println(file.getName()+"\n"+file.getPath()+"\n"+file.length());
		InputStream is1 = resource.getInputStream();
		return IOUtils.toByteArray(is1);
	}
	@Value("classpath:static/images/img05.jpg")
	private Resource resource;

	@GetMapping(path= "/resource.controller" ,produces=MediaType.IMAGE_JPEG_VALUE)
	public byte[] processResourceAction() throws IOException {
		File file = resource.getFile();
		System.out.println(file.getName()+"\n"+file.getPath()+"\n"+file.length());
		InputStream is1 = resource.getInputStream();
		return IOUtils.toByteArray(is1);
	}

}
