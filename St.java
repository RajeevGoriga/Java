
public class St {
   static int a;
	St()
	{
		
	}
	void disp()
	{
		a++;
		System.out.println(a);
	}
	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			St s=new St();
			s.disp();
		}
	}

}
