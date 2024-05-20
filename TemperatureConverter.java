import java.util.*;
class TemperatureConverter extends TempMethods implements TempInterface
{
  public static Scanner c = new Scanner(System.in);
  public static double val;
  public static String word;
  public static double TEMP(String word)
  {
    System.out.println("Enter "+word+" value:");
    double val = c.nextDouble();
    return val;
  }
  
  
  public static void output(double val, String word)
  {
    System.out.println(word+" value: "+val);
    System.out.println(" ");
  }
    
public void TempConverter()
{
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Following are the Choices:\nEnter 1: Celcius to Fahrenheit\nEnter 2: Celcius to Kelvin\n"+
              "Enter 3: Fahrenheit to Celcius\nEnter 4: Fahrenheit to Kelvin\n"+
              "Enter 5: Kelvin to Celcius\nEnter 6: Kelvin to Fahrenheit\nEnter 7: Choose Other Converter\nEnter 8: EXIT");
    
      System.out.println("\nChoose from above options: ");
      int ch = sc.nextInt();
      double num = 0;
      switch(ch){
        case 1: num = TEMP("Celsius");
		output (super.C_F(num),"Fahrenheit");
                break;
        case 2: num = TEMP("Celsius");
            	output (super.C_K(num),"Kelvin");
            break;
        case 3: num = TEMP("Fahrenheit");
            	output (super.F_C(num),"Celcius");
            break;
        case 4: num = TEMP("Fahrenheit");
            	output (super.F_K(num),"Kelvin");
            break;
        case 5: num = TEMP("Kelvin");
            	output (super.K_C(num),"Celcius");
            break;
        case 6: num = TEMP("Kelvin");
            	output (super.K_F(num),"Fahrenheit");
            break;
        case 7: break;
	case 8: System.exit(0);
            
        default: System.out.println("Invalid Input");
	System.out.println(" ");
      }
    
  }
}

