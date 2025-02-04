import java.util.*;

class LL
{
	Node head;
	private int size;

	LL()
	{
		size = 0;
	}

	public class Node
	{
		String data;
		Node next;

		Node(String data)
		{
			this.data = data;
			this.next = null;
			size++;
		}
	}

	public void AddFirst(String data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void AddLast(String data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
		}

		Node lastNode = head;
		while(lastNode.next != null)
		{
			lastNode = lastNode.next;
		}
		lastNode.next = newNode;
	}

	public void Printlist()
	{
		Node currNode = head;
		while(currNode != null)
		{
			System.out.print(currNode.data +" -> ");
			currNode = currNode.next;
		}
		System.out.println("null");
	}

	public void removeFirst()
	{
		if(head == null)
		{
			System.out.println("Empty list");
			return;
		}
		head = this.head.next;
		size--;
	}

	public void removeLast()
	{
		if(head == null)
		{
			System.out.println("Empty list");
			return;
		}

		size--;
		if(head.next == null)
		{
			head = null;
			return;
		}

		Node currNode = head;
		Node lastNode = head.next;
		while(lastNode.next != null)
		{
			currNode = currNode.next;
			lastNode = lastNode.next;
		}
		currNode.next = null;
	}

	public int getSize()
	{
		return size;
	}
	public static void main(String args[])
	{
		LL list = new LL();

		list.AddFirst("a");
		list.AddFirst("is");
		list.Printlist();

		list.AddLast("list");
		list.Printlist();

		list.removeFirst();
		list.Printlist();

		list.removeLast();
		list.Printlist();

		System.out.println(list.getSize());
	}
}