import java.io.*;

public class Divisible{
    public static void main(String args[]){
        // Declaring variables
        byte S[] = new byte[10];
        String str1, str2;
        int num1, num2;

        try{
            System.out.println("Insert a number: ");
            // Defining the length of the array of bytes
            S = new byte[10];
            System.in.read(S);
            str1 = new String(S).trim(); // .trim() => Removing spaces
            num1 = Integer.parseInt(str1); // Parsing the string to number value

            System.out.println("Insert other number: ");
            // Redefining the length of the array
            S = new byte[10];
            System.in.read(S);
            str2 = new String(S).trim();
            num2 = Integer.parseInt(str2);

            if (num1 % num2 == 0){
                System.out.println(num1+" is divisible per "+num2);
            } else {
                System.out.println(num1+" is not divisible per "+num2);
            }

        } catch(Exception ex){
            System.out.print("ERROR: "+ex.toString());
        }
    }
}