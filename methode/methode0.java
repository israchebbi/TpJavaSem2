
import java.util.Scanner;

public class methode0{
    public static void remplirT(int[]T, int n){
        Scanner sc=new Scanner(System.in);
        System.out.println("Filling the array (" + n + " elements):");
        
        for (int i = 0; i <= n; i++) {
            System.out.println("T["+(i+1)+"]=");
            while (!sc.hasNextInt()) {
                System.out.println("please enter a valid integer");
                sc.next();
            }
            T[i]=sc.nextInt();
        }
    }
    public static void remplirMat(int[][]m,int n){
        Scanner sc=new Scanner(System.in);
        System.out.println("filling the matrix with ("+n+" elements");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                    System.out.println("m["+i+"]["+j+"]=");
                    m[i][j]=sc.nextInt();
                while (!sc.hasNextInt()){
                    System.out.println("please enter a valid integer");
                    sc.nextInt();}
                    m[i][j]=sc.nextInt();

            }
    }
}
}