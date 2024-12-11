package Assignement_3;
//Sports Tournament Organizer ⚽: Schedule matches, track scores, and standings.

//Abstract class representing a Team
abstract class Team {
 protected String name;
 protected int matchesPlayed;
 protected int wins;
 protected int losses;
 protected int draws;
 protected int points;

 // Constructor
 public Team(String name) {
     this.name = name;
     this.matchesPlayed = 0;
     this.wins = 0;
     this.losses = 0;
     this.draws = 0;
     this.points = 0;
 }

 // Abstract method to display team details
 public abstract void displayDetails();

 // Method to update match results
 public void updateResults(boolean win, boolean draw) {
     matchesPlayed++;
     if (win) {
         wins++;
         points += 3; // 3 points for a win
     } else if (draw) {
         draws++;
         points += 1; // 1 point for a draw
     } else {
         losses++;
     }
 }
}

//Concrete class representing a Football Team
class FootballTeam extends Team {
 private String coach;

 // Constructor
 public FootballTeam(String name, String coach) {
     super(name);
     this.coach = coach;
 }

 // Method to display team details
 @Override
 public void displayDetails() {
     System.out.println("Football Team: " + name);
     System.out.println("Coach: " + coach);
     System.out.println("Matches Played: " + matchesPlayed);
     System.out.println("Wins: " + wins);
     System.out.println("Losses: " + losses);
     System.out.println("Draws: " + draws);
     System.out.println("Points: " + points);
 }
}

//Class representing a Match
class Match {
 Team team1;
 Team team2;
 private int score1;
 private int score2;

 // Constructor
 public Match(Team team1, Team team2) {
     this.team1 = team1;
     this.team2 = team2;
     this.score1 = 0;
     this.score2 = 0;
 }

 // Method to set the score of the match
 public void setScore(int score1, int score2) {
     this.score1 = score1;
     this.score2 = score2;
     updateTeamResults();
 }

 // Method to update team results based on the match score
 private void updateTeamResults() {
     if (score1 > score2) {
         team1.updateResults(true, false);
         team2.updateResults(false, false);
     } else if (score1 < score2) {
         team1.updateResults(false, false);
         team2.updateResults(true, false);
     } else {
         team1.updateResults(false, true);
         team2.updateResults(false, true);
     }
 }

 // Method to display match details
 public void displayMatchDetails() {
     System.out.println("Match: " + team1.name + " vs " + team2.name);
     System.out.println("Score: " + score1 + " - " + score2);
 }
}

//Class representing the Tournament Organizer
class TournamentOrganizer {
 Match[] matches;
 private int matchCount;

 // Constructor
 public TournamentOrganizer(int capacity) {
     matches = new Match[capacity];
     matchCount = 0;
 }

 // Method to schedule a match
 public void scheduleMatch(Team team1, Team team2) {
     if (matchCount < matches.length) {
         matches[matchCount] = new Match(team1, team2);
         matchCount++;
         System.out.println("Match scheduled: " + team1.name + " vs " + team2.name);
     } else {
         System.out.println("Match schedule is full. Cannot schedule more matches.");
     }
 }

 // Method to display all matches
 public void displayMatches() {
     System.out.println("Scheduled Matches:");
     for (Match match : matches) {
         if (match != null) {
             match.displayMatchDetails();
             System.out.println();
         }
     }
 }

 // Method to display standings
 public void displayStandings() {
     System.out.println("Tournament Standings:");
     for (Match match : matches) {
         if (match != null) {
             match.team1.displayDetails();
             match.team2.displayDetails();
             System.out.println();
         }
     }
 }
}

//Main class to manage the sports tournament organizer
public class demo42 {
 public static void main(String[] args) {
     // Create an instance of the tournament organizer
     TournamentOrganizer organizer = new TournamentOrganizer(5); // Create football teams
     Team teamA = new FootballTeam("Team A", "Coach A");
     Team teamB = new FootballTeam("Team B", "Coach B");
     Team teamC = new FootballTeam("Team C", "Coach C");

     // Schedule matches
     organizer.scheduleMatch(teamA, teamB);
     organizer.scheduleMatch(teamB, teamC);
     organizer.scheduleMatch(teamA, teamC);

     // Set scores for the matches
     organizer.matches[0].setScore(2, 1); // Team A vs Team B
     organizer.matches[1].setScore(1, 1); // Team B vs Team C
     organizer.matches[2].setScore(3, 0); // Team A vs Team C

     // Display all matches
     organizer.displayMatches();

     // Display tournament standings
     organizer.displayStandings();
 }
}