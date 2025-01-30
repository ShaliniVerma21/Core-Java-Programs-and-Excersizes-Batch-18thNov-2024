
	import java.util.List;

	public class Main {
	    public static void main(String[] args) {
	        UserDAO userDAO = new UserDAO();

	        // Insert a new user
	        User newUser  = new User(0, "Shaliniv", "password123", "shaliniv532@gmail.com");
	        userDAO.insertUser (newUser );

	        // Select a user by ID
	        User user = userDAO.selectUser (1);
	        System.out.println(":User  " + user.getUsername());

	        // Update user
	        user.setEmail("shaliniv532@gmail.com");
	        userDAO.updateUser (user);

	        // Select all users
	        List<User> users = userDAO.selectAllUsers();
	        for (User  u : users) {
	            System.out.println(u.getUsername());
	        }

	        // Delete user
	        userDAO.deleteUser (1);
	    }
	
}
