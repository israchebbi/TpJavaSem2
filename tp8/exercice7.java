
import java.util.Scanner;


public class exercice7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String verbe;
        do { 
           System.out.println("entrer un verbe de 1er group"); 
           verbe=sc.nextLine();
        } while ( ! verbe.endsWith("er") || verbe.equals("aller"));
           
      
        System.out.println("je "+verbe.replace("er","e"));
        System.out.println("tu "+verbe.replace("er","es"));
        System.out.println("il "+verbe.replace("er","e"));
        if (verbe.endsWith("ger")){
            System.out.println("nous "+verbe.replace("er","eons"));
            
        }
        else if(verbe.equals("commencer")){
            System.out.println("nous "+verbe.replace("cer","çons"));
        }
        else{

            System.out.println("nous "+verbe.replace("er","ons"));
        }
        
        System.out.println("vous "+verbe.replace("er","ez"));
        System.out.println("ils "+verbe.replace("er","ent"));
    


    }

}