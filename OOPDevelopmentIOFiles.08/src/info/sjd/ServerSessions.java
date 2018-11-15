package info.sjd;

import java.util.Random;
import java.util.Date;

public class ServerSessions {
	
	public static void main(String[] args) {
		System.out.println(sessionStartTime() + " " +sessionID() + " " + generatedIP());
	}
	
	public static int sessionID() {
		
		Random random = new Random();
		
		return 100000000 + random.nextInt(900000000);
	}
	
	public static long sessionStartTime() {
		Date date = new Date(System.currentTimeMillis());
		return date.getTime();
	}
	
	public static String generatedIP() {
		
		Random random = new Random();
		
		return String.valueOf(random.nextInt(255)) + "." + String.valueOf(random.nextInt(255)) + "." + String.valueOf(random.nextInt(255)) + "." + String.valueOf(random.nextInt(255));
	}
}

