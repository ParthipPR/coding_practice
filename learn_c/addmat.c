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
        {       for(j=0;j<n;j++)
                        printf("%d",a[i][j]);
                printf("\n");
        }
}
void main()
{
	int m,n,a[10][10],b[10][10],c[10][10];
	printf("Enter the order of matrics");
	scanf("%d%d",&m,&n);
	readmat(a[10][10],m,n);
	readmat(b[10][10],m,n);
	addmat(a[10][10],b[10][10],c[10][10],m,n);
	printmat(c[10][10],m,n);
}
