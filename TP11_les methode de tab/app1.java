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
   public static void RemplirTab(int []t ,int n){
    Scanner sc=new Scanner(System.in);
    System.out.println("donner le nombre des cases");
    //int [] t= new int [n];
    int i;
    
    for ( i = 0; i < n; i++) {
        System.out.println("t["+i+"]=");
        t[i]=sc.nextInt();
    }
   }
   public static void remplacer(int []t , int n , int x1,int x2){
    for (int i = 0; i < n; i++) {
        if (t[i]==x1) {
            t[i]=x2;
        }
    }
   }
   public static void affiche(int []t, int n) {
    for (int i = 0; i < n; i++) {
        System.out.println("t["+i+"]="+t[i]);
    }
       
   }
   public static void main(String[] args) {
       int n, x1,x2;
    int []t=new int [100];
    Scanner sc=new Scanner(System.in);
    n=lectureN();
    RemplirTab(t, n);
    System.out.println("donner x1");
    x1=sc.nextInt();
    System.out.println("donner x2");
    x2=sc.nextInt();
    remplacer(t, n, x1, x2);
    affiche(t, n);
   }
}