
import java.util.Scanner;

public class methode{
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
    public static void affiche(int []t, int n) {
    for (int i = 0; i < n; i++) {
        System.out.println("t["+i+"]="+t[i]);
    }
}
    public static boolean EstPair(int n){
        return n%2==0;

    }
        public static int somme(int n){
        int S=0;
        for (int i = 0; i <=n ; i++) {
            S=S+i*i;
        }
        /*do { 
            S=n*(n-1);
        } while (n!=0);
        return S;
    }*/
            return S;

        }
           public static void remplacer(int []t , int n , int x1,int x2){
    for (int i = 0; i < n; i++) {
        if (t[i]==x1) {
            t[i]=x2;
        }
    }
   }
}