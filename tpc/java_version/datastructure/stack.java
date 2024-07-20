package datastructure;

public class stack <T> {
  private node<T> head;
  public stack(){
    head = null;
  }

  public T top(){
    return head.data;
  }

  public boolean isEmpty(){
    if(head == null){
      return true;
    }
    else{
      return false;
    }
  }

  public void push(T val){
    node<T> newnode = new node<>(val);
    newnode.next = head;
    head = newnode;
  }

  public T pop(){
    if (!isEmpty()){
      node<T> temp = head;
      head = head.next;
      return temp.data;
    }
    else{
      return null;
    }
  }

  public void display(){
    node<T> temp = head;

    while(temp.next != null){
      System.out.println(temp.data);
      temp = temp.next;
    }
  }


}
