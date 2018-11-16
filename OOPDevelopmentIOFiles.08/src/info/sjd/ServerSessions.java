package info.sjd;

import info.sjd.service.*;
import info.sjd.SessionData;

import java.util.ArrayList;
import java.util.List;

public class ServerSessions {
	
	public static void main(String[] args) {
		
			List<SessionData> sessions = new ArrayList<>();
			
			for (int i = 0; i < 10; i++) {
				SessionData session = new SessionData();
				session.setSessionStartTime(String.valueOf(ServerSessionsService.sessionStartTime()));
				session.setSessionID(String.valueOf(ServerSessionsService.sessionID()));
				session.setSessionIP(ServerSessionsService.sessionIP());
			}

			
		
		
		System.out.println(((SessionData) sessions).getSessionStartTime() + " " +  ((SessionData) sessions).getSessionID() + " " + ((SessionData) sessions).getSessionIP());
		
	}
	

	
}

