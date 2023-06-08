#include<stdio.h>
#define SIZE  50

struct Queue
{
    int head;
    int tail;
    int size ;
    int A[SIZE + 1];
};



void enQ_priority(struct Queue *q, int x )
{
    if (q->tail < q->size)
    {
        int i = q->tail - 1;
        while (i >= q->head && q->A[i] > x)
        {
            q->A[i+1] = q->A[i];
            i--;
        }
        q->A[i+1] = x;
        q->tail++;
    }
}


int deQ(struct Queue *q)
{
    if (q->head < q->tail)
        return q->A[q->head++];
    if (q->head == q->tail && q->head > 0)
    {
        int x = q->A[q->head];
        q->head = q->tail = 0;
        return x;
    }
}


int isEmpty(struct Queue *q)
{
    return (q->head == q->tail);
}


int isFull(struct Queue *q)
{
    return (q->tail == SIZE);
}

void listQ(struct Queue *q) {
    if (isEmpty(q)) {
        printf("Error: The queue is empty.\n");
        return;
    }
    for (int i = q->head; i < q->tail; i++) {
        printf("%d ", q->A[i]);
    }
    printf("\n");
}




int main()
{
    struct Queue q = {0, 0, 50};

    while (1)
    {
        printf("\nMenu:\n");
        printf("1. Enqueue\n");
        printf("2. Dequeue\n");
        printf("3. Listqueue\n");
        printf("4. Exit\n");

        int choice;
        scanf("%d", &choice);

        switch (choice)
        {
            case 1:
                printf("Enter the element to enqueue: ");
                int x;
                scanf("%d", &x);
                enQ_priority(&q, x);
                break;
            case 2:
                x = deQ(&q);
                if (x != -1)
                    printf("Dequeued element: %d\n", x);
                break;
            case 3:
                listQ(&q);
                break;
            case 4:
                return 0;
            default:
                printf("Invalid choice.\n");
                break;
        }
    }
}
