import java.util.Scanner;

class max {
    Scanner sc = new Scanner(System.in);

    public void one_int_max() {
        System.out.println("enter size of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter element # " + (i + 1) + " = ");
            arr[i] = sc.nextInt();

        }
        int max = Integer.MIN_VALUE;
        for (int element : arr) {
            if(element > max){
                max = element;
            }
        }
        System.out.println("maximum value = " + max);
    }

    public void one_float_max() {
        System.out.println("enter size of array = ");
        int n = sc.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter element # " + (i + 1) + " = ");
            arr[i] = sc.nextFloat();

        }
        float max = -Float.MAX_VALUE;
        for (float element : arr) {
            if(element > max){
                max = element;
            }
        }
        System.out.println("maximum value = " + max);
    }

    public void one_double_max() {
        System.out.println("enter size of array = ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter element # " + (i + 1) + " = ");
            arr[i] = sc.nextDouble();

        }
        double max = -Double.MAX_VALUE;
        for (double element : arr) {
            if(element > max){
                max = element;
            }
        }
        System.out.println("maximum value = " + max);
    }

    public void two_init_max() {
        System.out.println("enter no of rows = ");
        int row = sc.nextInt();
        System.out.println("enter no of coloumns = ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("enter element [%d][%d] = ", i, j);
                arr[i][j] = sc.nextInt();

            }

        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

        }
        System.out.println("maximum elements = " + max);
    }

    public void two_float_max() {
        System.out.println("enter no of rows = ");
        int row = sc.nextInt();
        System.out.println("enter no of coloumns = ");
        int col = sc.nextInt();

        float[][] arr = new float[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("enter element [%d][%d] = ", i, j);
                arr[i][j] = sc.nextFloat();

            }

        }
        float max = -Float.MAX_VALUE;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

        }
        System.out.println("maximum elements = " + max);
    }

    public void two_double_max() {
        System.out.println("enter no of rows = ");
        int row = sc.nextInt();
        System.out.println("enter no of coloumns = ");
        int col = sc.nextInt();

        double[][] arr = new double[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("enter element [%d][%d] = ", i, j);
                arr[i][j] = sc.nextDouble();

            }

        }
        double max = -Double.MAX_VALUE;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

        }
        System.out.println("maximum elements = " + max);
    }

    public void three_int_max(){
        System.out.println("enter no of rows = ");
        int row = sc.nextInt();
        System.out.println("enter no of coloumns = ");
        int col = sc.nextInt();
        System.out.println("enter no of z elements = ");
        int zd = sc.nextInt();

        int[][][] arr = new int[row][col][zd];

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                for (int k = 0; k < zd; k++) {
                    System.out.printf("enter element [%d][%d][%d] = \n",i,j,k);
                    arr[i][j][k] = sc.nextInt();
                }

            }

        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                for (int k = 0; k < zd; k++) {
                    if (arr[i][j][k] > max) {
                        max = arr[i][j][k];
                    }

                }

            }

        }
        System.out.println("maximum value = "+max);

    }
    public void three_float_max(){
        System.out.println("enter no of rows = ");
        int row = sc.nextInt();
        System.out.println("enter no of coloumns = ");
        int col = sc.nextInt();
        System.out.println("enter no of z elements = ");
        int zd = sc.nextInt();

        float[][][] arr = new float[row][col][zd];

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                for (int k = 0; k < zd; k++) {
                    System.out.printf("enter element [%d][%d][%d] = \n",i,j,k);
                    arr[i][j][k] = sc.nextFloat();
                }

            }

        }
        float max = -Float.MAX_VALUE;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                for (int k = 0; k < zd; k++) {
                    if (arr[i][j][k] > max) {
                        max = arr[i][j][k];
                    }

                }

            }

        }
        System.out.println("maximum value = "+max);

    }
    public void three_double_max(){
        System.out.println("enter no of rows = ");
        int row = sc.nextInt();
        System.out.println("enter no of coloumns = ");
        int col = sc.nextInt();
        System.out.println("enter no of z elements = ");
        int zd = sc.nextInt();

        double[][][] arr = new double[row][col][zd];

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                for (int k = 0; k < zd; k++) {
                    System.out.printf("enter element [%d][%d][%d] = \n",i,j,k);
                    arr[i][j][k] = sc.nextDouble();
                }

            }

        }
        double max = -Double.MAX_VALUE;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                for (int k = 0; k < zd; k++) {
                    if (arr[i][j][k] > max) {
                        max = arr[i][j][k];
                    }

                }

            }

        }
        System.out.println("maximum value = "+max);

    }


}

