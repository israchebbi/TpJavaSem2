
import java.util.Scanner;

public class exercice2{
    public static double addition(double a, double b){
        return a+b;
    }
    public static double soustraction(double a ,double b){
        return a-b;
    }
    public static double multeplication (double a ,double b){
        return a*b;
    }
    public static double devision (double a , double b){
        if (b==0){
            System.out.println("c'est unedevision par 0");
            return 0;
        }
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("*,-,+,/");
        char operteur=sc.next().charAt(0);
        System.out.println("donner un réel a");
        double a=sc.nextDouble();
        System.out.println("donnerun réel b");
        double b= sc.nextDouble();
        double res=0;
        switch (operteur) {
            case '+' -> res=addition( a,b);
            case '-' -> res=soustraction(a, b);
            case '*' -> res=multeplication(a, b);
            case '/' -> res=devision(a, b);
            default -> System.out.println("operation fausse");
        }
        /*        if (operteur == '+'){
            res=addition( a,b);
        }else if (operteur == '-'){
            res=soustraction(a, b);
        }else if (operteur == '*'){
            res=multeplication(a, b);
        }else if (operteur == '/') {
            res=devision(a, b);
        }else{
            System.out.println("operation fausse");
        }*/
        System.out.println(res);
    }
     
}