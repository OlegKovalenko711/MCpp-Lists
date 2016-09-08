package LList1;

import interfaces.EList;

public class LList1 implements EList
{
	class Node
	{
		int val;
		Node next = null;

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

	public boolean isEmpty()
	{
		return root == null;
	}

	@Override
	public void init(int[] ini)
	{
		clear();
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
		int ret = 0;
		Node p = root;
		while (p != null)
		{
			ret++;
			p = p.next;
		}
		return ret;
	}

	@Override
	public void clear()
	{
		root = null;
	}

	@Override
	public int[] toArray()
	{
		int[] tmp = new int[size()];
		Node p = root;
		int i = 0;
		while (p != null)
		{
			tmp[i++] = p.val;
			p = p.next;
		}
		return tmp;
	}

	@Override
	public void addStart(int val)
	{
		Node p = new Node(val);
		p.next = root;
		root = p;
	}

	@Override
	public void addEnd(int val)
	{
		Node p = root;

		if (isEmpty())
		{
			addStart(val);
		}
		else
		{
			while (p.next != null)
			{
				p = p.next;
			}
			p.next = new Node(val);
		}
	}

	@Override
	public void addPos(int pos, int val)
	{
		Node p = root;
		Node tmp = new Node(val);
		if (pos == 0)
		{
			addStart(val);
		}
		else
		{
			for (int i = 1; i < pos; i++)
			{
				p = p.next;
			}
			tmp.next = p.next;
			p.next = tmp;
		}
	}

	@Override
	public int delStart()
	{
		if (isEmpty())
			new Exception();
		int del = root.val;
		root = root.next;
		return del;
	}

	@Override
	public int delEnd()
	{
		if (isEmpty())
			new Exception();
		Node p = root;

		if (p.next == null)
		{
			p.next = null;
		}

		while (p.next.next != null)
		{
			p = p.next;
		}
		int del = p.val;

		p.next = null;

		return del;
	}

	@Override
	public int delPos(int pos)
	{

		return 0;
	}

	@Override
	public int min()
	{
		int ret = 0;
		Node p = root;
		for (int i = 1; i < minInd(); i++)
		{
			p = p.next;
		}
		ret = p.val;
		return ret;
	}

	@Override
	public int max()
	{
		int ret = 0;
		Node p = root;
		for (int i = 1; i < maxInd(); i++)
		{
			p = p.next;
		}
		ret = p.val;
		return ret;
	}

	@Override
	public int minInd()
	{
		Node p = root;
		int min = root.val;
		int count = 0;
		int ret = 0;

		while (p != null)
		{
			count++;
			if (p.val < min)
			{
				ret = count;
				min = p.val;
			}

			p = p.next;
		}

		return ret;
	}

	@Override
	public int maxInd()
	{
		Node p = root;
		int max = root.val;
		int count = 0;
		int ret = 0;

		while (p.next != null)
		{
			count++;
			if (p.next.val > max)
			{
				ret = count;
				max = p.next.val;
			}

			p = p.next;
			
		}
		return ret;
	}

	@Override
	public void set(int pos, int val)
	{
		Node p = root;
		if (p == null)
			return;

		for (int i = 0; i < pos; i++)
		{
			p = p.next;
		}
		p.val = val;

	}

	@Override
	public int get(int pos)
	{
		Node p = root;
		if (p == null)
			new Exception();

		int ret = 0;

		for (int i = 0; i < pos; i++)
		{
			p = p.next;
		}
		ret = p.val;
		return ret;
	}

	@Override
	public void reverse()
	{
		Node p = root;
		root = null;

		while (p != null)
		{
			addStart(p.val);
			p = p.next;
		}
	}

	@Override
	public void halfRevers()
	{
		Node p = root;
		root = null;

		while (p != null)
		{
			addStart(p.val);
			p = p.next;
		}

	}

	@Override
	public void sort()
	{
		Node p = root;
		Node k = root;
		Node prev = root;

		while (p != null)
		{
			if (p.val < 3)
			{
				set(0, p.val);
			}
			p = p.next;
		}
	}

	@Override
	public void addStart(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			addStart(arr[i]);
		}

	}

	@Override
	public void addEnd(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			addEnd(arr[i]);
		}
	}

	@Override
	public void addPos(int pos, int[] arr)
	{
		for (int i = arr.length - 1; i >= 0; i--)
		{
			addPos(pos, arr[i]);
		}
	}
}
