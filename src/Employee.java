public class Employee{
    public static void main(String args[]){
        int wage=1200;
        double discountINSS=0.8;
        String name = "Robervaldo";

        String showMessage = String.format(name + " recive %d of brute wage, but with the discount of the INSS valued on %f, your liquid wage is %f", wage, discountINSS, wage*discountINSS);

        System.out.println(showMessage);

    }
}