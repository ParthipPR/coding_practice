#include<stdio.h>
#include<stdlib.h>



int bsr(int A[], int l,int r, int x)
{
	if(l<=r)
	{
		int m = (l+r)/2;
		if (A[m]==x)
			return m;
		if (x<A[m])
			return bsr(A,l,m-1,x);
		return bsr(A,m+1,r,x);
	}
	return -1;
}

int main(int argc, char **argv)
{
	int i,A[100],r,n,l,x,pos,test;
	n = argc;
	r = n;
	l = 0;
	for(i=0;i < argc;i++)
	{
		A[i]=atoi(argv[i]);
	//	printf("%s \n",argv[i+1]);
	}
	printf("Enter the element to be searched:");
	scanf("%d",&x);
	pos = bsr(A,l,r,x);
	if (pos==-1)
		printf("The required element is not present in the array.\n");
	else
		printf("The required element is present at %d th position.\n",pos);
}



