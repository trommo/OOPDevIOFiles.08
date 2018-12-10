package info.sjd;

public class SessionData {
	private long sessionStartTime;
	private String sessionID;
	private String sessionIP;
	
	public long getSessionStartTime() {
		return sessionStartTime;
	}
	public void setSessionStartTime(long sessionStartTime) {
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
}
