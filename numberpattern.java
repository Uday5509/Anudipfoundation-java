public class numberpattern{

    
    public static void main(String[] args) {
        int num =1;
    
        
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5-i; k++) {
                System.out.print(num+"  ");
                num++;
            }
           /*
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(" ");
            }
            */
            System.out.println();
        
        
        }
    }
}
