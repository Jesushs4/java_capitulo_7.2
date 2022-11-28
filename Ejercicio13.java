public class Ejercicio13 {
    public static void main(String args[]) {
        int rows = 4;
        int columns = 10;
        String[] countries = {"España","Rusia","Japón","Australia"};
        int[][] height = new int[rows][columns];
        System.out.printf("%57s %s %s\n","MED","MIN","MAX");
        for (int i = 0; i<rows; i++) {
            System.out.printf("%10s: ",countries[i]);
            int minnum = Integer.MAX_VALUE;
            int maxnum = Integer.MIN_VALUE;
            int sumheight = 0;
            for (int j = 0; j<columns; j++) {
                    height[i][j] = (int)(Math.random()*(211-140))+140;
                    System.out.print(height[i][j]+" ");
                    if (height[i][j]>maxnum) {
                        maxnum = height[i][j];
                    }
                    if (height[i][j]<minnum) {
                        minnum = height[i][j];
                    }
                    sumheight+=height[i][j];
            }
            System.out.print("| "+sumheight/columns+" "+minnum+" "+maxnum);
            System.out.println();
        }
    }
    
}
