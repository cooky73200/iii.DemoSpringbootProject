package tw.leonchen.model;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthUserDetailsService implements UserDetailsService  {
	@Autowired
	private UserProfilesService ups;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserProfiles up1 = ups.getByName(username);

		return new User(up1.getName(),up1.getPassword(),Collections.emptyList());
	}


}
