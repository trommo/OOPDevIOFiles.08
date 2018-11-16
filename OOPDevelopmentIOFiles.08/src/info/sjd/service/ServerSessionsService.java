package info.sjd.service;

import java.util.Date;
import java.util.Random;

public class ServerSessionsService {
	
	public static int sessionID() {
		
		Random random = new Random();
		
		return 100000000 + random.nextInt(900000000);
	}
	
	public static long sessionStartTime() {
		Date date = new Date(System.currentTimeMillis());
		return date.getTime();
	}
	
	public static String sessionIP() {
		
		Random random = new Random();
		
		return String.valueOf(random.nextInt(255)) + "." + String.valueOf(random.nextInt(255)) + "." + String.valueOf(random.nextInt(255)) + "." + String.valueOf(random.nextInt(255));
	}

}
