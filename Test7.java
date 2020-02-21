import java.io.*;

public class Test7
{

	public static void main(String[] args)
	{
		try
		{
		File f=new File("pw2.java");
		File f1=new File("pwd1.txt");
		int i=0;
		FileReader fin=new FileReader(f1);
		FileWriter fout=new FileWriter(f);
		while((i=fin.read())!=-1)
		{
			fout.write(i);
		}
			fout.close();
		
		}
		catch(Exception e)
		{
			
		}

}
}
