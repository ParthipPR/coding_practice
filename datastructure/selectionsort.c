#include<stdio.h>
#include<stdlib.h>

void swap(int A[],int i,int j)
{
	int t;
	t = A[i];
	A[i] = A[j];
	A[j] = t;
}



void selectionsort(int A[],int n)
{
	int i,j,k;
	for (i=1;i<=n-1;i++)
	{	k=i;
		for(j=i+1;j<=n;j++)
			if (A[j]<A[k])
				k=j;
		swap(A,i,k);
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
	printf("n = %d \n",n);
	
	selectionsort(A,n);
	printf("The sorted array is:");
	for (i=1;i<=n;i++)
		printf("%d ",A[i]);
	printf("\n");
}
