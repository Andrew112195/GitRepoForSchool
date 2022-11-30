
import java.util.Random;

public class Game {

    private int round = 1;
    private Player[] players;                         // array holding both player objects
    private Weapon CPUWeapon;
    private Weapon[] playersWeapon = new Weapon[2];   //array holding both weapon objects	
    private final int ROUNDS_PER_GAME = 3;

    Game(Player[] players) {
        this.players = players;
    }

    public int getRound() {
        return round;
    }

    public void incrementRound() {
        round += 1;
    }

    public Weapon getCPUWeapon() {
        return CPUWeapon;
    }

    public int getROUNDS_PER_GAME() {
        return ROUNDS_PER_GAME;
    }

    public void generateComputerPlay() {
        Random generator = new Random();
        int playComputerInt = generator.nextInt(4);
        CPUWeapon = new Weapon(playComputerInt);
    }

    public String displayRules() {

        String rules
                = "1- Rock wins over Scissors and Saw, but loses against Paper. \n"
                + "2- Scissors win over Paper., but loses against Rock and Saw. \n"
                + "3- Paper wins over Rock, but loses against Scissors and Saw. \n"
                + "4- Saw wins over Scissors and Paper, but loses against Rock.\n"
                + "5- If player and computer make the same selection, there is a tie. \n"
                + "6- Winner of the game against the computer is one who won more rounds.  \n\n";

        return rules;

    }

// takes in weapon objects and the players index for adding a win loss or tie after comparison // can add round winner prompts to gui
    public String showDown(Player player, Weapon playersWeapon, Weapon CPUWeapon, int j) {

        String pWep = playersWeapon.getWeaponType();
        String cWep = CPUWeapon.getWeaponType();
        String res = "";

        if (cWep == pWep) {
            player.getPlayerStats().assignRoundWLT(2);
            res = "There is a tied";

        } else if (pWep == "Rock") {
            if (cWep == "Scissors" || cWep == "Saw") {
                player.getPlayerStats().assignRoundWLT(0);
                res = "You Win " + player.getName();
            } else if (cWep == "Paper") {
                player.getPlayerStats().assignRoundWLT(1);
                res = "You Lose " + player.getName();
            }
        } else if (pWep == "Scissors") {
            if (cWep == "Paper") {
                player.getPlayerStats().assignRoundWLT(0);

                res = "You Win " + player.getName();
            } else if (cWep == "Rock" || cWep == "Saw") {
                player.getPlayerStats().assignRoundWLT(1);
                res = "You Lose " + player.getName();
            }
        } else if (pWep == "Paper") {
            if (cWep == "Rock") {
                player.getPlayerStats().assignRoundWLT(0);
                res = "You Win " + player.getName();
            } else if (cWep == "Scissors" || cWep == "Saw") {
                player.getPlayerStats().assignRoundWLT(1);
                res = "You Lose " + player.getName();
            }
        } else if (pWep == "Saw") {
            if (cWep == "Scissors" || cWep == "Paper") {
                player.getPlayerStats().assignRoundWLT(0);
                res = "You Win " + player.getName();
            } else if (cWep == "Rock") {
                player.getPlayerStats().assignRoundWLT(1);
                res = "You Lose " + player.getName();
            }
        }

        return res;
    }

    public String gameWinners(Player player1, Player player2) {
        String res = "";
        if (player1.getPlayerStats().roundRecordAt(0) > player1.getPlayerStats().roundRecordAt(1)) {
            res = player1.getName() + " won the game against the computer! \n";
            player1.getPlayerStats().assignGameWLT(0);

        } else if (player1.getPlayerStats().roundRecordAt(0) < player1.getPlayerStats().roundRecordAt(1)) {
            res = player1.getName() + " lost the game against the computer! \n";
            player1.getPlayerStats().assignGameWLT(1);

        } else if ((player1.getPlayerStats().roundRecordAt(0) == player1.getPlayerStats().roundRecordAt(1)) && (player1.getPlayerStats().roundRecordAt(1) == player1.getPlayerStats().roundRecordAt(2))) {
            res = player1.getName() + " tied the game against the computer! \n";
            player1.getPlayerStats().assignGameWLT(2);
        }

        if (player2.getPlayerStats().roundRecordAt(0) > player2.getPlayerStats().roundRecordAt(1)) {
            res += player2.getName() + " won the game against the computer! \n";
            player2.getPlayerStats().assignGameWLT(0);

        } else if (player2.getPlayerStats().roundRecordAt(0) < player2.getPlayerStats().roundRecordAt(1)) {
            res += player2.getName() + " lost the game against the computer! \n";
            player2.getPlayerStats().assignGameWLT(1);

        } else if ((player2.getPlayerStats().roundRecordAt(0) == player2.getPlayerStats().roundRecordAt(1)) && (player2.getPlayerStats().roundRecordAt(1) == player2.getPlayerStats().roundRecordAt(2))) {
            res += player2.getName() + " tied the game against the computer! \n";
            player2.getPlayerStats().assignGameWLT(2);
        }

        return res;
    }

    public Weapon getPlayerWeapon(int playerIndex) {
        return playersWeapon[playerIndex];
    }

    public Player getPlayer(int playerIndex) {
        return players[playerIndex];
    }

    public void assignPlayerWeapon(int player, Weapon weapon) {
        this.playersWeapon[player] = weapon;
    }

}
