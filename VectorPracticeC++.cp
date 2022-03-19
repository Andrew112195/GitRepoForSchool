#include <iostream>
#include <vector>
using namespace std;

int main() {
int i;
float userInput;
float weightSum = 0.0;
float weightAvg = 0.0;
float weightMax = 0.0;
vector<float> peopleWeights;
for(i=0;i<5;++i){
  cout << "Enter weight " << i+1 << ":" << endl;
  cin >> userInput;
  peopleWeights.push_back(userInput);
  weightSum += userInput; 
}
cout << "You entered: "; 
for(i=0;i<5;++i){
  cout << peopleWeights.at(i) << " ";
}
cout << endl << endl;
 for(i=0;i<4;++i){
    if(peopleWeights.at(i) > peopleWeights.at(i+1)){
      weightMax = peopleWeights.at(i);
    
}
}
if(weightMax < peopleWeights.back()){
  weightMax = peopleWeights.back();
}
if(weightMax < peopleWeights.at(0)){
  weightMax = peopleWeights.at(0);
}
weightAvg = weightSum / peopleWeights.size();
cout << "Total weight: " << weightSum << endl;
cout << "Average weight: " << weightAvg << endl;
cout << "Max weight: " << weightMax << endl;
    return 0;
}