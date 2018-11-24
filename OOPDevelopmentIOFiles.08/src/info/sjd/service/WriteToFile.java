package info.sjd.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import info.sjd.SessionData;

public class WriteToFile {
	private FileWriter file;
	List<SessionData> sessions = new ArrayList<SessionData>();

	public void openSessionListToWrite(File filePath) {
		try {
			file = new FileWriter(filePath, true);


		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public void closeSessionList() throws IOException {
		file.flush();
		file.close();
	}

	public void createNSessions(int limit) {
		for (int i = 0; i < limit; i++) {
			SessionData session = new SessionData();
			session.setSessionStartTime(ServerSessionsService.sessionStartTime() - (limit - i) * 1000);
			session.setSessionID(String.valueOf(ServerSessionsService.sessionID()));
			session.setSessionIP(ServerSessionsService.sessionIP());
			
			sessions.add(session);
		}
		
	}

	public void writeNSessions(int limit) throws IOException {
		for (int i = 0; i < limit; i++) {
			file.write(sessions.get(i).getSessionStartTime() + " " + sessions.get(i).getSessionID() + " " + sessions.get(i).getSessionIP() + "\n");
		}
	}
}
