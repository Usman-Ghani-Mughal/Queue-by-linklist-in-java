/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuebylinklistinjava;

import java.util.Scanner;

/**
 *
 * @author Usman Ghani Mughal
 */


public class QueueByLinkListInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueNodeImplementation obj=new QueueNodeImplementation();
        Scanner take_input=new Scanner(System.in);
        int ch,val;
        while(true)
        {
            System.out.println("\nPress 1 for enQueue");
            System.out.println("Press 2 for deQueue");
            System.out.println("Press 3 for display");
            System.out.println("Press 4 for peek");
            System.out.println("Press 5 for getSize");
            ch=take_input.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Enter the value you want to add :");
                    val=take_input.nextInt();
                    obj.enQueue(val);
                    break;
                }
                case 2:
                {
                    System.out.println("this come out from Stack : "+obj.deQueue());
                    break;
                }
                case 3:
                {
                    obj.show();
                    break;
                }
                case 4:
                {
                    
                   System.out.println("comes out from Queue : "+obj.peek());
                    
                    break;
                }
                case 5:
                {
                    System.out.println("This is the Size of Queue : "+obj.getSize());
                    break;
                }
                default:
                {
                    System.out.println("You Gave Wrong Input");
                }
            }
        }
    }
    
}
