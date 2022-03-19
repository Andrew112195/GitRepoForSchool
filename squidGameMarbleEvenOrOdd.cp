#include <iostream>
#include <string>
#include <vector>
using namespace std;

void DiffModifier(int diffChoice, int& marbleCountPlayer, int&      marbleCountCPU){
    if(diffChoice == 1 || diffChoice == 1){
      marbleCountPlayer = 20;
      marbleCountCPU = 10;
      }
    else if(diffChoice == 2 || diffChoice == 2){
      marbleCountPlayer = 20;
      marbleCountCPU = 20;
      }
    else if(diffChoice == 3 || diffChoice == 3){
      marbleCountPlayer = 10;
      marbleCountCPU = 20;
    }

      }
void DifficultyLoader(int marbleCountPlayer, int marbleCountCPU, vector<int>& CPUMarbles, vector<int>& playerMarbles ){
  for (int i=0; i < marbleCountCPU; ++i){
  CPUMarbles.push_back(0);
    }
  for (int i=0; i < marbleCountPlayer; ++i){
  playerMarbles.push_back(0);
    }
  cout << "Marbles Loaded" << endl;
  }
void PlayerTurn(vector <int> &CPUMarbles, vector <int> &playerMarbles){
  int playerChoice;
  int CPUChoice;
  int playerEvenOrOdd;
  srand((unsigned)time(0));
  if (playerMarbles.size() > CPUMarbles.size()){
     CPUChoice = (rand() % CPUMarbles.size());
  }
  else if (playerMarbles.size() <= CPUMarbles.size()){
     CPUChoice = (rand() % playerMarbles.size());
  }
  
  int CPUEvenOrOdd = CPUChoice % 2;
  do{ 
    cout << "It is your turn please choose: \n --- 0 for even --- \n --- 1 for odd ---" << endl;
    cin >> playerChoice;
    if(playerChoice == 0 || playerChoice == 1 ){
      break;
    }
    } 
    while(playerChoice != 1 || playerChoice != 0);
    cout << "Your opponent shows " << CPUChoice << " marbles"<< endl;
    playerEvenOrOdd = playerChoice % 2;
      if (playerEvenOrOdd == CPUEvenOrOdd){
        for(int i = 0; i < CPUChoice; ++ i){
          playerMarbles.push_back(0);
          CPUMarbles.pop_back();
        }
        cout << "Congratulations you were correct!!" << endl;
        cout << "Your opponent hands over: " << CPUChoice << " Marbles." << endl;
      }
      else if (playerEvenOrOdd != CPUEvenOrOdd){
        for(int i = 0; i < CPUChoice; ++ i){
          playerMarbles.pop_back();
          CPUMarbles.push_back(0);
        }
        cout << "Sorry you were incorrect!!" << endl;
        cout << "You hand over: " << CPUChoice << " Marbles." << endl;
      }
}
void CPUTurn(vector <int> &CPUMarbles, vector <int> &playerMarbles){
  string EvenOrOdd;
  int playerChoice;
  int playerEvenOrOdd;
  srand((unsigned)time(0));
  int CPUChoice = (rand() % playerMarbles.size());
  int CPUEvenOrOdd = CPUChoice % 2;
  if (CPUEvenOrOdd == 1){ 
    EvenOrOdd = "Odd";
  }
  else if (CPUEvenOrOdd == 0){
    EvenOrOdd = "Even";
  }
  do{ 
    cout << "It is your opponents turn to choose" << endl;
    cout << "please select an amount to wager" << endl;
    cin >> playerChoice;
    if(playerChoice > CPUMarbles.size()){
      cout << "Cannot wager amount larger than your opponent!!" << endl;
      continue;

    }
    if(playerChoice <= playerMarbles.size()){
      break;
    }
    } 
    while(playerChoice != playerMarbles.size());
    cout << "Your opponent guesses " << EvenOrOdd << " marbles"<< endl;
    playerEvenOrOdd = playerChoice % 2;
      if (playerEvenOrOdd != CPUEvenOrOdd){
        for(int i = 0; i < playerChoice; ++ i){
          playerMarbles.push_back(0);
          CPUMarbles.pop_back();
        }
        cout << "Your opponent guesses wrong!" << endl;
        cout << "Your opponent hands over: " << playerChoice << " Marbles." << endl;
      }
      else if (playerEvenOrOdd == CPUEvenOrOdd){
        for(int i = 0; i < playerChoice; ++ i){
          playerMarbles.pop_back();
          CPUMarbles.push_back(0);
        }
        cout << "Your opponent guesses correctly..." << endl;
        cout << "You hand over: " << playerChoice << " Marbles." << endl;
      }
}

int main (){
vector<int> CPUMarbles;
vector<int> playerMarbles;
int marbleCountPlayer;
int marbleCountCPU;
int diffChoicePlayer;
int diffChoiceCPU;
int diffChoice;
cout << "Please choose a difficulty level: 1 to 3.\n";
cout << "1: Player Starts with 20 oponent starts with 10\n";
cout << "2: Player Starts with 20 oponent starts with 20\n";
cout << "3: Player Starts with 10 oponent starts with 20\n";
cin >> diffChoice;
DiffModifier(diffChoice, marbleCountPlayer, marbleCountCPU);
DifficultyLoader( marbleCountPlayer, marbleCountCPU, CPUMarbles, playerMarbles);
cout << "Your opponent is given: " << CPUMarbles.size()  << " Marbles "<< endl;
cout << "You are given: " << playerMarbles.size() << " Marbles" << endl;
while(CPUMarbles.size() > 0 || playerMarbles.size() > 0){
  PlayerTurn(CPUMarbles, playerMarbles);
  cout << "You now have " << playerMarbles.size() << " marble(s)"<< endl << "They now have " <<   CPUMarbles.size() << endl;
  CPUTurn(CPUMarbles, playerMarbles);
  cout << "You now have " << playerMarbles.size() << " marble(s)"<< endl << "They now have " <<   CPUMarbles.size() << endl;
  if (playerMarbles.size()<= 0){
    cout << "Your opponent is eliminated!!" << endl;
    continue;
  }if (CPUMarbles.size()<= 0){
    cout << "You have been eliminated!!" << endl;
    continue;
  }
  continue;
}




return 0;
}