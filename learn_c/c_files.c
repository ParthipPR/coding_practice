#include <stdlib.h>
#include <stdio.h>
int main()
{   int num;   FILE *fp; 
   fp = fopen("my.txt","w");  
   if(fp == NULL) 
      {      printf("Error!");     
             exit(1);         
       } 
  fprintf(fp,"%s","My first text file");  
  fclose(fp); 
  return 0;
}
