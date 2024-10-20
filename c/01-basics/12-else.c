#include <stdio.h>

int main() {
  int myNum = 10;
  
  if (myNum > 0) {
    printf("The value is a positive number.\n");
  } else {
    printf("The value is 0./n");
  }
  
  (myNum > 0) ? printf("The value is a positive number./n") : printf("The value is 0./n");
  return 0;
}


