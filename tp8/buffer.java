
import java.util.Scanner;

public class buffer{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String mot1,mot2,ch;
        int l1,l2;
        StringBuffer text;
        do { 
            System.out.println("donner une chaine de caracteres");
        } while (ch.length()>50);
        do { 
            System.out.println("donner le mot1");
            mot1=sc.nextLine();
            System.out.println("donner le mot2");
            mot2=sc.nextLine();
        } while ((mot1.length()>10) || (mot2.length()>10));
        text=new StringBuffer(ch);
        l1=mot1.length();
        l2=mot2.length();
        while (text.indexOf(mot1)!= -1) { 
           pos=text.indexOf(mot1);
           text=text.indexOf(mot2); 
        }
    }
}