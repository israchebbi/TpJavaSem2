import java.util.Scanner;
public class exercice1{
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
    public static double somme(double []t , int n){
        double S=0;
        for (int i = 0; i < n; i++) {
            S=S+t[i];
        }
        return S;
    }
    public static void remplirTab(double []t, int n){
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("t["+i+"]=");
            t[i]=sc.nextFloat();
        }
    }
    public static void increment(double []t, int n,double x){
        for (int i = 0; i < n; i++) {
            t[i]=t[i]+x;  
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("donner la taille de tableau");
        int n = sc.nextInt();
        double []t=new double[n];
        remplirTab(t, n);
        double somInt=somme(t, n);
        System.out.println("la somme initiale est "+somInt);
        System.out.println("donner la valeur x");
        double x=sc.nextDouble();
        increment(t, n, x);
        System.out.println("tab aprés incrementation");
        for (int i = 0; i < n; i++) {
            System.out.println("t["+i+"]="+t[i]);
        }
        double newSomme = somme(t, n);
        System.out.println("La nouvelle somme est " + newSomme);

    }
}