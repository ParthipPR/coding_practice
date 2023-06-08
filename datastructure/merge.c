#include<stdio.h>


int*  merge(int A[],int m, int B[], int n)
{
        int i = 1,j = 1, k = 1;
        int static C[50];
        {
                if(A[i]<B[j])
                        C[k++] = A[i++];
                else
                        C[k++] = A[i++];
        }
        whle(i<=m)
                C[k++] = A[i++];
        while(j<=n)
                C[k++] = B[i++];
        return C;
}


void main()
{
	int A[] = {5,2,1,3,4}, B[] = {8,9,6,7,10};
	int m = 5, n= 5;
	int C[m+n];
	int i = 0,j = 0, k = 0;
	while(i<= m && j<=n)
	{
                if (A[i]<B[j])
                        C[k++] = A[i++];
                else
                        C[k++] = B[j++];
        }
        while (i<=m)
                C[k++] = A[i++];
        while (j<=n)
                C[k++] = B[i++];
	for (i=0;i<k;i++)
		printf("%d ",C[i]);
		printf("\n");

}
