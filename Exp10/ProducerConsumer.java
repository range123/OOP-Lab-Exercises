

class Q
{
	int n;
	int capacity=0;
	Q()
	{
		this.n=0;
	}
	synchronized int get() throws InterruptedException
	{
		while(capacity==0)
			wait();
		System.out.println("Got : "+n);
		capacity--;
		notify();
		return n;
	}
	synchronized void put(int val) throws InterruptedException
	{
		while(capacity==2)
			wait();
		capacity++;
		notify();
		n=val;
		System.out.println("Put : "+n);
	}
}

class producer implements Runnable
{
	Q obj;
	producer(Q n)
	{
		new Thread(this,"Producer").start();
		obj=n;
	}
	public void run()
	{
		int i=0;
		while(true){
			try {
				obj.put(i++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} 
}
class consumer implements Runnable
{
	Q obj;
	consumer(Q n)
	{
		new Thread(this,"Consumer").start();
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
public class ProducerConsumer {
	public static void main(String args[])
	{
		Q q =new Q();
		producer p = new producer(q);
		consumer c = new consumer(q);
		

	}

}
