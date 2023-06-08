#include<stdio.h>
#include<stdlib.h>

void swap(int A[],int i,int j)
{
	int t;
	t = A[i];
	A[i] = A[j];
	A[j] = t;
}



void interchangesort(int A[],int n)
{
	int i,j;
	for (i=1;i<n;i++)
		for(j=i+1;j<n;j++)
			if (A[i]>A[j])
				swap(A,i,j);

}

int main(int argc , char* argv[])
{	
	int i,A[100],n;
	for (i=1;i<argc;i++)
	{
		A[i]=atoi(argv[i]);
		
	}
	n=argc;
	
	interchangesort(A,n);
	printf("The sorted array is:");
	for (i=1;i<n;i++)
		printf("%d ",A[i]);
	printf("\n");
}
