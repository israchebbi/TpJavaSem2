package examentp_isra_chebbi;

import java.util.Scanner;

public class exercice1 {
    public static double convertir (String ch){
        double n;
        Scanner sc= new Scanner(System.in);
        System.out.println("donner une chaine ");
        String ch1=sc.nextLine();
        n=ch.parseDouble(ch1);
        return n ;
    }
    public static void afficher (int [][]m,int nl,int nc){
            for (int i = 0; i < nl; i++) {
                for (int j = 0;j  < nc; i++) {
                    System.out.println("m["+i+"]["+j+"]= ");
                }
    }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("donner une chaine (double) : ");
        String ch=sc.nextLine();
        double n=convertir(ch);
        System.out.println("la chhine convertie est :"+n);
    }
}
