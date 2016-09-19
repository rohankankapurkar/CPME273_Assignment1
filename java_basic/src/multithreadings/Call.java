package multithreadings;


class PrimeNumber extends Thread
{
	public void run()
	{
		try
		{
			for(int i=700;i<=1000;i++)
			{
				if(!((i%2 == 0 && i !=2) || (i %3 == 0 && i !=3) || (i%5 == 0 && i!=5) || (i%7 == 0 && i!=7) ))
				{
					System.out.println ("Prime No.= "+i);
				}
				Thread.sleep(2);
			}
		}
		catch (Exception e){}
	}
}
class NonPrimeNumber extends Thread
{
	public void run()
	{
		try
		{
			for(int i=700;i<=1000;i++)
			{
				if(((i%2 == 0 && i !=2) || (i %3 == 0 && i !=3) || (i%5 == 0 && i!=5) || (i%7 == 0 && i!=7) ))
				{
					System.out.println ("Non-Prime No.= "+i);
				}
				Thread.sleep(2);
			}
		}
		catch (Exception e){}
	}
}
class Call
{
	public static void main(String args[])
	{
		new PrimeNumber().start();
		new NonPrimeNumber().start();
	}
}	
