#include<stdio.h>
void main()
{
	int i,n,e;
	char word[10][10] = {{'o','n','e'},{'t','w','o'},{'t','h','r','e','e'},{'f','o','u','r'},{'f','i','v','e'},{'s','i','x'},{'s','e','v','e','n'},{'e','i','g','h','t'},{'n','i','n','e'},{'t','e','n'}};
	printf("Enter the no:");
	scanf("%d",&n);
	i = n-1;
	for(e=0;e<=6;e+=1)
		{
			printf("%c",word[i][e]);
		}
		printf("\n");
		

}
