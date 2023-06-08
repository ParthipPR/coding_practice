//Infix to postfix
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
#include <math.h>
#define MAX_EXPR_SIZE 100

typedef struct stack
{	int top;
	int size;
 	int* array;
} stack;

// function to create a stack of given capacity
stack* createStack(int size)
{
 	stack* s = malloc(sizeof(stack));
	s->size = size;
 	s->top = -1;
 	s->array = malloc(s->size * sizeof(int));
 	return s;
}

// stack is full when top is equal to the last index
int isFull(stack* s)
{
 	return s->top == s->size - 1;
}

// stack is empty when top is equal to -1
int isEmpty(stack* s)
{
 	return s->top == -1;
}

// function to add an item to stack
void push(stack* s, int item)
{
 	if (isFull(s))
	 	return;
 	s->array[++s->top] = item;
}

// function to remove an item from stack
int pop(stack* s)
{
 	if (isEmpty(s))
	 	return -1;
	return s->array[s->top--];
}

int token(char ch)
{
 	if (ch == '+' || ch == '-')
 		return 1;
 	if (ch == '*' || ch == '/')
 		return 2;
 	if (ch == '(')
 		return 3;
	if (ch == ')')
		return 4;
 return 0;
}

void infixtopostfix(char* postfix, char* infix)
{	
	int i=0,j=0;
	stack* s = createStack(MAX_EXPR_SIZE);
	char res;
	
	while(j!=50)
	{ 	printf(" %i",j);
		switch(token(infix[j]))
		{
			case 0 : break;
			
			case 1: while(s!=NULL && s->array[s->top]!="("){
					res = pop(s);
					postfix[i++] = res;
					}
				  push(s,infix[j++]);
				  break;
			case 2:while(s!=NULL && (s->array[s->top]!="*" || s->array[s->top]!="/")){
					res = pop(s);
					postfix[i++] = res;
					}
				 push(s,infix[j++]);
				 break;
			case 3: push(s,infix[j++]);
				  break;
			case 4: while(s!=NULL){
				  res = pop(s);
				  if(res == "(")
					  break;
				  postfix[i++] = res;
				  }
				  break;
			default: postfix[i++] = infix[j++];
		}
		
	}
	while(s!=NULL){
		res = pop(s);
		postfix[i++] = res;
	}
}

void main(){
	char *infix[MAX_EXPR_SIZE];
	char *postfix[MAX_EXPR_SIZE];

	printf("Enter the exp:");
	scanf("%s",&infix);
	printf("test1 %s",&infix);
	infixtopostfix(infix,postfix);
	printf("test2");
	printf("Postfix expression: %s\n",postfix);
}


