package kodluyoruzioHomework3;

public class UserManager {
	
	public void addUser(User user) {
		
		System.out.println(user.getUserid()+" idsine sahip öðrenci "+user.getFirstName()+" Adý ile eklendi");
	}
	public void addMultipleUsers(User[] users) {
		
		for(User user:users) {
			addUser(user);
			System.out.println(user.getFirstName()+" adlý kullanýcý "+user.getUserid()+" id ile eklendi.");
		}
	}

}
