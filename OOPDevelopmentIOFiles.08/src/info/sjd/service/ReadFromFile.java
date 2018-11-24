package info.sjd.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import info.sjd.SessionData;

public class ReadFromFile {
	
	List<SessionData> scannedSessions = new ArrayList<SessionData>();
	private Scanner scanner;
	int sessionsCounter;
	
	public void openSessionListToRead (File filePath) {
		try {
			scanner = new Scanner(filePath);
		} catch (Exception e) {
			System.out.println("File not found!");
		}
		
	}
	
	public void readSessionList( ) {
		while (scanner.hasNext()) {
			SessionData session = new SessionData();
			session.setSessionStartTime(Long.parseLong(scanner.next()));
			session.setSessionID(scanner.next());
			session.setSessionIP(scanner.next());
			sessionsCounter++;
			scannedSessions.add(session);
		}
	}

	public void showScannedSessions() {
		for (int i = 0; i < sessionsCounter; i++) {
			
		System.out.println(scannedSessions.get(i).getSessionStartTime() + " " + scannedSessions.get(i).getSessionID() + " " + scannedSessions.get(i).getSessionIP());
	
		}
	}
	
	public void closeSessionList() {
		scanner.close();
	}
		
	

}
