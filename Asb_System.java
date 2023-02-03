package asb_system;

import java.util.Random;

public class Asb_System {
	
	public void system_on() {
		Random rand = new Random();
		Team team1 = new Team("HTU",rand.nextInt(1000),rand.nextInt(11),rand.nextInt(301));
		Team team2 = new Team("ju",rand.nextInt(1000),rand.nextInt(11),rand.nextInt(301));
		Team team3 = new Team("gju",rand.nextInt(1000),rand.nextInt(11),rand.nextInt(301));
		Team team4 = new Team("uop",rand.nextInt(1000),rand.nextInt(11),rand.nextInt(301));
		Team team5 = new Team("hu",rand.nextInt(1000),rand.nextInt(11),rand.nextInt(301));
		Team team6 = new Team("tju",rand.nextInt(1000),rand.nextInt(11),rand.nextInt(301));
		Team team7 = new Team("zju",rand.nextInt(1000),rand.nextInt(11),rand.nextInt(301));
		Team team8 = new Team("tu",rand.nextInt(1000),rand.nextInt(11),rand.nextInt(301));
		Team team9 = new Team("iju",rand.nextInt(1000),rand.nextInt(11),rand.nextInt(301));
		Team team10 = new Team("harvard",rand.nextInt(1000),rand.nextInt(11),rand.nextInt(301));
		Team[] arrayOfTeams = {team1,team2,team3,team4,team5,team6,team7,team8,team9,team10};
		
		for (int i = 0; i < arrayOfTeams.length-1; i++) {
			if (arrayOfTeams[i].getQsolved() > arrayOfTeams[i+1].getQsolved()) {
				arrayOfTeams[i] = arrayOfTeams[i+1];
			}
		}
		
		for (int i = 0; i < arrayOfTeams.length-1; i++) {
			if (arrayOfTeams[i].getTelapsed() > arrayOfTeams[i+1].getTelapsed()) {
				arrayOfTeams[i] = arrayOfTeams[i+1];
			}
		}
		
		for (int i = 0; i < arrayOfTeams.length; i++) {
			System.out.println("questions solved " +arrayOfTeams[i].getQsolved() + " time elapsed " + arrayOfTeams[i].getTelapsed() + " team id " + arrayOfTeams[i].getID() + " team university "+ arrayOfTeams[i].getUniversity());
		}
	}


}
