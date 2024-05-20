import java.util.*;
import java.text.DecimalFormat;
 
public class CurrencyConverter extends CurAbstract
{
   public void CurConverter()
   {
      double amount=0;
      double rupee, dollar, pound, euro, yen, ringgit;
      int choice;
 
      DecimalFormat f = new DecimalFormat("##.##");
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Following are the Choices:");
      System.out.println("Enter 1: Rupee");
      System.out.println("Enter 2: Dollar");
      System.out.println("Enter 3: Pound");
      System.out.println("Enter 4: Euro");
      System.out.println("Enter 5: Yen");
      System.out.println("Enter 6: Ringgit");
      System.out.println("Enter 7: Choose Other Converter");
      System.out.println("Enter 8: EXIT");
 
      System.out.print("\nChoose from above options: ");
      choice = sc.nextInt();
 
      
 
      switch (choice)
      {
         case 1:  
	    System.out.println("Enter the amount you want to convert?");
            amount = sc.nextFloat();
	    System.out.println(" ");
            dollar = amount / 70;
            System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar");
 
            pound = amount / 88;
            System.out.println(amount + " Rupee = " + f.format(pound) + " Pound");
 
            euro = amount / 80;
            System.out.println(amount + " Rupee = " + f.format(euro) + " Euro");
 
            yen = amount / 0.63;
            System.out.println(amount + " Rupee = " + f.format(yen) + " Yen");
 
            ringgit = amount / 16;
            System.out.println(amount + " Rupee = " + f.format(ringgit) + " ringgit");
            System.out.println(" ");
	    break;
 
         case 2:  
	    System.out.println("Enter the amount you want to convert?");
            amount = sc.nextFloat();
	    System.out.println(" ");
            rupee = amount * 70;
            System.out.println(amount + " Dollar = " + f.format(rupee) + " Ruppes");
 
            pound = amount *0.78;
            System.out.println(amount + " Dollar = " + f.format(pound) + " Pound");
 
            euro = amount *0.87;
            System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");
 
            yen = amount *111.087;
            System.out.println(amount + " Dollar = " + f.format(yen) + " Yen");
 
            ringgit = amount *4.17;
            System.out.println(amount + " Dollar = " + f.format(ringgit) + " ringgit");
            System.out.println(" ");
	    break;
 
         case 3:  
	    System.out.println("Enter the amount you want to convert?");
            amount = sc.nextFloat();
	    System.out.println(" ");
            rupee = amount * 88;
            System.out.println(amount + " pound = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *1.26;
            System.out.println(amount + " pound = " + f.format(dollar) + " Dollar");
 
            euro = amount *1.10;
            System.out.println(amount + " pound = " + f.format(euro) + " Euro");
 
            yen = amount *140.93;
            System.out.println(amount + " pound = " + f.format(yen) + " Yen");
 
            ringgit = amount *5.29;
            System.out.println(amount + " pound = " + f.format(ringgit) + " ringgit");
            System.out.println(" ");
	    break;
 
         case 4:
	    System.out.println("Enter the amount you want to convert?");
            amount = sc.nextFloat();  
	    System.out.println(" ");
            rupee = amount * 80;
            System.out.println(amount + " euro = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *1.14;
            System.out.println(amount + " euro = " + f.format(dollar) + " Dollar");
 
            pound = amount *0.90;
            System.out.println(amount + " euro = " + f.format(pound) + " Pound");
 
            yen = amount *127.32;
            System.out.println(amount + " euro = " + f.format(yen) + " Yen");
 
            ringgit = amount *4.78;
            System.out.println(amount + " euro = " + f.format(ringgit) + " ringgit");
            System.out.println(" ");
	    break;
 
         case 5:  
	    System.out.println("Enter the amount you want to convert?");
            amount = sc.nextFloat();
	    System.out.println(" ");
            rupee = amount *0.63;
            System.out.println(amount + " yen = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *0.008;
            System.out.println(amount + " yen = " + f.format(dollar) + " Dollar");
 
            pound = amount *0.007;
            System.out.println(amount + " yen = " + f.format(pound) + " Pound");
 
            euro = amount *0.007;
            System.out.println(amount + " yen = " + f.format(euro) + " Euro");
 
            ringgit = amount *0.037;
            System.out.println(amount + " yen = " + f.format(ringgit) + " ringgit");
            System.out.println(" ");
	    break;
 
         case 6:  
	    System.out.println("Enter the amount you want to convert?");
            amount = sc.nextFloat();
	    System.out.println(" ");
            rupee = amount *16.8;
            System.out.println(amount + " ringgit = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *0.239;
            System.out.println(amount + " ringgit = " + f.format(dollar) + " dollar");
 
            pound = amount *0.188;
            System.out.println(amount + " ringgit =: " + f.format(pound) + " pound");
 
            euro = amount *0.209;
            System.out.println(amount + " ringgit = " + f.format(euro) + " euro");
 
            yen = amount *26.63;
            System.out.println(amount + " ringgit = " + f.format(yen) + " yen");
            System.out.println(" ");
	    break;
	 case 7: 
            break;
 	 case 8:
	    System.exit(0);
          
         default:
            System.out.println("Invalid Input");
	    System.out.println(" ");
      }
   }
}