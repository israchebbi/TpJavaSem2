
import java.util.Scanner;

public class exercice3{
    public static int lectureN(){
        Scanner sc= new Scanner(System.in);
        int n;
        do { 
            System.out.println("give an int strictly positive ");
            while (! sc.hasNextInt()) { 
                System.out.println("On veux un nombre valid");
                sc.next();
            }
            n=sc.nextInt();
            if (n<=0) {
                System.out.println("error:the intiger must be positive");
            }
        } while (n<=0);
        return n;
    }
    public static void remplirT(int []t,int n){
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("t["+i+"]=");
            t[i]=sc.nextInt();
        }
    }
    public static void tri(int []t,int n){
        int aux;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (t[i]>t[j]) {
                    aux=t[i];
                    t[i]=t[j];
                    t[j]=aux;
                }
            } 
        }
    }
    public static void afficher(int []t ){
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]+"");
        }
    }
    public static void main(String[] args) {
        System.out.println("donner la taille du tableau");
        int n=lectureN();
        int []t=new int [n];
        remplirT(t, n);
        System.out.println("tab initial");
        afficher(t);
        System.out.println("on va faire la  tri du tableau");
       // tri(t, n);
        System.out.println("le tableau trié");
         tri(t, n);
        afficher(t);
    }
}