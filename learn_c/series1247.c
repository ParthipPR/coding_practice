#include<stdio.h>

void main()
{
	int i,n,c;
	printf("Enter the lenght of series:");
	scanf("%d",&n);
	for(i=0,c=1;i<n;c+=i,i++)
		printf("%d\n",c);
}
