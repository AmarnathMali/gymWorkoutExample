package com.gym;

public class UserImpl implements IUser{
	
	public User users[];
	
	UserImpl(){
		users = new User[5];
	}

	@Override
	public boolean register(User user, int index) {
      
		System.out.println("user info is: "+ user);
		users[index] = user;	
	    
		return false;
		
	}

	@Override
	public boolean login(String username, String password) {
		
		System.out.println("username and password: "+username+" "+ password);
		for(User user: users) {
			if (user != null) {
				if(user.getUserName().equals(username)&&user.getPassword().equals(password)) {
					return true;
				}
			}
		}
		return false;
	}
	

	
	
}
