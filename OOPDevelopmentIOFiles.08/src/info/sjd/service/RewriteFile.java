package info.sjd.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import info.sjd.SessionData;

public class RewriteFile {

	List<SessionData> scannedSessions = new ArrayList<SessionData>();
	private Scanner scanner;
	private FileWriter file;
	int sessionsCounter;

	public void openSessionListToRewrite(File filePath) {
		try {
			scanner = new Scanner(filePath);
		} catch (Exception e) {
			System.out.println("File not found!");
		}		
	}

	public void createNewListOfSessions(int ageInDays) {
		while (scanner.hasNext()) {
			Date date = new Date(System.currentTimeMillis());
			String[] current = scanner.nextLine().split("\\s+");
			for (String subCurrent : current) {
				if ("".equals(subCurrent)) {
					continue;
				}
					
				
			}
			Long sessionStartTime = Long.parseLong(current[0].trim());
			if (sessionStartTime > (date.getTime() - ageInDays * 24 * 60 * 60 * 1000)) {
				SessionData session = new SessionData();
				session.setSessionStartTime(sessionStartTime);
				session.setSessionID(current[1]);
				session.setSessionIP(current[2]);
				sessionsCounter++;
				scannedSessions.add(session);
			}
		}		
	}

	public void closeReadingOfSessionList() {
		scanner.close();
	}
	
	public void openSessionListToRewriteAgain(File filePath) {
		try {
			file = new FileWriter(filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	public void rewriteNSessions() throws IOException {
		for (int i = 0; i < sessionsCounter; i++) {
			file.write(scannedSessions.get(i).getSessionStartTime() + " " + scannedSessions.get(i).getSessionID() + " " + scannedSessions.get(i).getSessionIP() + "\n");
		}		
	}

	public void closeSessionList() throws IOException {
		file.flush();
		file.close();
	}

}
