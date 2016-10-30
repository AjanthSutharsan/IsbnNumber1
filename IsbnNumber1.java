
import java.util.Scanner;
public class IsbnNumber1
{
    public static int multiplyWeight(int[] IsbnNumber2) {
        int total = 0;
        
        for(int i=0;i<12;i+=2) {
            total+=IsbnNumber2[i];
        }
        
        for(int i=1;i<12;i+=2) {
            total+=(IsbnNumber2[i]*3);
        }
        
        return total;
    }
    public static void validate(int[] IsbnNumber2) {
        int remainder=(multiplyWeight(IsbnNumber2)+IsbnNumber2[12])%10;
        
        if(remainder==0) {
            System.out.println("Your ISBN number is valid.");
        }
        else {
            System.out.println("Your ISBN number is not valid.");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your 13-digit ISBN number to see if it is valid, ignoring any dashes.");
        String IsbnNumber1 = input.nextLine();
        
        int[] IsbnNumber2 = new int[13];
        
        for(int i=0;i<13;i++) {
            IsbnNumber2[i] = Character.getNumericValue(IsbnNumber1.charAt(i));
        }
        
        validate(IsbnNumber2);
    }    
}
