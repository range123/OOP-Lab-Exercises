
import java.util.*;
class Queue
{
	int n;
	int capacity=0;
	Queue()
	{
		this.n=0;
	}
	synchronized int get() throws InterruptedException
	{
		while(capacity==0)
			wait();
		if(n%2==0)
			System.out.println("Got " +n+" is even");
		else
			System.out.println("Got " +n+" is odd");
		capacity--;
		notify();
		return n;
	}
	synchronized void put() throws InterruptedException
	{
		Random r = new Random();
		while(capacity==2)
			wait();
		capacity++;
		notify();
		n=r.nextInt(10000)+1;
		System.out.println("Put : "+n);
	}
}

class putter implements Runnable
{
	Queue obj;
	putter(Queue n)
	{
		new Thread(this,"Putter").start();
		obj=n;
	}
	public void run()
	{
		int i=0;
		while(true){
			try {
				obj.put();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} 
}
class getter implements Runnable
{
	Queue obj;
	getter(Queue n)
	{
		new Thread(this,"getter").start();
		obj=n;
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			try {
				obj.get();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}



	}
}
public class EvenChecker {
	public static void main(String args[])
	{
		Queue q =new Queue();
		putter p = new putter(q);
		getter c = new getter(q);
		

	}

}
