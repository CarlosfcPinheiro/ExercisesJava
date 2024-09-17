import java.io.*;

public class SimpleRead {
    public static void main(String args[]){
        byte S[] = new byte[40];
        String Str;

        System.out.println("Insert your name: ");
        try{
            System.in.read(S);
            Str = new String(S).trim();
            System.out.println("Nice to meet you, " + Str + "!");
            
        } catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
}