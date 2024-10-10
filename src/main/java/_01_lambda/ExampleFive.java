package _01_lambda;


// Thread example using lambda instead of anonymous inner class

public class ExampleFive {

	public static void main(String[] args) 
	{
		
		/*Runnable r = new Runnable()
		{
			public void run()
			{
				for(int i=0; i<10; i++)
				{
					System.out.println("Child thread");
				}
			}
		};*/
		
		Runnable r = () -> {
			for(int i=0; i<10; i++)
			{
				System.out.println("Child thread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Main thread");
		}
	}
}
