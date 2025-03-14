import java.util.Scanner;
public class methode2{
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
    public static int Compter( int n){
        
        int c=0; 

     while (n !=0) {
        c++;
        n=n/10; 
         
     }
        return c;
}
}