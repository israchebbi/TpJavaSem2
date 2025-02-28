import java.util.Scanner;
public class appcour {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String mot1 , mot2 ,text,x;
        //StringBuffer text;
        text=sc.nextLine();
        System.out.println("donner le text");
        mot1=sc.nextLine();
        System.out.println("donner le premier mot");
        mot2=sc.nextLine();
        System.out.println("donner un 2eme mot");
        int l,p;
        if (text.indexOf(mot1)==-1) {
            System.out.println("mot1 n'exste pas");
        }
        else{
            l=mot1.length(); 
                p=text.indexOf(mot1);
                x=text.replace(mot1,mot2);
                System.out.println("le text mmodifié est"+x);
                        }
        }
        } 
    

