import java.util.Scanner;
//import javax.management.monitor.CounterMonitor;
public class exercice6{
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in); 
      String mot;
      int i;
      int occ=0;
      System.out.println("donner le mot");
      mot=sc.nextLine();
      for ( i=0;i<mot.length();i++){
        int voy=0;
        char ch= mot.charAt(i);
        if (ch=="a"){
            occ=occ+1;
        }
        System.out.println(occ+"fois la lettre a");
      }
    }
}