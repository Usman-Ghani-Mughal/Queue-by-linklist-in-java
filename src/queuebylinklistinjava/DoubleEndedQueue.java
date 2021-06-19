/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuebylinklistinjava;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Usman Ghani Mughal
 */

class DEQueue
{
    static int size=6;
    int []arr=new int[size];
    int right;
    int left;
    DEQueue()
    {
        this.left=-1;
        this.right=-1;
    }
    protected void insertRight(int d)
    {
        if(this.left==0&&this.right==size-1||this.left==this.right+1)
        {
            System.out.println("Queue is Full");
        }
        else if(this.right==-1)
        {
            this.left=0;
            this.right=0;
            this.arr[right]=d;
            System.out.println("i put data in "+this.right+" : inright");
        }
        else
        {
            this.right++;
            this.arr[right]=d;
            System.out.println("i put data in "+this.right+" : inright");
        }
    }
    protected void insertLeft(int d)
    {
        if(this.left==this.right+1||this.left==0&&this.right==size-1)
        {
            System.out.println("Queue is Full");
        }
        else if(this.left==-1)
        {
            this.left++;this.right++;
            this.arr[this.left]=d;
            System.out.println("i put data in "+this.left+" : inleft");
        }
        else if(this.left==0)
        {
            this.left=size-1;
            this.arr[this.left]=d;
            System.out.println("i put data in "+this.left+" : inleft");
        }
        else
        {
            this.left--;
            this.arr[this.left]=d;
        }
    }
    protected int delRight()
    {
        int t=0;
        if(this.right==-1)
        {
            System.out.println("Queue is Empty");
        }
        t=this.arr[this.right];
        if(this.right==this.left)
        {
            this.left=this.right=-1;
        }
        else
        {
            if(this.right==0)
            {
                this.right=size-1;
            }
            else
            {
              this.right--;  
            }
        }
        return t;
    }
    protected int delLeft()
    {
        int t=0;
        if(this.left==-1)
        {
            System.out.println("list is empty");
            return t;
        }
        t=this.arr[this.left];
        if(this.left==this.right)
        {
            this.left=this.right=-1;
        }
        else
        {
            if(this.left==size-1)
            {
                this.left=0;
            }
            else
            {
              this.left++;  
            }
        }
        return t;
    }
    public void inputRistriced()
    {
        int ch,val;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.println("\nPress 1 for Input");
        System.out.println("Press 2 for delRight");
        System.out.println("Press 3 for delLeft");
        System.out.println("Press 4 for Display");
        System.out.println("Press 5 for Exit");
        ch=sc.nextInt();
        switch(ch)
          {
            case 1:
            {
                System.out.print("Enter the value :");
                val=sc.nextInt();
                this.insertRight(val);
                break;
            }
            case 2:
            {
                System.out.println("This come out from Queue : "+this.delRight());
                break;
            }
            case 3:
            {
                System.out.println("This come out from Queue : "+this.delLeft());
                break;
            }
            case 4:
            {
                this.display();
                break;
            }
            case 5:
            {
                return;
            }
            default:
            {
                System.out.println("You gave Wrong Input");
            }
          }  
        }
        
    }
    public void outputRistriced()
    {
        int ch,val;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.println("Press 1 for InputRight");
        System.out.println("Press 2 for InputLeft");
        System.out.println("Press 3 for del");
        System.out.println("Press 4 for display");
        System.out.println("Press 5 for Exit");
        ch=sc.nextInt();
        switch(ch)
          {
            case 1:
            {
                System.out.print("Enter the value :");
                val=sc.nextInt();
                this.insertRight(val);
                break;
            }
            case 2:
            {
                System.out.print("Enter the value :");
                val=sc.nextInt();
                this.insertLeft(val);
                break;
            }
            case 3:
            {
                System.out.println("This come out from Queue : "+this.delLeft());
                break;
            }
            case 4:
            {
                this.display();
                break;
            }
            case 5:
            {
                return;
            }
            default:
            {
                System.out.println("You gave Wrong Input");
            }
          }  
        }
    }
    protected void display()
    {
        if(this.left==-1)
        {
            System.out.println("Queue Is Empty");
        }
        else
        {
            int move;
            if(this.right<this.left)
            {
                move=0;
                while(move<=this.right)
                 {
                  System.out.print(this.arr[move]+"  ");
                  move++;
                  //System.out.println("in 1st while");
                 }
                move=this.left;
                while(move<size)
                {
                    //System.out.println("in 2nd while");
                  System.out.print(this.arr[move]+"  ");
                  move++;
                }
            }
            else
            {
             move=this.left;
             while(move<=this.right)
             {
                 System.out.print(this.arr[move]+"  ");
                  move++;
             }
            }
            
        }
    }
}


public class DoubleEndedQueue {
    public static void main(String []args)
    {
        int ch;
        Scanner sc=new Scanner(System.in);
        DEQueue obj=new DEQueue();
        while(true)
        {
        System.out.println("Press 1 for InputRestriced");
        System.out.println("Press 2 for OutputRistrict");
        ch=sc.nextInt();
        switch(ch)
          {
            case 1:
            {
                obj.inputRistriced();
                break;
            }
            case 2:
            {
                obj.outputRistriced();
                 break;   
            }
            default:
            {
                System.out.println("Gave Wrong Input");
            }
        
          }
        }
    }
        
}