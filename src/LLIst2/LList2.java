package LLIst2;

import interfaces.EList;

public class LList2 implements EList
{

	class Node
	{
		int val;
		Node next;
		Node prev;

		public Node(int val)
		{
			this.val = val;
		}

		public int getNode()
		{
			return val;
		}
	}

	Node root = null;

	public void displayList()
	{
		Node l = root;
		while (l != null)
		{
			System.out.print(l.getNode() + " ");
			l = l.next;
		}
	}

	@Override
	public void clear()
	{
		root = null;
	}

	@Override
	public void init(int[] ini)
	{
		if (ini == null || ini.length == 0)
			return;

		for (int i = ini.length - 1; i >= 0; i--)
		{
			addStart(ini[i]);
		}
	}

	@Override
	public int size()
	{
		if (root == null)
			throw new IllegalArgumentException();

		int count = 0;
		Node p = root;

		while (p != null)
		{
			p = p.next;
			count++;
		}
		return 0;
	}

	@Override
	public int[] toArray()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addStart(int val)
	{
		Node p = new Node(val);
		if (root == null)
		{
			root = p;
		}
		else
		{
			root.prev = p;
			p.next = root;
			root = p;
		}
	}

	@Override
	public void addEnd(int val)
	{
		Node tmp = new Node(val);
		Node p = root;
		while (p.next != null)
		{
			p = p.next;
		}
		tmp.prev = p;
		tmp.next = p.next;
		p.next = tmp;
	}

	@Override
	public void addPos(int pos, int val)
	{
		Node tmp = new Node(val);
		Node p = root;

		if (root == null || pos == 0)
		{
			addStart(val);
		}
		else
		{
			for (int i = 1; i < pos; i++)
			{
				p = p.next;
			}
			tmp.prev = p;
			tmp.next = p.next;
			p.next = tmp;
		}
	}

	@Override
	public void addStart(int[] arr)
	{
		addStart(arr);
	}

	@Override
	public void addEnd(int[] arr)
	{
		Node p = root;

		while (p.next != null)
		{
			p = p.next;
		}
		addEnd(arr);
	}

	@Override
	public void addPos(int pos, int[] arr)
	{
		for (int i = arr.length - 1; i >= 0; i--)
		{
			addPos(pos, arr[i]);
		}
	}

	@Override
	public int delStart()
	{
		if (root == null)
			throw new IllegalArgumentException();

		int ret = 0;
		if (root.next == null)
		{
			root = null;
		}
		else
		{
			root.next.prev = null;
			root = root.next;
		}
		return ret;
	}

	@Override
	public int delEnd()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delPos(int pos)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int min()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int max()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int minInd()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int maxInd()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void set(int pos, int val)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public int get(int val)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void reverse()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void halfRevers()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void sort()
	{
		// TODO Auto-generated method stub

	}

}
