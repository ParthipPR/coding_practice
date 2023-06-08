#include<stdio.h>
#include<math.h>

void main()
{	
	float a,b,c,x1,x2,d;
	printf("What are the coefficients:");
	scanf("%f%f%f",&a,&b,&c);
	printf("the equation is %fx**2+%fx+%f \n",a,b,c);
	d = (b*b)-(4*a*c);

	if (d==0)
	{
		printf("The roots are equal \n");
		x1 = (-b)/(2*a);
		printf("the root is %f \n",x1);
		
	}
	
	else if (d>0)
	{

		printf("The roots are distinct \n");
		x1 = (-b + sqrt(d))/(2*a);
		x2 = (-b - sqrt(d))/(2*a);
		printf("the root is %f%f \n",x1,x2);
		
	}
	
	else 
	{
		
		printf("The roots are imaginary \n");
		x1 = (-b)/(2*a);
		x2 = (sqrt(-d))/(2*a);
		printf("The roots are %f+%fi,%f-%fi \n",x1,x2,x1,x2);

	}
	
}
