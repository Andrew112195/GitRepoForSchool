

import javax.swing.JOptionPane;
import javax.swing.*;


public class GameDriverForm extends JFrame  {
    
   
    private static Player player1;
    private static Player player2;
    final static int PLAYER_AMOUNT = 2;
    public static Player[] players = new Player[PLAYER_AMOUNT];       
    private static GameMenu menu = new GameMenu();
    private static Game game;
    private static GameDriverForm gameScreen;
    
    private final ImageIcon rockImage;
    private final ImageIcon paperImage;
    private final ImageIcon scissorsImage;
    private final ImageIcon sawImage;
    
    private static int selectionMenu;
    private static String ResultPlayerPc; 
  

    public GameDriverForm() {
        initComponents();
        panelPlayer1Title.setText(game.getPlayer(0).getName() + " selects your weapon");
        panelPlayer2Title.setText(game.getPlayer(1).getName() + " selects your weapon");
        unenablePlayer2Buttons();
        rockImage = new ImageIcon("src/images/rock.png");
        paperImage = new ImageIcon("src/images/paper.png");
        scissorsImage = new ImageIcon("src/images/scissors.png");
        sawImage = new ImageIcon("src/images/hand-saw.png");
        newRoundButton.setEnabled(false);      
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        player2WeaponsPanel = new javax.swing.JPanel();
        panelPlayer2Title = new javax.swing.JLabel();
        rockP2btn = new javax.swing.JButton();
        paperP2Btn = new javax.swing.JButton();
        scissorsP2Btn = new javax.swing.JButton();
        sawP2Btn = new javax.swing.JButton();
        computerChoiceLabel = new javax.swing.JLabel();
        player1ChoiceLabel = new javax.swing.JLabel();
        player2ChoiceLabel = new javax.swing.JLabel();
        Player1WeaponsPanel = new javax.swing.JPanel();
        rockP1Btn = new javax.swing.JButton();
        paperP1Btn = new javax.swing.JButton();
        sawP1Btn = new javax.swing.JButton();
        scissorsP1Btn = new javax.swing.JButton();
        panelPlayer1Title = new javax.swing.JLabel();
        newRoundButton = new javax.swing.JButton();
        p1TitleChoiceLabel = new javax.swing.JLabel();
        p2TitleChoiceLabel = new javax.swing.JLabel();
        pcTitleChoiceLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        resultP1PCLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        resultP2PCLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        player2WeaponsPanel.setBackground(new java.awt.Color(255, 255, 255));

        panelPlayer2Title.setText("Player 2 selects your weapon");

        rockP2btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rock.png"))); // NOI18N
        rockP2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockP2btnActionPerformed(evt);
            }
        });

        paperP2Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paper.png"))); // NOI18N
        paperP2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperP2BtnActionPerformed(evt);
            }
        });

        scissorsP2Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scissors.png"))); // NOI18N
        scissorsP2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissorsP2BtnActionPerformed(evt);
            }
        });

        sawP2Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hand-saw.png"))); // NOI18N
        sawP2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sawP2BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout player2WeaponsPanelLayout = new javax.swing.GroupLayout(player2WeaponsPanel);
        player2WeaponsPanel.setLayout(player2WeaponsPanelLayout);
        player2WeaponsPanelLayout.setHorizontalGroup(
            player2WeaponsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(player2WeaponsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(player2WeaponsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPlayer2Title)
                    .addGroup(player2WeaponsPanelLayout.createSequentialGroup()
                        .addComponent(rockP2btn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(paperP2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scissorsP2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sawP2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        player2WeaponsPanelLayout.setVerticalGroup(
            player2WeaponsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(player2WeaponsPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(panelPlayer2Title)
                .addGap(29, 29, 29)
                .addGroup(player2WeaponsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paperP2Btn)
                    .addComponent(scissorsP2Btn)
                    .addComponent(sawP2Btn)
                    .addComponent(rockP2btn))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Player1WeaponsPanel.setBackground(new java.awt.Color(255, 255, 255));

        rockP1Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rock.png"))); // NOI18N
        rockP1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockP1BtnActionPerformed(evt);
            }
        });

        paperP1Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paper.png"))); // NOI18N
        paperP1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperP1BtnActionPerformed(evt);
            }
        });

        sawP1Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hand-saw.png"))); // NOI18N
        sawP1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sawP1BtnActionPerformed(evt);
            }
        });

        scissorsP1Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scissors.png"))); // NOI18N
        scissorsP1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissorsP1BtnActionPerformed(evt);
            }
        });

        panelPlayer1Title.setText("Player 1 selects your Weapon");

        javax.swing.GroupLayout Player1WeaponsPanelLayout = new javax.swing.GroupLayout(Player1WeaponsPanel);
        Player1WeaponsPanel.setLayout(Player1WeaponsPanelLayout);
        Player1WeaponsPanelLayout.setHorizontalGroup(
            Player1WeaponsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player1WeaponsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Player1WeaponsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Player1WeaponsPanelLayout.createSequentialGroup()
                        .addComponent(rockP1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(paperP1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scissorsP1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sawP1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelPlayer1Title))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Player1WeaponsPanelLayout.setVerticalGroup(
            Player1WeaponsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player1WeaponsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panelPlayer1Title)
                .addGap(36, 36, 36)
                .addGroup(Player1WeaponsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paperP1Btn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scissorsP1Btn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sawP1Btn)
                    .addComponent(rockP1Btn))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        newRoundButton.setText("New Round");
        newRoundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRoundButtonActionPerformed(evt);
            }
        });

        p1TitleChoiceLabel.setText("Player1 choice:");

        p2TitleChoiceLabel.setText("Player2 choice:");

        pcTitleChoiceLabel1.setText("Computer choice:");

        jLabel1.setText("Round results:");

        jLabel2.setText("Round results:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(newRoundButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Player1WeaponsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(player2WeaponsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(p1TitleChoiceLabel)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(player1ChoiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(p2TitleChoiceLabel)
                                            .addComponent(jLabel2)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(resultP1PCLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(210, 210, 210)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(player2ChoiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resultP2PCLabel))
                                .addGap(146, 146, 146)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(computerChoiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pcTitleChoiceLabel1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(pcTitleChoiceLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(computerChoiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(p2TitleChoiceLabel)
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(p1TitleChoiceLabel)
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(resultP1PCLabel)
                                    .addComponent(jLabel2)
                                    .addComponent(resultP2PCLabel))
                                .addGap(29, 29, 29))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(player2ChoiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player1ChoiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Player1WeaponsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player2WeaponsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(newRoundButton)
                .addGap(84, 84, 84))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rockP1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockP1BtnActionPerformed
      player1ChoiceLabel.setIcon(rockImage);
      game.assignPlayerWeapon(0, new Weapon(0));
       unenablePlayer1Buttons();
       enablePlayer2Buttons();
    }//GEN-LAST:event_rockP1BtnActionPerformed

    private void paperP1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperP1BtnActionPerformed
       player1ChoiceLabel.setIcon(paperImage);
       game.assignPlayerWeapon(0, new Weapon(1));
       unenablePlayer1Buttons();
       enablePlayer2Buttons();
    }//GEN-LAST:event_paperP1BtnActionPerformed

    private void scissorsP1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scissorsP1BtnActionPerformed
        player1ChoiceLabel.setIcon(scissorsImage);
        game.assignPlayerWeapon(0, new Weapon(2));
        unenablePlayer1Buttons();
        enablePlayer2Buttons();
    }//GEN-LAST:event_scissorsP1BtnActionPerformed

    private void sawP1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sawP1BtnActionPerformed
        player1ChoiceLabel.setIcon(sawImage);
        game.assignPlayerWeapon(0, new Weapon(3));
        unenablePlayer1Buttons();
        enablePlayer2Buttons();
    }//GEN-LAST:event_sawP1BtnActionPerformed

    private void rockP2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockP2btnActionPerformed
        game.assignPlayerWeapon(1, new Weapon(0));
        player2ChoiceLabel.setIcon(rockImage);
        showPCSelection();
        showRoundWinners();
        unenablePlayer2Buttons();
        
    }//GEN-LAST:event_rockP2btnActionPerformed

    private void paperP2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperP2BtnActionPerformed
        game.assignPlayerWeapon(1, new Weapon(1));
        player2ChoiceLabel.setIcon(paperImage);
        showPCSelection();
        unenablePlayer2Buttons();
        showRoundWinners();
    }//GEN-LAST:event_paperP2BtnActionPerformed

    private void scissorsP2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scissorsP2BtnActionPerformed
        game.assignPlayerWeapon(1, new Weapon(2));
        player2ChoiceLabel.setIcon(scissorsImage);
        showPCSelection();
        unenablePlayer2Buttons();
        showRoundWinners();
    }//GEN-LAST:event_scissorsP2BtnActionPerformed

    private void sawP2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sawP2BtnActionPerformed
        game.assignPlayerWeapon(1, new Weapon(3));
        player2ChoiceLabel.setIcon(sawImage);
        showPCSelection();
        unenablePlayer2Buttons();
        showRoundWinners();
    }//GEN-LAST:event_sawP2BtnActionPerformed

    private void newRoundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRoundButtonActionPerformed

        if (game.getRound() == game.getROUNDS_PER_GAME()) {            
            String[] options = {"Menu"};
          //  JOptionPane.showOptionDialog(null, game.gameWinners(player1, player2),
              JOptionPane.showOptionDialog(null, game.gameWinners(game.getPlayer(0), game.getPlayer(1)),
                    "Winners of the Game",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
              game.getPlayer(0).getPlayerStats().updateRoundRecords();
              game.getPlayer(1).getPlayerStats().updateRoundRecords();
              
            
           gameScreen.setVisible(false);
           displayMenu();
        } else {
            game.generateComputerPlay();
            enablePlayer1Buttons();
            resetControls();
            game.incrementRound();
            JOptionPane.showMessageDialog(null, "Round # " + Integer.toString(game.getRound()));
                       
        }  
    }//GEN-LAST:event_newRoundButtonActionPerformed

    //Show the images of the PCWeapon
    public void showPCSelection() {
        if (game.getCPUWeapon().getWeaponType().equals("Rock")) {
            computerChoiceLabel.setIcon(rockImage);
        } else if (game.getCPUWeapon().getWeaponType().equals("Paper")) {
            computerChoiceLabel.setIcon(paperImage);
        } else if (game.getCPUWeapon().getWeaponType().equals("Scissors")) {
            computerChoiceLabel.setIcon(scissorsImage);
        } else if (game.getCPUWeapon().getWeaponType().equals("Saw")) {
            computerChoiceLabel.setIcon(sawImage);
        }
    }
    
    
    //Show the winners of each round
    public void showRoundWinners()
    {
       for(int i= 0; i< players.length; i++)
        {
           ResultPlayerPc = game.showDown(players[i], game.getPlayerWeapon(i), game.getCPUWeapon(), i);
           if (i==0) resultP1PCLabel.setText(ResultPlayerPc);
           if (i==1) resultP2PCLabel.setText(ResultPlayerPc);
             
        }
    }
    
    //Clean the control after each round
    public void resetControls(){
        computerChoiceLabel.setIcon(null);
        player1ChoiceLabel.setIcon(null);
        player2ChoiceLabel.setIcon(null);
        resultP1PCLabel.setText("");
        resultP2PCLabel.setText("");
    }
    
    public void unenablePlayer1Buttons(){
      rockP1Btn.setEnabled(false);
      paperP1Btn.setEnabled(false);
      scissorsP1Btn.setEnabled(false);
      sawP1Btn.setEnabled(false);
      
    }
    
     public void enablePlayer1Buttons(){
      rockP1Btn.setEnabled(true);
      paperP1Btn.setEnabled(true);
      scissorsP1Btn.setEnabled(true);
      sawP1Btn.setEnabled(true);
      newRoundButton.setEnabled(false);
    }
    
    
     private void unenablePlayer2Buttons(){
      rockP2btn.setEnabled(false);
      paperP2Btn.setEnabled(false);
      scissorsP2Btn.setEnabled(false);
      sawP2Btn.setEnabled(false);
      newRoundButton.setEnabled(true);
    }
     
     public void enablePlayer2Buttons(){
      rockP2btn.setEnabled(true);
      paperP2Btn.setEnabled(true);
      scissorsP2Btn.setEnabled(true);
      sawP2Btn.setEnabled(true);
    }
     
    public static void displayMenu(){
    
         selectionMenu = menu.displayMenu();
          if(selectionMenu == 1)
       {  
          // create an instance of Game and start the game when user selects that option
          game = new Game(players);
          gameScreen = new GameDriverForm();
          gameScreen.setLocationRelativeTo(null);
          gameScreen.setVisible(true);
          game.generateComputerPlay();
          JOptionPane.showMessageDialog(null, "Round # " + Integer.toString(game.getRound()));
          
       }
        if (selectionMenu == 2) {
            String[] options = {"Menu"};
            JOptionPane.showOptionDialog(null, game.displayRules(),
                    "Game Rules",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
           displayMenu();

        }
        
        if (selectionMenu == 3) {
           String[] options = {"Menu"};
            JOptionPane.showOptionDialog(null, players[0].getPlayerStats().printResults(player1) + "\n\n" + players[1].getPlayerStats().printResults(player2) + "\n\n"
                    + players[0].getPlayerStats().overallGameHumanWinner(player1, player2),
                    "Game Statistics",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
           displayMenu();      
        }
    }

    public static void main(String args[]) {
          
        //Prompt user for names of human players
        String player1Name = JOptionPane.showInputDialog(null, "What is the name of the first Player?" );
        if (player1Name != null) {
            while (player1Name.length() < 5 || player1Name.length() > 20) {
                JOptionPane.showMessageDialog(null, player1Name + " is an Invalid Name. The name should have more than 5 characters and less than 20 characters");
                player1Name = JOptionPane.showInputDialog(null, "What is the name of the first Player?");
                if (player1Name == null)
                    System.exit(0);
            }
        } else {
            System.exit(0);
        }
        
      
        String player2Name = JOptionPane.showInputDialog("What is the name of the second Player?");

        if (player2Name != null) {
            while (player2Name.length() < 5 || player2Name.length() > 20 || player1Name.equals(player2Name)) {
                
                if (player2Name.length() < 5 || player2Name.length() > 20) {
                    JOptionPane.showMessageDialog(null, player2Name + " is an Invalid Name. The name should have more than 5 characters and less than 20 characters");
                    player2Name = JOptionPane.showInputDialog("What is the name of the second Player?");
                    if (player2Name == null)
                    System.exit(0);
                }

                if (player1Name.equals(player2Name)) {
                    JOptionPane.showMessageDialog(null, "Player1 and Player 2 have the same name. Please enter another name for player 2");
                    player2Name = JOptionPane.showInputDialog("What is the name of the second Player?");
                    if (player2Name == null)
                    System.exit(0);
                }
            }

        } else {
            System.exit(0);
        }
        
        //Create instances of the players and initialize them
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
        
        //Store players in an array
        players[0] = player1;
        players[1] = player2;
       
     
       game = new Game(players);
       
       //display Menu
       displayMenu();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Player1WeaponsPanel;
    private javax.swing.JLabel computerChoiceLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton newRoundButton;
    private javax.swing.JLabel p1TitleChoiceLabel;
    private javax.swing.JLabel p2TitleChoiceLabel;
    private javax.swing.JLabel panelPlayer1Title;
    private javax.swing.JLabel panelPlayer2Title;
    private javax.swing.JButton paperP1Btn;
    private javax.swing.JButton paperP2Btn;
    private javax.swing.JLabel pcTitleChoiceLabel1;
    private javax.swing.JLabel player1ChoiceLabel;
    private javax.swing.JLabel player2ChoiceLabel;
    private javax.swing.JPanel player2WeaponsPanel;
    private javax.swing.JLabel resultP1PCLabel;
    private javax.swing.JLabel resultP2PCLabel;
    private javax.swing.JButton rockP1Btn;
    private javax.swing.JButton rockP2btn;
    private javax.swing.JButton sawP1Btn;
    private javax.swing.JButton sawP2Btn;
    private javax.swing.JButton scissorsP1Btn;
    private javax.swing.JButton scissorsP2Btn;
    // End of variables declaration//GEN-END:variables
}
