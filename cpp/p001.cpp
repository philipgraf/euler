#include <iostream>

using namespace std;

int main(){
  int sum=0;
  for(int i=0; i<1000; i++){
    if(!(i%3)||!(i%5)){
      sum += i;
    }
  }
  cout << sum << endl;
  return 0;
}
