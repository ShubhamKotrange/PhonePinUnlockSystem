import java.util.Scanner;
class Password
{
	public static void main(String [] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Set a New Pin : ");
		int pin1=sc.nextInt();
		int duration=1000;
		outerLoop:
		for(; ; )
		{
			int attempt=3;
			do{
				System.out.println();
				System.out.print("Enter your pin : ");
				int pin2=sc.nextInt();
				System.out.println();

				if(pin1==pin2)
				{
					System.out.println("PHONE UNLOCKED");
					break outerLoop;
				}
				System.out.println("Wrong Pin Entered ");
				System.out.println("You have "+(attempt-1)+ " attempt left");
				attempt--;
			}while(attempt>0);
			System.out.println("Your phone has been locked for"+(duration)/1000+ "seconds");
			Thread.sleep(duration);
			duration*=2;
		}
	}
}