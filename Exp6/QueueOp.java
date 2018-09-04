import java.util.ArrayList;

//did not do Arrays implementation
interface queuefun
{
	void enqueue(int item);
	int dequeue();
	void display();
}
class queuelist implements queuefun
{
	ArrayList<Integer> queue;
	queuelist()
	{
		queue=new ArrayList<Integer>();
	}

	public void enqueue(int item) {
		queue.add(item);
		
	}

	public int dequeue() throws java.lang.NullPointerException {
		int v=queue.get(0);
		queue.remove(queue.get(0));
		return v;
	}

	public void display() {
		for(int x:queue)
			System.out.print(x+" ");
		
	}
	
}
//normal array
class queue implements queuefun
{
	private int a[],front,rear,capacity;
	queue(int cap)
	{
		capacity=cap;
		a=new int[capacity];
		front=0;
		rear=0;
	}
	public void enqueue(int ele)
	{
		if(isfull())
			System.out.println("Queue full");
		else
		{
			a[rear]=ele;
			rear++;
		}
	}
	public int dequeue()
	{
		if(isempty())
			return -99;
		//System.out.println("Queue empty");
		else
		{
			int val=a[front];
			if(front!=rear)
				front++;
			return val;
		}

	}
	public boolean isfull()
	{
		if(rear==capacity)
			return true;
		else
			return false;
	}
	public boolean isempty()
	{
		if(front==rear)
			return true;
		else
			return false;
	}
	public void display()
	{
		if(isempty())
			System.out.println("Queue empty");
		else
		{
			System.out.print("\nQueue :");
			for(int i=front;i<rear;i++)
				System.out.print(a[i]+" ");
		}
	}

}
public class QueueOp {
	public static void main(String args[])
	{
		queuelist q=new queuelist();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.dequeue();
		q.display();

	}
}
