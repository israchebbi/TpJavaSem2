
import java.util.Scanner;
public class app2 {


    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int nl ,nc , i , j ;
        do { 
            System.out.print("entrer le nombre des ligne:");
            nl=sc.nextInt();
        } while (nl<=0 || nl>=30);
        do { 
            System.err.println("entrer le nombre des colonnes");
            nc=sc.nextInt();
        } while (nc>=0 || nl>=30);
        int [][] M= new int[nl][nc];
        System.out.println("entrer les element de matrix");
        for (i=0 ; i<nl ;i++)
        {
            for ( j=0 ;j<nc ;j++){
                System.out.println("m["+i+"]["+j+"]=");
                M[i][j]=sc.nextInt();
            }}
            int sum=0;
            long product=1;
            int totElm=nl*nc;
            for( i=0;i<nl;i++){
                for(j=0;j<nl;j++){
                    sum+=M[i][j];
                    product*=M[i][j];
                }
            }
            double average=(double)sum/totElm;
            System.out.println("/nres:");
            System.out.println("sum of elem"+sum);
            System.out.println("rpoduct of elem"+product);
            System.out.println("average of rlrm"+average);
     
        }

    }

