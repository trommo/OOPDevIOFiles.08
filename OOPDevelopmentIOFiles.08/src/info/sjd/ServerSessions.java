package info.sjd;

import info.sjd.service.*;

import java.io.File;
import java.io.IOException;


public class ServerSessions {
	
	public static void main(String[] args) throws IOException {
		
		int limit = 10;
		WriteToFile writeToFile = new WriteToFile();
		String filePath = "src/info/sjd/log/SessionLog.txt";
		ReadFromFile readFromFile = new ReadFromFile();

		File file = new File(filePath);	
		
		
		writeToFile.openFile(file);
		writeToFile.createNSessions(limit);
		writeToFile.writeNSessions(limit);
		writeToFile.closeFile();
		
		readFromFile.openFileToRead(file);
		readFromFile.readFile();
		readFromFile.showScannedSessions();
		readFromFile.closeFileToRead();
		
		
	}

}

