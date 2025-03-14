import java.util.Scanner;  
public class methode{
        public static int lectureN(){
            Scanner sc=new Scanner(System.in);
            int n;
            do { 
                System.out.println("entrez un entier strictement positif: ");   
             while (! sc.hasNextInt()){
                System.out.println("erreur: veuillz entrer un entier valide .");
                sc.next();
            }
            n=sc.nextInt();
            if (n<=0) {
               System.out.println("erreur : l'entier doit etre stricatement positif :"); 
            }
        }while(n<=0);
        return n;
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
    }
    

