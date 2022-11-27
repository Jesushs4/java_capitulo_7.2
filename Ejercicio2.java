public class Ejercicio2 {
    public static void main(String args[]) {
        int totalsum = 0;
        int partialsum = 0;
        int[][] array = new int[4][5];
        for (int i=0; i<4; i++) {
            partialsum = 0;
            for (int j=0; j<5; j++) {
                array[i][j] = (int)(Math.random()*51);
                System.out.printf("%-5d",array[i][j]);
                partialsum+=array[i][j];
            }
            System.out.printf("| %-5d\n",partialsum);
            totalsum+=partialsum;
        }
        System.out.printf("-------------------------------\n");
        for (int i=0; i<5; i++) {
            partialsum=0;
            for (int j=0; j<4; j++) {
                partialsum+=array[j][i];
            }
            System.out.printf("%-5d",partialsum);
            totalsum+=partialsum;
        }
        System.out.printf("| %-5d",totalsum);
    }
    
}
