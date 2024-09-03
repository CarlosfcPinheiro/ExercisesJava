public class Greater{
    public static void main(String args[]){
        int num1=9, num2=8;
        // Using the .format method to format strings with variables
        String showValues = String.format("Values: %d and %d", num1, num2);

        System.out.println(showValues);
        if (num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}