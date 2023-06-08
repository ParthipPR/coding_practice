#include<stdio.h>
#include<stdlib.h>

struct llist
{
	int data;
	struct llist *next;
}Llist;

void insertfirst(struct llist *Head, int x)
{
	struct llist *temp = malloc(sizeof(Llist));
	temp -> data = x;
	temp -> next = Head;
	*Head = *temp;
	temp = NULL;
	return *Head;
}

void main()
{
	struct llist *H;
	insertfirst(H,45);
}
