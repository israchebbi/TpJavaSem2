import java.util.Scanner;
public class stringBuffer {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String mot1 , mot2 ;
        StringBuffer text;

        System.out.println("donner le text");
        text=new StringBuffer(sc.nextLine());

        System.out.println("donner le premier mot");
        mot1=sc.nextLine();
        
        System.out.println("donner un 2eme mot");
        mot2=sc.nextLine();
        
        if (text.indexOf(mot1)==-1) {
            System.out.println("mot1 n'existe pas");
        }else{
            text=new StringBuffer(text.toString().replace(mot1,mot2));
            System.out.println("le text modifié est "+text);
        } 
    }
}