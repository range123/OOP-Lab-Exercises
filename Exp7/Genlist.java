import java.util.ArrayList;
import java.util.Scanner;
interface list<T>
{
	void insert(T e,int pos);
	void delete(T e);
	void delete(int pos); 
	void display();
	
}

class LinkedList<T> implements list<T>
{
	ArrayList<T> obj;
	LinkedList()
	{
		obj=new ArrayList<T>();
	}

	public void insert(T e, int pos) {
		obj.add(pos,e);
		
	}
	public void insertfirst(T e) {
		insert(e,0);
		
	}
	public void insertlast(T e) {
		insert(e,obj.size()-1);
		
	}

	public void delete(T e) throws IndexOutOfBoundsException{
		if(!obj.contains(e))
			throw new IndexOutOfBoundsException("Doesn't contain the element");
		obj.remove(e);
		
	}

	public void delete(int pos) throws IndexOutOfBoundsException{
		if(pos>=obj.size() || pos<0)
			throw new IndexOutOfBoundsException();
		obj.remove(pos);
		
	}
	public void deletelast() throws IndexOutOfBoundsException{
		if(obj.size()<=0)
			throw new IndexOutOfBoundsException("List empty");
		delete(obj.size()-1);
	}
	public void deletefirst() throws IndexOutOfBoundsException{
		if(obj.size()<=0)
			throw new IndexOutOfBoundsException("List empty");
		delete(0);
	}

	public void display() throws IndexOutOfBoundsException{
		if(obj.size()<=0)
			throw new IndexOutOfBoundsException("List empty");
		System.out.println(obj);
		
	}
	
}
public class Genlist {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		LinkedList<String> ll=new LinkedList<String>();
		try{
			ll.insert("Hello",0);
			ll.delete("Hello");
			ll.delete("This wont work");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.print(e.getMessage());
		}
		input.close();
	}

}
