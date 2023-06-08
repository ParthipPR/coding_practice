#include<stdio.h>

int partition(int A[],int P, int r)
{
	int t = A[P];
	int q = P;
	for (int i = P+1; i<=r; i++)
		if (A[i]<t)
		{	A[q++] = A[i];
			A[i] = A[q];
		}
	A[q] = t;
	return q;
}

void quicksort(int A[], int P, int r)
{
	if (P<r)
	{
		int q = partition(A,P,r);
		quicksort(A,P,q-1);
		quicksort(A,q+1,r);
	}
}

int main(int argc , char* argv[])
{	
	int i,A[50];
	for (i=1;i<argc;i++)
	{
		A[i-1]=atoi(argv[i]);
		printf("%d ",A[i-1]);
		
	}
	printf("\n");

	
	int n=argc-1;
	for (i=0;i<n;i++)
		printf("%d ",A[i]);
	printf("\n");
	
	quicksort(A,0,n);
	printf("The sorted array is:");
	for (i=0;i<n;i++)
		printf("%d ",A[i]);
	printf("\n");
}
