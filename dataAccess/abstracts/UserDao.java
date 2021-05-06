package homework5.dataAccess.abstracts;



import java.util.List;

import homework5.entities.concretes.User;



public interface UserDao {
	void add(User user);
	void delete(User user);
	List<User> getAll();
	
}
