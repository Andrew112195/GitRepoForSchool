

import javax.swing.JOptionPane;


public class GameMenu {
  	
	private int menuChoice;
	
	GameMenu(){
	}
	
	public int displayMenu(){
	String  optionS;
        int menuChoice;
        
        do{
            
            optionS = JOptionPane.showInputDialog("Please select an option to continue.."
				+ "\n 1: Play game."
				+ "\n 2: Show Game Rules."
				+ "\n 3: Show Stastics."
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
            
            switch(menuChoice){
                case 1:  
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Goodbye!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Option");
                    break;
                                                               
            }
        }while (menuChoice < 1 || menuChoice > 4);
        
        return menuChoice;
        
	}
	
    public int menuSelection() {

        return menuChoice;
    }
}


