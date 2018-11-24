package info.sjd;

import info.sjd.service.*;

import java.io.File;
import java.io.IOException;


public class ServerSessions {
	
	public static void main(String[] args) throws IOException {
		
		int limit = 10;
		int ageInDays = 3;
		String filePath = "src/info/sjd/log/SessionLog.txt";
		File file = new File(filePath);	

		WriteToFile writeToFile = new WriteToFile();
		ReadFromFile readFromFile = new ReadFromFile();
		RewriteFile rewriteFile = new RewriteFile();
		
		
		writeToFile.openSessionListToWrite(file);
		writeToFile.createNSessions(limit);
		writeToFile.writeNSessions(limit);
		writeToFile.closeSessionList();
		
		readFromFile.openSessionListToRead(file);
		readFromFile.readSessionList();
		readFromFile.showScannedSessions();
		readFromFile.closeSessionList();
		
		rewriteFile.openSessionListToRewrite(file);
		rewriteFile.createNewListOfSessions(ageInDays);
		rewriteFile.closeReadingOfSessionList();
		rewriteFile.openSessionListToRewriteAgain(file);
		rewriteFile.rewriteNSessions();
		rewriteFile.closeSessionList();
		
		
	}

}

