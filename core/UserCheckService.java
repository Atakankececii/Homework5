package homework5.core;

import homework5.dataAccess.abstracts.UserDao;
import homework5.entities.concretes.User;

public interface UserCheckService {
	boolean checkName(User user);
	boolean checkMail(User user );
	boolean checkMailData(User user ,UserDao userDao);
	boolean checkPassword(User user);
	boolean check();
}
