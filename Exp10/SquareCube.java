package Exp10;
import java.util.Random;

class data
{
	int n;
	int capacity=0;
	data()
	{
		this.n=0;
	}
	synchronized int getSQ() throws InterruptedException
	{
		while(capacity==0 || n%2!=0)
			wait();
		if(n%2==0){
			System.out.println(" sq of "+n+" = " +(n*n));
			capacity--;
			notify();
			return n;
		}
		return -1;
	}
	synchronized int getCub() throws InterruptedException
	{
		while(capacity==0 || n%2==0)
			wait();
		if(n%2!=0){
			System.out.println(" cube of "+n+" = " +(n*n*n));
			capacity--;
			notify();
			return n;
		}
		return -1;
	}
	synchronized void put() throws InterruptedException
	{
		Random r = new Random();
		while(capacity==1)
			wait();
		capacity++;
		notifyAll();
		n=r.nextInt(100)+1;
		System.out.println("Put : "+n);
	}
}
class generator implements Runnable
{

	data d;
	generator(data g)
	{
		d=g;
		new Thread(this,"generator").start();
	}
	public void run() {
		while(true){
			try {
				d.put();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
class Square implements Runnable
{
	data d;

	Square(data g)
	{
		d=g;
		new Thread(this,"Square").start();
	}
	public void run() {
		try {
			while(true){
				d.getSQ();
				Thread.sleep(1000);

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Cube implements Runnable
{

	data d;
	Cube(data g)
	{
		d=g;
		new Thread(this,"Cube").start();
	}
	public void run() {
		try {
			while(true){
				d.getCub();
				Thread.sleep(1000);


			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class SquareCube {
	public static void main(String args[])
	{
		data d = new data();
		generator g = new generator(d);
		Cube c = new Cube(d);
		Square s =new Square(d);


	}

}
