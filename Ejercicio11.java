public class Ejercicio11 {
    public static void main(String args[]) {
        int rows = 10;
        int columns = 10;
        int[][] array = new int[rows][columns];
        int maxnum = Integer.MAX_VALUE;
        int minnum = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        for (int i = 0; i<rows; i++) {
            for (int j = 0; j<columns; j++) {
                array[i][j] = (int)(Math.random()*(301-200))+200;
                System.out.printf("%-5d",array[i][j]);
            }
            System.out.println();
        } System.out.println();

        for (int i = 0; i<rows; i++) {
            for (int j = 0; j<columns; j++) {
                if (i==j) {
                System.out.printf("%-5d",array[i][j]); 
                if (array[i][j]<maxnum) {
                    maxnum = array[i][j];
                }
                if (array[i][j]>minnum) {
                        minnum = array[i][j];
                }
                sum+=array[i][j];
                count++;
                }
                else {
                    System.out.printf("%-5s","");
                    }
            }
        System.out.println();
    }
    System.out.printf("El número máximo es el %d y el mínimo el %d, la media de los números es %.2f",minnum,maxnum,(float)sum/count);
}
    
}
