package info.sjd;

import info.sjd.service.*;
import info.sjd.SessionData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

		File file = new File("src/info/sjd/log/SessionLog.txt");	
		
		try {
			FileWriter writer = new FileWriter(file, true);
			for (int i = 0; i < limit; i++) {
				writer.write(sessions.get(i).getSessionStartTime() + " " + sessions.get(i).getSessionID() + " " + sessions.get(i).getSessionIP() + "\n");
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		if (file.exists()) {
//			System.out.print("Cool!");
//		} else {
//			try {
//				boolean created = file.createNewFile();
//				if (created)
//					System.out.println("File has been created!");
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//			System.out.println("File not exist");
//		}
		
//		for (int i = 0; i < limit; i++) {
//			System.out.println(sessions.get(i).getSessionStartTime() + " " + sessions.get(i).getSessionID() + " " + sessions.get(i).getSessionIP());
//		}
		
	}
	

	
}

