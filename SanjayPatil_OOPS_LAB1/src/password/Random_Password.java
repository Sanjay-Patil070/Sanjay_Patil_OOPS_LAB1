package password;

import java.util.Random;

public class Random_Password {
	public void  generatePassword1() {
		String upperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase="abcdefghijklmnopqrstuvwxyz";
		String specialCharacter="!@#$%^&*()_<>?{}";
		String num ="1234567890";
		String combination=upperCase+lowerCase+specialCharacter+num;
		int len=8;
		
		char[] password=new char[len];
		
		Random r=new Random();
		
		for(int i=0;i<len;i++) {
			password[i]=combination.charAt(r.nextInt(combination.length()));
			
		}
		System.out.println("generated password is:"+new String(password)+"\n");
		
	}

}
