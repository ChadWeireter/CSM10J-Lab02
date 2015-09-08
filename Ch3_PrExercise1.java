//a.
import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

/**
 *
 * @author Chad Weireter
 */
public class Ch3_PrExercise1 {

    
    public static void main(String[] args) throws FileNotFoundException {
        
    //b.
        Scanner inFile;
        PrintWriter outFile;
        
    //c.
        inFile = new Scanner(new FileReader("h:/inData.txt"));
        outFile = new PrintWriter("h:/outData.dat");
        
    //d.
        double length,width,radius,PI = 3.1416;
        String firstName,lastName;
        int age;
        double balance,rate;
        char ch;
        
        length = inFile.nextDouble();
        width = inFile.nextDouble();
        
        outFile.println("Rectangle:");
        outFile.print("Length = "+length);
        outFile.print(", Width = "+width);
        
        outFile.printf(", area = %.2f",length*width);
        outFile.printf(", perimeter = %.2f %n", 2*(length+width));
        
        outFile.println();
        radius = inFile.nextDouble();
        outFile.println("Circle:");
        outFile.print("Radius = " +radius);
        outFile.printf(", area = %.2f", (PI*radius*radius));
        outFile.printf(", Circumference =%.2f%n", (2*PI*radius));
        
        outFile.println();
        firstName = inFile.next();
        lastName = inFile.next();
        age = inFile.nextInt();
        balance = inFile.nextDouble();
        rate = inFile.nextDouble();
        
        ch = (inFile.next()).charAt(0);
        outFile.println("Name: "+firstName+" "+lastName+", age: "+age);
        outFile.printf("Beginning balance = $"+balance+", interest rate =%.2f%n",rate);
        outFile.printf("Balance at the end of the month = $%.2f%n",balance+(balance*(rate/(12*100))));

        outFile.println();
        outFile.println("The character that comes after "+ ch +" in the ASCII set is "+ (char)(ch + 1));
        
        //e.
        outFile.close();
       
        
    }
    
}
