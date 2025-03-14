
import java.util.Scanner;   

public class ex1{
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


public static void main(String[]args){
    int [] entiers =new int[10];
    System.out.println("veuillez entre 10 entiers srrtictement positif");
    for (int i=0;i<10;i++) {
        entiers[i]=lectureN();
    }

    System.out.println("les entiers paires sont :");
    for (int n : entiers){
        if (EstPair(n)) {
            System.out.print(n+" ");
            
        }
    }


}
}