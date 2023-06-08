#include<stdio.h>

int max(int a,int b)
{
	if(a>b)
		return a;
	return b;
}
int min(int a,int b)
{
	if(a<b)
		return a;
	return b;
}

void add_poly(int p1[],int n1,int p2[],int n2,int p[])
{ 
	int sn = min(n1,n2);
	for (int i=0; i<=sn ; i++)
		p[i] = p1[i]+p2[i];
	for (int i=sn+1; i<=n1 ; i++)
		p[i] = p1[i];
	for (int i=sn+1; i<=n2; i++)
		p[i] = p2[i];
}

void main()
{
	int n1, n2;
	

}
