import java.util.Scanner;
public class app1{
    public static int lectureN(){
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
    public static void somme_recurcive(int n){
        if (n==0) {
            System.out.println("la somme est 0");
        } else {
            int s = n + somme_recursive(n-1);
            System.out.println("la somme de 1 a " + n + " est " + s);
        }
    }
    public static int somme_recursive(int n){
        if (n==0) {
            return 0;
        } else {
            return n + somme_recursive(n-1);
        }
    }
    public static void main(String[] args) {
        int n = lectureN();
        somme_recurcive(n);
        System.out.println("la somme de 1 a " + n + " est " + somme_recursive(n));
    }
}