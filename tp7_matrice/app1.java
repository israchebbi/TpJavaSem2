import java.util.Scanner;

public class app1{
    
        public static void main(String[] args) {
            int [][] M=new int[50][50];
            int nl, nc, i ,j ,x;
            boolean valid=false;
            
        Scanner sc =new Scanner(System.in);
        do {
        System.out.println("donner nl");
        nl=sc.nextInt();
        } while (nl>50);
        do{
        System.out.println("donner nc");
        nc=sc.nextInt();
        }while(nc>50);
        System.out.println("remplir le matrice");
        for (i=0 ;i<nl ;i++){
            for (j=0 ;j<nc ; j++){
                do { 
                    System.out.println("M["+i+","+j+"]=");
                    M[i][j]=sc.nextInt();
                } while (M[i][j]%2!=0);
            
            }
            
        }
        do {
            System.out.println("donner x");
            x=sc.nextInt();
        } while (x %2!=0);
        i=0;
        j=0;
        while (!valid && i<nl && j<nc) { 
            if (M[i][j]==x){
                valid=true;
            }else if (i<nl && j==(nc-1)){
                j=0;
                i++;
            }else{
                j++;
            }
        }
        if (valid){
            System.out.println(x+"validé!");

        }else{
            System.out.println(x+"n'est pas validé");
        }



    }
}