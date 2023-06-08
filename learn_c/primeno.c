#include<stdio.h>

void main()
{
    int n,i,p;
    i=2;
    p=1;
    printf("Enter the no:");
    scanf("%d",&n);
    while(i<n)
    {
        if(n%i==0)
        {
            p=0;
            break;
        }
        i+=1;
    }
    if(p==1)
        printf("the number entered is prime\n");
    else
        printf("the number is not prime\n");

}
