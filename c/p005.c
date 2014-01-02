#include <stdio.h>

#define NUM 20

int main(){
  
  int i,j;

  for(i=0;;i+=NUM){
    int err=0;
    for(j=NUM;j>=NUM/2;j--){
      if(i%j){
        err=1;
        break;
      }
    }
    if(!err && i!=0){
      break;
    }
  }
  
  printf("%d\n",i);

  return 0;
}
