
public class Statistics {

	public String[] wlt = new String[] {"Win", "Loss", "Tie"};
	private int[] gameStats;
	private int[] roundStats;
        private int[] roundStatsTemp;
	
	public Statistics() {
		
		this.gameStats = new int[] {0, 0, 0};
		this.roundStats = new int[] {0, 0, 0};
                this.roundStatsTemp = new int[] {0, 0, 0};
	}
	
	public void assignGameWLT(int indexToIncrement) {
		this.gameStats[indexToIncrement]++;
	}
	
	public void assignRoundWLT(int indexToIncrement) {
		this.roundStatsTemp[indexToIncrement]++;
	}
        
        public void resetRoundStatsTemp()
        {
           this.roundStatsTemp = new int[] {0, 0, 0};
        }
	
	public String gamesAsString() {
                String res = "Games: ";
		for(int i = 0; i < gameStats.length; i++) {
			res+= wlt[i] +":"+ gameStats[i] + " ";
		}
                
                
               return res;
		
	}
	
	public String roundsAsString() {
                String res = "Rounds: ";
		for(int i = 0; i < roundStats.length; i++) {
	           res += wlt[i] +":"+ roundStats[i] + " ";      
		}
           return res;
		
	}

	public void updateRoundRecords() {
		for(int i = 0; i < 3; i++) {
			
			this.roundStats[i] += roundStatsTemp[i];
		}
                
                resetRoundStatsTemp();
	}
	
	public int gameRecordAt(int index) {
		return gameStats[index];
	}
	
	public int roundRecordAt(int index) {
		return roundStatsTemp[index];
	}
	
	public String printResults(Player player) {
          
            String res = player.getName() + "\n" + player.getPlayerStats().roundsAsString() + "\n"
                    + player.getPlayerStats().gamesAsString();
            
            return res;
                    
	}
        
        public String overallGameHumanWinner(Player player1, Player player2)
        {   String res = "";
            if ((player1.getPlayerStats().gameStats[0] > player2.getPlayerStats().gameStats[0])|| (player1.getPlayerStats().gameStats[1] < player2.getPlayerStats().gameStats[1])){
             res = "The overall human winner is: " + player1.getName();
            }
            else if ((player2.getPlayerStats().gameStats[0] > player1.getPlayerStats().gameStats[0])|| (player2.getPlayerStats().gameStats[1] < player1.getPlayerStats().gameStats[1])){
             res = "The overall human winner is: " + player2.getName();
            }
            else{
              res = "The overall human winner is: There is a tie";
            }
            
            return res;
        }
    
}
