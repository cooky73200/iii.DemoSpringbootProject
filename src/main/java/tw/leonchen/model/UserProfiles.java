package tw.leonchen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Entity @Table(name="Userprofiles")
@Component
public class UserProfiles {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="emailaddress")
	private String emailAddress;
	@Column(name="password")
	private String password;
	@Column(name="phone")
	private String phone;

}
