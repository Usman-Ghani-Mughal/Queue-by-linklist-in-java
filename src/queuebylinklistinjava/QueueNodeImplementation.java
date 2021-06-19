/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuebylinklistinjava;

/**
 *
 * @author Usman Ghani Mughal
 */
public class QueueNodeImplementation {
  protected  QueueNode Head;
  protected  QueueNode Tail;
  protected  int size;
  QueueNodeImplementation()
  {
      this.Head=null;
      this.Tail=null;
      this.size=0;
  }
  public void enQueue(int d)
  {
      QueueNode temp=new QueueNode(d);
      if(this.Head==null)
      {
          this.Head=temp;
          this.Tail=this.Head;
          this.size++;
          System.out.println("Data has Been Entered in the");
      }
      else
      {
          this.Tail.setNext(temp);
          this.Tail=this.Tail.getNext();
          this.size++;
      }
  }
  public int deQueue()
  {
      int n=0;
      if(this.Head==null)
      {
          System.out.println("Sorry Queue is Already Empty");
          return n;
      }
      else
      {
          n=this.Head.getData();
          this.Head=this.Head.getNext();
          this.size--;
          return n;
      }
  }
  public int peek()
  {
      if(this.Head==null)
      {
          System.out.println("Sorry Queue is Already Empty");
          return 0;
      }
      return this.Head.getData();
  }
  public void show()
  {
      if(this.Head==null)
      {
          System.out.println("Sorry Queue is Already Empty");
      }
      else
      {
         QueueNode temp=this.Head;
         while(temp!=null)
            {
               System.out.print(temp.getData()+" ");
               temp=temp.getNext();
            } 
      }
  }
  public int getSize()
  {
      return this.size;
  }
}
