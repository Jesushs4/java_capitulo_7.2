public class Ejercicio1{
    public static void main(String args[]) {
        int[][] array = new int[3][6];
        array[0][0] = 0;
        array[0][1] = 30;
        array[0][2] = 2;
        array[0][5] = 5;
        array[1][0] = 75;
        array[1][4] = 0;
        array[2][2] = -2;
        array[2][3] = 9;
        array[2][5] = 11;
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","Array num","Columna 0","Columna 1","Columna 2","Columna 3","Columna 4","Columna 5");
        for (int i=0; i<3; i++) {
            System.out.printf("Fila %-12    d",i);
            for (int j=0; j<6; j++) {
                System.out.printf("%-15d",array[i][j]);
            }
            System.out.println();
        }
        
    }
}