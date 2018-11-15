package info.sjd;

import java.util.List;

import info.sjd.SessionData;

public class ServerSessions {
	
	public static void main(String[] args) {
		
		List<SessionData> sessions = SessionData.getListOfSessions(10);
		
		System.out.println(String.valueOf(((SessionData) sessions).getSessionStartTime()) + " " +  String.valueOf(((SessionData) sessions).getSessionID()) + " " + String.valueOf(((SessionData) sessions).getSessionIP()));
		
	}
	
	
}

