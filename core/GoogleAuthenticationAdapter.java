package homework5.core;

import homework5.googleAuthentication.GoogleAuthentication;

public class GoogleAuthenticationAdapter implements AuthenticationService {

	@Override
	public void authentication(String message) {
		GoogleAuthentication auth = new GoogleAuthentication();
		auth.valid(message);
		
	}

	

}
