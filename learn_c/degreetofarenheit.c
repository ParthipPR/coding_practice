#include<stdio.h>

void main()
{
    float f,d;
    printf("Enter the temp in farenheit:");
    scanf("%d",&f);
    d = (5/9)*(f-32);
    printf("temp in degree:%f",d);
}
