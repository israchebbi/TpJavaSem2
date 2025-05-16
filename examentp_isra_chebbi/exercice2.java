package examentp_isra_chebbi;

import java.util.Scanner;

public class exercice2 {
    public static double remise(String vol[][],int n){
        //double vol[][]=new double [4][5];

    double remise;
    for (int i = 0; i < 10; i++) {
        for (int j = n;j < n; j++) {
            String ch =vol[i][n];
          double prix=exercice1.convertir(ch);
            remise=prix*0.8;
        }
    }return remise;
    }
    public static void main(String[] args) {
        String vol[][]={{"1","2","3","4"}, {"tozeur","tozur","tunis","djerba"},{"djerba","tunis","djerba","sfax"},{"ab01","ab02","ab03","ab04"},{"a1","a2","a3","a4"},{"156","250","140","120"}};
        Scanner sc=new Scanner (System.in);
        String lettre;

        for (int i = 0; i < 3; i++) {
        do { 
            System.out.println("donner la 1er lettre dela detination");
            lettre=sc.nextLine();
        } while (vol[i][2].startsWith(lettre));
            for (int j = 0; j < 5; j++) {
              System.out.println("volnum"+i+" |vdep"+ i+1 +"vdest| "+ i+2 +"code av"+i+3+"|prix :"+i+4);  

            }

                
            }
            System.out.println("application d'un remise de 20% ...");
            System.out.println("tableau apres remise  :" );
            for (int i = 0; i < 3; i++) {
                double price=remise(vol, i);
                System.out.println("volnum"+i+" |vdep"+ i+1 +"vdest| "+ i+2 +"code av"+i+3+"|prix :"+price);  
            }
            
        }

        }

