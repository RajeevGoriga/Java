
public class LowPriority {

	public static void main(String[] args) {
		MyTh t1=new MyTh(1);
		MyTh t2=new MyTh(2);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		
	}

}
class MyTh extends Thread
{
	int id;
	MyTh(int id)
	{
		this.id=id;
		start();
	}
public void run()
{
	for(int i=0;i<10;i++)
		System.out.println("My id is:"+id);
}
}

