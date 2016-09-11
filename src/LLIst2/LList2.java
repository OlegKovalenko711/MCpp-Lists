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
		// TODO Auto-generated method stub

	}

	@Override
	public void init(int[] ini)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public int size()
	{
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub

	}

	@Override
	public void addPos(int pos, int val)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void addStart(int[] arr)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void addEnd(int[] arr)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void addPos(int pos, int[] arr)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public int delStart()
	{
		// TODO Auto-generated method stub
		return 0;
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
