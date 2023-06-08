#include<stdio.h>

void main()
{
    int n,s=0;
    while(1)
    {
        printf("enter the no");
        scanf("%d",&n);
        if(n<0)
            break;
        s+=n;
    }
    printf("%d",s);
}
