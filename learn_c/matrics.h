#include<stdio.h>

void readmat(int a[][10],int m,int n)
{
	int i,j;
	printf("Enter the number");
	for(i=0;i<m;i++)
		for(j=0;j<n;j++)
			scanf("%d",&a[i][j]);
}

void addmat(int a[][10],int b[][10],int c[][10],int m,int n)
{
	int i,j;
	for(i=0;i<m;i++)
                for(j=0;j<n;j++)
			c[i][j]=a[i][j]+b[i][j];

}

void printmat(int a[][10],int m, int n)
{
	int i,j;
	for(i=0;i<m;i++)
	{	for(j=0;j<n;j++)
			printf("%d",a[i][j]);
		printf("\n");
	}
}

