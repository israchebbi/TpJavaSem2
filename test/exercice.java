
import java.util.Scanner;

public class exercice{
    public static int lecture() {
        Scanner sc = new Scanner(System.in);
        int  n;
        do { 
            System.out.println("donner un enteir strictement postif");
            //n=sc.nextInt();
            while (! sc.hasNextInt()) { 
                System.out.println("erreur : if faut donner un entier valide");
                sc.nextInt();   
            }
            n=sc.nextInt();
            if (n<=0) {
                System.out.println("erreur : donner un entier strictement positif");
            }
        } while (n<=0);
        return n;
    }
    public static int compter(int n ){
        int compt=0;
        while (n !=0) { 
            compt=compt+1;
            n=n/10;
        }
        return compt;
    }
    public static void main(String[] args) {
        int n;
      System.out.println("donner un entier n strictement positif ");  
        n=lecture();
        int c=compter(n);
        System.out.println("le nombre de chiffre de "+n+" est "+c);
    }
}