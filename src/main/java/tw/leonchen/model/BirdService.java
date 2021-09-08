package tw.leonchen.model;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BirdService {

	@Autowired
	private BirdRespository birdResp;

	public Bird insert(Bird bird) {
		return birdResp.save(bird);
	}

	public Bird update(Bird bird) {
		return birdResp.save(bird);
	}

	public boolean delete(Integer id) {
		if(birdResp.existsById(id)) {
			birdResp.deleteById(id);
			return true;
		}
		return false;
	}

	public Bird getById(Integer id) {
		Optional<Bird> op1 = birdResp.findById(id);

			if(op1.isPresent()) {
				return op1.get();
			}
		return null;
	}



}
