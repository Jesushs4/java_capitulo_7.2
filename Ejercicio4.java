public class Ejercicio4 {
    public static void main(String args[]) throws InterruptedException {
        int totalsum = 0;
        int partialsum = 0;
        int[][] array = new int[4][5];
        for (int i=0; i<4; i++) {
            partialsum = 0;
            for (int j=0; j<5; j++) {
                array[i][j] = ((int)(Math.random()*(1000-100)))+100;
                System.out.printf("%-5d",array[i][j]);
                partialsum+=array[i][j];
            }
            Thread.sleep(500);
            System.out.printf("| %-5d\n",partialsum);
            totalsum+=partialsum;
        }
        System.out.printf("-------------------------------\n");
        for (int i=0; i<5; i++) {
            partialsum=0;
            for (int j=0; j<4; j++) {
                partialsum+=array[j][i];
            }
            Thread.sleep(500);
            System.out.printf("%-5d",partialsum);
            totalsum+=partialsum;
        }
        Thread.sleep(500);
        System.out.printf("| %-5d",totalsum);
    }
    
}
