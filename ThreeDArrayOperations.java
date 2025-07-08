import java.util.Random;
public class ThreeDArrayOperations {
    public static void main(String[] args) {  
        int[][][] array = new int[3][3][3];
        Random rand = new Random();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int totalElements = 0;
        System.out.println("3D Array Elements:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = rand.nextInt(100);  
                    System.out.print(array[i][j][k] + " ");
                    if (array[i][j][k] > max) {
                        max = array[i][j][k];
                    }
                    sum += array[i][j][k];
                    totalElements++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum Value: " + max);
        double average = (double) sum / totalElements;
        System.out.println("Average of all elements: " + average);}
}