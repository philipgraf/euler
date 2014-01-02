#include <stdio.h>

int main(){
	
	int a=0,b=0,i;

	for(i = 1; i<= 100; i++){
		a += i*i;
		b += i;
	}

	b= b*b;

	printf("a: %d, b: %d, dif: %d", a,b,b-a);

	return 0;
}
