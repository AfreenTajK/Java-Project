import java.util.*;
class RealTimeConverter
{
	public static Scanner G = new Scanner(System.in);
	public static void main(String args[])
	{
		CurrencyConverter C = new CurrencyConverter();
		TemperatureConverter T = new TemperatureConverter();
		TempScreen TS = new TempScreen();
		CurScreen CS = new CurScreen();
		System.out.println(" ");
		System.out.println("Welcome to Real Time Converter...");
		
		do{
			System.out.println(" ");
			System.out.println("1. Enter 1 for Temperature Converter.");
			System.out.println("2. Enter 2 for Currency Converter.");
			System.out.println("3. EXIT");
			System.out.println("\nEnter your Choice: ");
			int Q = G.nextInt();
			switch(Q){
				case 1: 
					TS.TempScreenColor();
					T.TempConverter();
					break;
				case 2:
					CS.CurScreenColor();
                                        C.CurConverter();
					break;
				case 3:
					System.exit(0);
        			default: 
					System.out.println("Invalid Input");
      }

    }while(true);  
					
  }
}

