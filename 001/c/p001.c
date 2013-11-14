#include <stdio.h>

int const NUM=1000;

int main(){
  int sum=0;
  for(int i=0; i<NUM;i++){
    if(!(i%3) || !(i%5)){
      sum += i;
    }
  }
  printf("%d",sum);
  return 0;
}
