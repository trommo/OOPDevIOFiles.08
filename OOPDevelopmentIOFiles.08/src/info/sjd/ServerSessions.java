package info.sjd;

import info.sjd.service.*;
import info.sjd.SessionData;

import java.util.ArrayList;
import java.util.List;

public class ServerSessions {
	
	public static void main(String[] args) {
		
		int limit = 10;

		List<SessionData> sessions = new ArrayList<SessionData>();
			for (int i = 0; i < limit; i++) {
				SessionData session = new SessionData();
				session.setSessionStartTime(String.valueOf(ServerSessionsService.sessionStartTime() - (limit - i) * 1000));
				session.setSessionID(String.valueOf(ServerSessionsService.sessionID()));
				session.setSessionIP(ServerSessionsService.sessionIP());
				
				sessions.add(session);
			}

			
		
		for (int i = 0; i < limit; i++) {
			System.out.println(sessions.get(i).getSessionStartTime() + " " + sessions.get(i).getSessionID() + " " + sessions.get(i).getSessionIP());
		}
		
	}
	

	
}

