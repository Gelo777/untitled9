package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
	void createUser(User user);
	User getUserById(Long id);
	void updateUser(User user);
	void deleteUser(Long id);
	List<User> getUsers();
}
