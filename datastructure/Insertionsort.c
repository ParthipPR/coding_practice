#include<stdio.h>
#include<stdlib.h>


void insertionsort(int A[],int n)
{
	int i,j,x;
	for (i=2;i<=n;i++)
	{	x=A[i];
		for(j=i-1;j>=1;j--)
			if (x<A[j])
				A[j+1]=A[j];
			else
				break;
		A[j+1]=x;
	}

}

int main(int argc , char* argv[])
{	
	int i,A[100],n;
	for (i=1;i<argc;i++)
	{
		A[i]=atoi(argv[i]);
		
	}
	n=argc-1;
	
	insertionsort(A,n);
	printf("The sorted array is:");
	for (i=1;i<=n;i++)
		printf("%d ",A[i]);
	printf("\n");
}