class min{
    Scanner sc = new Scanner(System.in);

    public void one_int_min() {
        System.out.println("enter size of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter element # " + (i + 1) + " = ");
            arr[i] = sc.nextInt();

        }
        int min = Integer.MAX_VALUE;
        for (int element : arr) {
            if(element < min){
                min = element;
            }
        }
        System.out.println("minimum value = " + min);
    }

    public void one_float_min() {
        System.out.println("enter size of array = ");
        int n = sc.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter element # " + (i + 1) + " = ");
            arr[i] = sc.nextFloat();

        }
        float min = Float.MAX_VALUE;
        for (float element : arr) {
            if(element < min){
                min = element;
            }
        }
        System.out.println("minimum value = " + min);
    }

    public void one_double_min() {
        System.out.println("enter size of array = ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter element # " + (i + 1) + " = ");
            arr[i] = sc.nextDouble();

        }
        double min = Double.MAX_VALUE;
        for (double element : arr) {
            if(element > min){
                min = element;
            }
        }
        System.out.println("maximum value = " + min);
    }

    public void two_init_min() {
        System.out.println("enter no of rows = ");
        int row = sc.nextInt();
        System.out.println("enter no of coloumns = ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("enter element [%d][%d] = ", i, j);
                arr[i][j] = sc.nextInt();

            }

        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }

        }
        System.out.println("minimum elements = " + min);
    }

    public void two_float_min() {
        System.out.println("enter no of rows = ");
        int row = sc.nextInt();
        System.out.println("enter no of coloumns = ");
        int col = sc.nextInt();

        float[][] arr = new float[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("enter element [%d][%d] = ", i, j);
                arr[i][j] = sc.nextFloat();

            }

        }
        float min = Float.MAX_VALUE;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }

        }
        System.out.println("minimum elements = " + min);
    }

    public void two_double_min() {
        System.out.println("enter no of rows = ");
        int row = sc.nextInt();
        System.out.println("enter no of coloumns = ");
        int col = sc.nextInt();

        double[][] arr = new double[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("enter element [%d][%d] = ", i, j);
                arr[i][j] = sc.nextDouble();

            }

        }
        double min = Double.MAX_VALUE;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }

        }
        System.out.println("minimum elements = " + min);
    }

    public void three_int_min(){
        System.out.println("enter no of rows = ");
        int row = sc.nextInt();
        System.out.println("enter no of coloumns = ");
        int col = sc.nextInt();
        System.out.println("enter no of z elements = ");
        int zd = sc.nextInt();

        int[][][] arr = new int[row][col][zd];

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                for (int k = 0; k < zd; k++) {
                    System.out.printf("enter element [%d][%d][%d] = \n",i,j,k);
                    arr[i][j][k] = sc.nextInt();
                }

            }

        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                for (int k = 0; k < zd; k++) {
                    if (arr[i][j][k] < min) {
                        min = arr[i][j][k];
                    }

                }

            }

        }
        System.out.println("minimum value = "+ min);

    }
    public void three_float_min(){
        System.out.println("enter no of rows = ");
        int row = sc.nextInt();
        System.out.println("enter no of coloumns = ");
        int col = sc.nextInt();
        System.out.println("enter no of z elements = ");
        int zd = sc.nextInt();

        float[][][] arr = new float[row][col][zd];

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                for (int k = 0; k < zd; k++) {
                    System.out.printf("enter element [%d][%d][%d] = \n",i,j,k);
                    arr[i][j][k] = sc.nextFloat();
                }

            }

        }
        float min = Float.MAX_VALUE;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                for (int k = 0; k < zd; k++) {
                    if (arr[i][j][k] < min) {
                        min = arr[i][j][k];
                    }

                }

            }

        }
        System.out.println("mimimum value = "+ min);

    }
    public void three_double_min(){
        System.out.println("enter no of rows = ");
        int row = sc.nextInt();
        System.out.println("enter no of coloumns = ");
        int col = sc.nextInt();
        System.out.println("enter no of z elements = ");
        int zd = sc.nextInt();

        double[][][] arr = new double[row][col][zd];

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                for (int k = 0; k < zd; k++) {
                    System.out.printf("enter element [%d][%d][%d] = \n",i,j,k);
                    arr[i][j][k] = sc.nextDouble();
                }

            }

        }
        double min = Double.MAX_VALUE;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                for (int k = 0; k < zd; k++) {
                    if (arr[i][j][k] < min) {
                        min = arr[i][j][k];
                    }

                }

            }

        }
        System.out.println("minimum value = "+ min);

    }
}