package LList1;

public class XList
{
	public static void main(String[] args)
	{
		LList1 l = new LList1();
		int[] ini = { 3, 1, 5, 8, 3, 7 };

		l.init(ini);
		System.out.println(l.max());

		l.displayList();
	}
}
