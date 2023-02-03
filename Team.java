package asb_system;

public class Team {
	private String university;
	private int ID;
	private int qsolved;
	private int telapsed;
	public Team() {
	
	}
	public Team(String university, int iD, int qsolved, int telapsed) {
		
		this.university = university;
		ID = iD;
		this.qsolved = qsolved;
		this.telapsed = telapsed;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getQsolved() {
		return qsolved;
	}
	public void setQsolved(int qsolved) {
		this.qsolved = qsolved;
	}
	public int getTelapsed() {
		return telapsed;
	}
	public void setTelapsed(int telapsed) {
		this.telapsed = telapsed;
	}
	
	
	



}
