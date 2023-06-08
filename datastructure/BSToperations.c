#include<stdio.h>

//structure for node

struct node
{
    int data;
    struct node* left;
    struct node* right;
};

//function to perform operations

struct node* newnode(int x){
    struct node* t ;
    t->data = x;
    t->left = NULL;
    t->right = NULL;
    return t;
}

struct node* insert(struct node* t, int x){
    if (t == NULL)
        t = newnode(x);
    else if (x < t->data)
        if (t->left != NULL)
            insert(t->left, x);
        else
            t->left = newnode(x);
     else if (x > t->data)
        if (t->right != NULL)
            insert(t->right, x);
        else
            t->right = newnode(x);
    return t;    
}

struct node* find(struct node* t, int x){
    if (t == NULL)
        return NULL;
    if (x < t->data)
        return find(t->left,x);
     if (x > t->data)
        return find(t->right,x);
    return t;   
}

bool  isleaf(struct node* t){
    if ( t == NULL)
        return False;
}

