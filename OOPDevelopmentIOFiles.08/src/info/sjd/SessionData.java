package info.sjd;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class SessionData {
	private String sessionStartTime;
	private String sessionID;
	private String sessionIP;
	
	public String getSessionStartTime() {
		return sessionStartTime;
	}
	public void setSessionStartTime(String sessionStartTime) {
		this.sessionStartTime = sessionStartTime;
	}
	public String getSessionID() {
		return sessionID;
	}
	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}
	public String getSessionIP() {
		return sessionIP;
	}
	public void setSessionIP(String sessionIP) {
		this.sessionIP = sessionIP;
	}
	public static List<SessionData> getListOfSessions(int limit) {
		List<SessionData> sessions = new ArrayList<>();
		
		for (int i = 0; i < limit; i++) {
			SessionData session = new SessionData();
			session.setSessionStartTime(String.valueOf(sessionStartTime()));
			session.setSessionID(String.valueOf(sessionID()));
			session.setSessionIP(sessionIP());
		}

		return sessions ;
	}
	
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
