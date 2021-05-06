package homework5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homework5.dataAccess.abstracts.UserDao;
import homework5.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	private List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() + " hibernate ile eklendiniz.");
		users.add(user);
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() + " hibernate ile silindiniz.");
		
		
	}



	@Override
	public List<User> getAll() {
		return users;
	}



}
