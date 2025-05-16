import java.util.Scanner;

public class exercice2 {
    public static int lectureN(){
         int  n;
        try (Scanner sc = new Scanner(System.in)){
                
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
        }
        /*int  n;
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
        } while (n<=0);*/
        return n;
    }
    public static int factorielle_rec(int n){
        if (n==0){
            return 1;
        }else{
            return factorielle_rec(n-1)*n;
        }
    }
    public static void main(String[]args){
        int n = lectureN();
        System.out.println("la factorielle de " + n + " est " + factorielle_rec(n));
    }
}
