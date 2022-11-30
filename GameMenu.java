


import javax.swing.JOptionPane;


public class GameMenu {
  	
	private int menuChoice;
	
	GameMenu(){
	}
	
	public Game displayMenu(Game game, Player[] players, GameDriverForm gameScreen){
	String  optionS;
        
        
        do{
            
            optionS = JOptionPane.showInputDialog("Please select an option to continue.."
				+ "\n 1: Play Game."
				+ "\n 2: Show Game Rules."
				+ "\n 3: Show Statistics."
				+ "\n 4: Exit.");
            
           if ( optionS == null)
                    System.exit(0);
            
            while(!optionS.matches("[0-9]+"))
                
            {
               JOptionPane.showMessageDialog(null, "Please enter only numbers");
               
                optionS = JOptionPane.showInputDialog("Please select an option to continue.."
				+ "\n 1: Play game."
				+ "\n 2: Show Game Rules."
				+ "\n 3: Show Stastics."
				+ "\n 4: Exit.");
                
               if ( optionS == null)
                    System.exit(0);

            }		
                     
            menuChoice = Integer.parseInt(optionS);
           
          }while (menuChoice < 1 || menuChoice > 4); 
        
          switch(menuChoice){
                case 1:
                    
                    game = new Game(players);
                    game.generateComputerPlay();
                    gameScreen.setLocationRelativeTo(null);
                    gameScreen.enablePlayer1Buttons();
                    gameScreen.resetControls();
                    gameScreen.setVisible(true);
                    
                    JOptionPane.showMessageDialog(null, "Round # " + Integer.toString(game.getRound()));
                    
                    break;
                case 2:
                    String[] options = {"Menu"};
                    int res =JOptionPane.showOptionDialog(null, game.displayRules(),
                            "Game Rules",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                   
                    game = displayMenu(game, players, gameScreen);
                    break;
                case 3:
                    String[] option = {"Menu"};

                    JOptionPane.showOptionDialog(null, players[0].getPlayerStats().printResults(game.getPlayers()[0]) + "\n\n" + players[1].getPlayerStats().printResults(game.getPlayers()[1]) + "\n\n"
                    + players[0].getPlayerStats().overallGameHumanWinner(game.getPlayers()[0], game.getPlayers()[1]),
                    "Game Statistics",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
                     game = displayMenu(game, players, gameScreen);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Goodbye!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Option");
                    break;
                                                               
            }
       
        
       return game;
    
    }
        
  
    public int menuSelection() {

        return menuChoice;
    }
}


