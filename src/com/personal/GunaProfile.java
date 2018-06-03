package com.personal;

public class GunaProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		
		System.out.println(ProfileConstants.FIRST_NAME+"guna");
		System.out.println(ProfileConstants.LAST_NAME+"bharathi");
		System.out.println(ProfileConstants.AGE+"20");
		}
	

	@Override
	public void myHobbies() {
		
		System.out.println("My hobbies are reading books and watching tv.");
	}
	
		
	}


