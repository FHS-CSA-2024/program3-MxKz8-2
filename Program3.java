//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3 {
    public static void main(String[] args){
        //Make a scanner
        Scanner myScanner = new Scanner(System.in);
        
        //Create my variables
        int length = 0;
        int width = 0;
        int area = 0;
        int perimeter = 0;
        
        //Ask for user input
        System.out.println("Enter length:");
        //Get input
        length = myScanner.nextInt();
        //Ask for user input
        System.out.println("Enter width:");
        //Get input
        width = myScanner.nextInt();
        
        //Calculate
        area = length * width;
        perimeter = 2 * (length + width);
        
        //Output
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + perimeter);
        
        System.out.println();
        System.out.println("This program was written by:");
        System.out.print("Kyle Tan on 8/13/24 in 1st period");
    }
}



//Paste console output below:
/*

Enter length:
10
Enter width:
10
Length is: 10
Width is: 10
Area is: 100
Perimeter is: 40

This program was written by:
Kyle Tan on 8/13/24 in 1st period

*/
