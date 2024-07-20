
class Node:
    def __init__(self,val):
        self.data = val
        self.next = None

class Stack:
    def __init__(self):
        self.head = None

    def push(self,val):
        newnode = Node(val)
        newnode.next = self.head
        self.head = newnode

    def pop(self):
        if not self.isEmpty():
            temp = self.head
            self.head = self.head.next
            val = temp.data
            del(temp)
            return val
        else:
            print("No node to pop")

    def top(self):
        return self.head.data
        
    def isEmpty(self):
        if self.head == None:
            return True
        else:
            return False

    def display(self):
        temp = self.head

        while(temp != None):
            print(temp.data, end = " ")
            temp = temp.next
