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
public class QueueNode {
    private int DATA;
    private QueueNode NEXT;
    QueueNode()
    {
        this.DATA=0;
        this.NEXT=null;
    }
    QueueNode(int d)
    {
        this.DATA=d;
        this.NEXT=null;
    }
    QueueNode(int d,QueueNode n )
    {
        this.DATA=0;
        this.NEXT=n;
    }
    int getData()
    {
        return this.DATA;
    }
    void setData(int d)
    {
        this.DATA=d;
    }
    QueueNode getNext()
    {
        return this.NEXT;
    }
    void setNext(QueueNode n)
    {
        this.NEXT=n;
    }
}
