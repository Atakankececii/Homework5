package homework5.business.concretes;

import java.util.List;


import homework5.business.abstracts.UserService;
import homework5.core.AuthenticationService;
import homework5.core.UserCheckManager;
import homework5.dataAccess.abstracts.UserDao;
import homework5.entities.concretes.User;

public class UserManager implements UserService {


	private UserDao userDao;
	private UserCheckManager userCheckManager;
	private AuthenticationService authenticationService;
	

	public UserManager(UserDao userDao , UserCheckManager userCheckManager,AuthenticationService authenticationService) {
		super();
		this.userDao = userDao;
		this.userCheckManager = userCheckManager;
		this.authenticationService = authenticationService;
	}
	
	@Override
	public void add(User user) {
	if(userCheckManager.checkMail(user) && userCheckManager.checkName(user) && userCheckManager.check() && userCheckManager.checkMailData(user, userDao) && userCheckManager.checkPassword(user)) {	
	
		
			userDao.add(user);
			authenticationService.authentication("Baþarýlý");}
	else {
		System.out.println("Tekrar deneyiniz.");
	}
	}
			
			


	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" kullanýcýmýz silindi.");
		
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public boolean login(User user) {
		for (User email : getAll()) {
			if((email.getEmail() == user.getEmail())
					 &&
			  (email.getPassword() == user.getPassword())) {
				System.out.println("Sayýn " + user.getFirstName() + " " + user.getLastName() + " hoþgeldiniz.");
				return true;
			}
		}
		System.out.println("Geçersiz kullanýcý adý veya þifre girdiniz.");
		return false;
	}

}
