public class SimpleVector{
    public static void main(String args[]){
        int array[] = new int[5];

        for (int i=0; i<5; i++){
            array[i] = i+1;
        }

        for (int c=0; c<array.length; c++){
            System.out.println("Elemento na posição["+c+"] = "+array[c]);
        }
    }
}