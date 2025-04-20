import java.util.Scanner;
public class app2{
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
    public static void RemplirTab(int []t ,int n){
        Scanner sc=new Scanner(System.in);
        System.out.println("donner le nombre des cases");
        int i;
        
        for ( i = 0; i < n; i++) {
            System.out.println("t["+i+"]=");
            t[i]=sc.nextInt();
        }
    }
    public static double calcul_moy (int[]t , int n){
        double S=0;
        double moy=0;
        for (int i = 0; i < n; i++) {
            S=S+t[i];
            moy=moy/n;
        }
        return  moy;
    }
    public static double  nombre_note( int []t ,int n,double moy){
        int m=0;
        for (int i = 0; i < n; i++) {
            if (t[i]>moy) {
                m=m+1;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int n;
        int []t=new int[100];
        //Scanner sc=new Scanner(System.in);
        n=lectureN();
        RemplirTab(t, n);
        calcul_moy(t, n);
        System.out.println("la moyenne est "+calcul_moy(t, n));
        System.out.println("le nombre des notes > au moyenne "+nombre_note(t, n, n));
    }
}