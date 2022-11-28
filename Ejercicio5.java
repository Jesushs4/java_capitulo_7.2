public class Ejercicio5 {
    public static void main(String args[]) {
        int rows = 6;
        int columns = 10;
        int maxnum = Integer.MAX_VALUE;
        int minnum = Integer.MIN_VALUE;
        int posxmax = 0;
        int posymax = 0;
        int posxmin = 0;
        int posymin = 0;
        int[][] array = new int[rows][columns];
        for (int j = 0; j<columns; j++) {
            System.out.printf("%5d",j);
        } System.out.println();
        for (int i = 0; i<rows; i++) {
            System.out.print(i+"  ");
            for (int j = 0; j<columns; j++) {
                array[i][j] = (int)(Math.random()*1001);
                System.out.printf("%-5d",array[i][j]);
                if (array[i][j]<maxnum) {
                    maxnum = array[i][j];
                    posxmin = i;
                    posymin = j;
                }
                if (array[i][j]>minnum) {
                    minnum = array[i][j];
                    posxmax = i;
                    posymax = j;
                }
            }
        System.out.println();
        }
        System.out.printf("\nEl máximo se encuentra en la fila %d y la columna %d y es el valor %d", posxmax, posymax, minnum);
        System.out.printf("\nEl mínimo se encuentra en la fila %d y la columna %d y es el valor %d", posxmin, posymin, maxnum);

    }
    
}
