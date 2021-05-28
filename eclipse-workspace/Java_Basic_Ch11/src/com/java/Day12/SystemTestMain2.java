package com.java.Day12;

public class SystemTestMain2 {

	public static void main(String[] args) {
		//getProperty()
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		
		System.out.println("OS: " + osName); //OS: Windows 10
		System.out.println("User: "+userName); //User: kosmo
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("java.class.path"));
		
		//모든 property
		System.getProperties().list(System.out);
		
		//getEnv()
		System.out.println(System.getenv("PATH"));
	}
}
