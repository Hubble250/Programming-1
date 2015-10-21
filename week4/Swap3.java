
/**
 * Write a description of class Swap3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Swap3
{
    // main method: execution starts here
    public static void main(String[] args)
    {
           int a1 = 7;
           int a2 = 9;
           int a3 = 13;
           
           System.out.println("Before swap:");
           System.out.println("a1 = " + a1 + "\na2 = " + a2 + "\na3 = " + a3);
           
           
           
         //temporary variables for the swap
           int temp1 = 0;
           int temp2 = 0;
           
           //execute swap
           temp1 = a1;
           a1 = a3;     //a1 swapped with a3
           
           temp2 = a2;
           a2 = temp1;  //a2 swapped wih a1
           
           a3 = temp2;   //a3 swapped with a2
           
         System.out.println("After Swap:" );
         System.out.println("a1 = " + a1 + "\na2 = " + a2 + "\na3 = " + a3);
    
    }
}
