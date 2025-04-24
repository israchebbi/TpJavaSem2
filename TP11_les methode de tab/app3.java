
import java.util.Scanner;

public class app3{
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
    public static void remplin(int t [],int n){
        Scanner sc = new Scanner (System.in);
        int [] T =new int[n];
        String ch;
        for (int i=0;i<n ;i++){
            ch = "";
            do{
                System.out.print("Donner un entier N°" + (i+1) + " : ");
                ch = sc.next();
                try{
                    tab[i] = Integer.parseInt(ch);
                }catch(Exception e){
                    ch = "";
                }
            }while(ch == "");
        }
    }
    public static void CreerTpair(int[] tab, int[] tabP){
        int j = 0;
        for(int i = 0; i < tab.length; i++){
            if (tab[i] % 2 == 0){
                tabP[j] = tab[i];
                j++;
            }
        }
    }

    public static void CreerTimpair(int[] tab, int[] tabI){
        int n1 = 0;
        for(int i = 0; i < tab.length; i++){
            if (tab[i] % 2 != 0){
                tabI[n1] = tab[i];
                n1++;
            }
        }
    }

    public static void Afficher(int[] tab, int nb){
        for (int i = 0; i < nb; i++){
            System.out.println(tab[i]);
        }
    }

    public static void main(String[] args){
        int n = LectureN();
        int n1;

        int[] tab = new int[n];
        RemplirTab(tab, n);

        int[] tabP = new int[n];
        CreerTpair(tab, tabP);

        int[] tabI = new int[n];
        CreerTimpair(tab, tabI);

        System.out.println("Tableau original : ");
        Afficher(tab, n);

        System.out.println("Tableau pair : ");
        Afficher(tabP, n);

        System.out.println("Tableau impair : ");
        Afficher(tabI, n);
    }
}