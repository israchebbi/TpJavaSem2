public class ex11{
    public static void main(String[]args){
        int [] entiers =new int[10];
        System.out.println("veuillez entre 10 entiers srrtictement positif");
        for (int i=0;i<10;i++) {
            entiers[i]=methode.lectureN();
        }
    
        System.out.println("les entiers paires sont :");
        for (int n : entiers){
            if (methode.EstPair(n)) {
                System.out.print(n+" ");
                
            }
        }
    
    
    }
}