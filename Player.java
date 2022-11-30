
public class Player {

    private String playerName;

    private Statistics playerStats = new Statistics();

    public Player(String name) {
        this.playerName = name;
      
    }

    public void setName(String name) {
        this.playerName = name;
    }

    public String getName() {
        return playerName;
    }

    public Statistics getPlayerStats() {

        return playerStats;
    }

}
