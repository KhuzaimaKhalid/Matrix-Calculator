import java.util.Arrays;
import java.util.Scanner;
abstract class matrix{
    protected int row;
    protected int col;
    protected Scanner sc = new Scanner(System.in);
    public abstract void init();
    public abstract void input();
    public abstract void add();
    public abstract void sub();
    public abstract void mul();
    public abstract void printm();
    public abstract void close();



}
class int_matrix extends matrix{


    private int[][] mat1;
   private int[][] mat2;
   private int[][] resa; // addition
   private  int[][] resb; // subraction
  private   int[][] resc; // multiplication



    public void init() {
        System.out.println("enter row size = ");
         row = sc.nextInt();
        System.out.println("enter coloumn size = ");
         col = sc.nextInt();

         mat1 = new int[row][col];
         mat2 = new int[row][col];
         resa = new int[row][col];
         resb = new int[row][col];
         resc = new int[row][col];
    }
    public void input() {
        System.out.println("ENTER ELEMENTS OF FIRST MATRIX");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("enter element [%d][%d] = ", i, j);
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("ENTER ELEMENTS OF SECOND MATRIX");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("enter element [%d][%d] = ", i, j);
                mat2[i][j] = sc.nextInt();
            }
        }
    }
    public void add() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                resa[i][j] = mat1[i][j] + mat2[i][j];

            }
        }
    }
    public void sub() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                resb[i][j] = mat1[i][j] - mat2[i][j];

            }
        }
    }
    public void mul() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                resc[i][j] = mat1[i][j] * mat2[i][j];

            }
        }
    }
    // for printing matrixes
    public void printm(){
        System.out.println("FIRST MATRIX");
        print(mat1);
        System.out.println("SECOND MATRIX");
        print(mat2);
        System.out.println("RESULTANT MATRIX OF ADDITION");
        print(resa);
        System.out.println("RESULTANT MATRIX OF SUBTRACTION");
        print(resb);
        System.out.println("RESULTANT MATRIX OF MULTIPLICATION");
        print(resc);
    }
    // for printing to give to printm method
    public void print(int[][] matrix){
        for(int i = 0; i < row;i++){
            for(int j = 0; j < col; j++){
                System.out.print("\t"+matrix[i][j]);
            }
            System.out.println();
        }

    }
   public void close(){
        sc.close();
   }

}

class float_matrix extends matrix{

    private float[][] mat1;
    private float[][] mat2;
    private float[][] resa; // addition
    private  float[][] resb; // subraction
    private   float[][] resc; // multiplication
    @Override
    public void init() {
        System.out.println("enter row size = ");
        row = sc.nextInt();
        System.out.println("enter coloumn size = ");
        col = sc.nextInt();

        mat1 = new float[row][col];
        mat2 = new float[row][col];
        resa = new float[row][col];
        resb = new float[row][col];
        resc = new float[row][col];
    }
    public void input() {
        System.out.println("ENTER ELEMENTS OF FIRST MATRIX");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("enter element [%d][%d] = ", i, j);
                mat1[i][j] = sc.nextFloat();
            }
        }
        System.out.println("ENTER ELEMENTS OF SECOND MATRIX");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("enter element [%d][%d] = ", i, j);
                mat2[i][j] = sc.nextFloat();
            }
        }
    }
    public void add() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                resa[i][j] = mat1[i][j] + mat2[i][j];

            }
        }
    }
    public void sub() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                resb[i][j] = mat1[i][j] - mat2[i][j];

            }
        }
    }
    public void mul() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                resc[i][j] = mat1[i][j] * mat2[i][j];

            }
        }
    }
    // for printing matrixes
    public void printm(){
        System.out.println("FIRST MATRIX");
        print(mat1);
        System.out.println("SECOND MATRIX");
        print(mat2);
        System.out.println("RESULTANT MATRIX OF ADDITION");
        print(resa);
        System.out.println("RESULTANT MATRIX OF SUBTRACTION");
        print(resb);
        System.out.println("RESULTANT MATRIX OF MULTIPLICATION");
        print(resc);
    }
    // for printing to give to printm method
    public void print(float[][] matrix){
        for(int i = 0; i < row;i++){
            for(int j = 0; j < col; j++){
                System.out.print("\t"+matrix[i][j]);
            }
            System.out.println();
        }

    }
    public void close(){
        sc.close();
    }

}

class double_matrix extends matrix{
    private double[][] mat1;
    private double[][] mat2;
    private double[][] resa; // addition
    private  double[][] resb; // subtraction
    private   double[][] resc; // multiplication



    public void init() {
        System.out.println("enter row size = ");
        row = sc.nextInt();
        System.out.println("enter coloumn size = ");
        col = sc.nextInt();

        mat1 = new double[row][col];
        mat2 = new double[row][col];
        resa = new double[row][col];
        resb = new double[row][col];
        resc = new double[row][col];
    }
    public void input() {
        System.out.println("ENTER ELEMENTS OF FIRST MATRIX");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("enter element [%d][%d] = ", i, j);
                mat1[i][j] = sc.nextDouble();
            }
        }
        System.out.println("ENTER ELEMENTS OF SECOND MATRIX");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("enter element [%d][%d] = ", i, j);
                mat2[i][j] = sc.nextDouble();
            }
        }
    }
    public void add() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                resa[i][j] = mat1[i][j] + mat2[i][j];

            }
        }
    }
    public void sub() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                resb[i][j] = mat1[i][j] - mat2[i][j];

            }
        }
    }
    public void mul() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                resc[i][j] = mat1[i][j] * mat2[i][j];

            }
        }
    }
    // for printing matrixes
    public void printm(){
        System.out.println("FIRST MATRIX");
        print(mat1);
        System.out.println("SECOND MATRIX");
        print(mat2);
        System.out.println("RESULTANT MATRIX OF ADDITION");
        print(resa);
        System.out.println("RESULTANT MATRIX OF SUBRACTION");
        print(resb);
        System.out.println("RESULTANT MATRIX OF MULTIPLICATION");
        print(resc);
    }
    // for printing to give to printm method
    public void print(double[][] matrix){
        for(int i = 0; i < row;i++){
            for(int j = 0; j < col; j++){
                System.out.print("\t"+matrix[i][j]);
            }
            System.out.println();
        }

    }
    public void close(){
        sc.close();
    }

}

public class Matrix_Calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        do{
            System.out.println("================================= MATRIX CALCULATOR =======================================");
            System.out.println("choose data type : ");
            System.out.println("1. Integer");
            System.out.println("2. Float");
            System.out.println("3. Double");
            System.out.println("4. Integer Reverse 1-D array");
            System.out.println("5. Float Reverse 1-D array");
            System.out.println("6. Double Reverse 1-D array");
            System.out.println("7. Int Reverse 2-D array");
            System.out.println("8. Float Reverse 2-D array");
            System.out.println("9. Double Reverse 2-D array");
            System.out.println("10. Int Reverse 3-D array");
            System.out.println("11. Float Reverse 3-D array");
            System.out.println("12. Double Reverse 3-D array");
            System.out.println("13. Find integer Minimum Value for 1-D Array");
            System.out.println("14. Find float Minimum Value for 1-D Array");
            System.out.println("15. Find double Minimum Value for 1-D Array");
            System.out.println("16. Find integer Minimum Value for 2-D Array");
            System.out.println("17. Find float Minimum Value for 2-D Array");
            System.out.println("18. Find double Minimum Value for 2-D Array");
            System.out.println("19. Find integer Minimum Value for 3-D Array");
            System.out.println("20. Find float Minimum Value for 3-D Array");
            System.out.println("21. Find double Minimum Value for 3-D Array");
            System.out.println("22. Find integer Maximum Value for 1-D Array");
            System.out.println("23. Find float Maximum Value for 1-D Array");
            System.out.println("24. Find double Maximum Value for 1-D Array");
            System.out.println("25. Find integer Maximum Value for 2-D Array");
            System.out.println("26. Find float Maximum Value for 2-D Array");
            System.out.println("27. Find double Maximum Value for 2-D Array");
            System.out.println("28. Find integer Maximum Value for 3-D Array");
            System.out.println("29. Find float Maximum Value for 3-D Array");
            System.out.println("30. Find double Maximum Value for 3-D Array");
            System.out.println("31. Exit");

            System.out.print("Enter Here = ");
            int choice = obj.nextInt();
            System.out.println();

            matrix m = null;
            Array_Caller ar = new Array_Caller();
            max max = new max();
            min min = new min();


            if (choice == 1) {
                m = new int_matrix();

            } else if (choice == 2) {
                m = new float_matrix();
            } else if (choice == 3) {
                m = new double_matrix();
            } else if (choice == 4) {
                ar.int_arr();
                continue;
            } else if (choice == 5) {
                ar.float_array();
                continue;
            } else if (choice == 6) {
                ar.double_array();
                continue;
            } else if (choice == 7) {
                ar.int_2_array();
                continue;
            } else if (choice == 8) {
                ar.float_2_array();
                continue;
            } else if (choice == 9) {
                ar.double_2_array();
                continue;
            }  else if (choice == 10) {
                ar.int_3_array();
                continue;
            } else if (choice == 11) {
                ar.float_3_array();
                continue;
            } else if (choice == 12) {
                ar.double_3_array();
                continue;
            } else if (choice == 13) {
                min.one_int_min();
                continue;
            } else if (choice == 14) {
                min.one_float_min();
                continue;
            }else if (choice == 15) {
                min.one_double_min();
                continue;
            }else if (choice == 16) {
                min.two_init_min();
                continue;
            }else if (choice == 17) {
                min.two_float_min();
                continue;
            }else if (choice == 18) {
                min.two_double_min();
                continue;
            }else if (choice == 19) {
                min.three_int_min();
                continue;
            }else if (choice == 20) {
                min.three_float_min();
                continue;
            }else if (choice == 21) {
                min.three_double_min();
                continue;
            }else if (choice == 22) {
                max.one_int_max();
                continue;
            }else if (choice == 23) {
                max.one_float_max();
                continue;
            }else if (choice == 24) {
                max.one_double_max();
                continue;
            }else if (choice == 25) {
                max.two_init_max();
                continue;
            }else if (choice == 26) {
                max.two_float_max();
                continue;
            }else if (choice == 27) {
                max.two_double_max();
                continue;
            }else if (choice == 28) {
                max.three_int_max();
                continue;
            }else if (choice == 29) {
                max.three_float_max();
                continue;
            }else if (choice == 30) {
                max.three_double_max();
                continue;
            }else if(choice == 31){
                System.out.println("Exiting Calculator..................");
                System.out.println("Thank You!");
                break;
            }
            else {
                System.out.println("Invalid choice!");
                continue;
            }

            m.init();
            m.input();

            int op;

            while(true) {

                System.out.println("================== OPERATION SELECTION MENU =====================");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Addition & Multiplication");
                System.out.println("5. Subtraction & Multiplication");
                System.out.println("6. Addition & Subtraction");




                System.out.print("Enter Here = ");
                op = obj.nextInt();

                if (op >= 1 && op <= 6) {
                    break;
                } else {
                    System.out.println("please enter a valid option!");
                }
            }
            switch (op){
                case 1:
                    m.add();
                    m.printm();
                    break;
                case 2:
                    m.sub();
                    m.printm();
                case 3:
                    m.mul();
                    m.printm();
                case 4:
                    m.add();
                    m.mul();
                    m.printm();
                case 5:
                    m.sub();
                    m.mul();
                    m.printm();
                case 6:
                    m.add();
                    m.sub();
                    m.printm();

                default:
                    System.out.println("please enter a valid option!");
            }
        }while(true);

        obj.close();

        }


    }
class Array_Caller {
    Scanner sc = new Scanner(System.in);

    public void int_arr() {
        System.out.println("enter size of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter element # " + (i + 1) + " = ");
            arr[i] = sc.nextInt();

        }
        reverse_array rev = new int_reverse();
        rev.reverse(arr);
        System.out.println("Reversed Array = " + Arrays.toString(arr));
    }

    public void float_array() {
        System.out.println("enter size of array = ");
        int n = sc.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter element # " + (i + 1) + " = ");
            arr[i] = sc.nextFloat();

        }
        reverse_array rev = new float_reverse();
        rev.reverse(arr);
        System.out.println("Reversed Array = " + Arrays.toString(arr));
    }

    public void double_array() {
        System.out.println("enter size of array = ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter element # " + (i + 1) + " = ");
            arr[i] = sc.nextDouble();

        }
        reverse_array rev = new double_array();
        rev.reverse(arr);
        System.out.println("Reversed Array = " + Arrays.toString(arr));
    }

    public void int_2_array() {
        System.out.println("enter no of rows = ");
        int row = sc.nextInt();
        System.out.println("enter no of columns = ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("enter element [%d][%d] = \n" , i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        reverse_array rev = new int_reverse();
        rev.reverse(arr);
        System.out.println("Reversed Array = " + Arrays.deepToString(arr));

    }

    public void float_2_array() {
        System.out.println("enter no of rows = ");
        int row = sc.nextInt();
        System.out.println("enter no of columns = ");
        int col = sc.nextInt();
        float[][] arr = new float[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("enter element [%d][%d] = \n" , i, j);
                arr[i][j] = sc.nextFloat();
            }
        }
        reverse_array rev = new float_reverse();
        rev.reverse(arr);
        System.out.println("Reversed Array = " + Arrays.deepToString(arr));
    }

    public void double_2_array() {
        System.out.println("enter no of rows = ");
        int row = sc.nextInt();
        System.out.println("enter no of columns = ");
        int col = sc.nextInt();
        double[][] arr = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("enter element [%d][%d] = \n" , i, j);
                arr[i][j] = sc.nextDouble();
            }
        }
        reverse_array rev = new double_array();
        rev.reverse(arr);
        System.out.println("Reversed Array = " + Arrays.deepToString(arr));
    }

    public void int_3_array() {
        System.out.println("enter no of rows = ");
        int row = sc.nextInt();
        System.out.println("enter no of columns = ");
        int col = sc.nextInt();
        System.out.println("enter no of z direction = ");
        int zd = sc.nextInt();
        int[][][] arr = new int[row][col][zd];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                for (int k = 0; k < zd; k++) {
                    System.out.printf("enter element [%d][%d][%d] = \n" , i, j,k);
                    arr[i][j][k] = sc.nextInt();
                }

            }

        }
        reverse_array rev = new int_reverse();
        rev.reverse(arr);
        System.out.println("Reversed Array = " + Arrays.deepToString(arr));
    }

    public void float_3_array() {
        System.out.println("enter no of rows = ");
        int row = sc.nextInt();
        System.out.println("enter no of columns = ");
        int col = sc.nextInt();
        System.out.println("enter no of z direction = ");
        int zd = sc.nextInt();
        float[][][] arr = new float[row][col][zd];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                for (int k = 0; k < zd; k++) {
                    System.out.printf("enter element [%d][%d][%d] = \n" , i, j,k);
                    arr[i][j][k] = sc.nextFloat();
                }

            }

        }
        reverse_array rev = new float_reverse();
        rev.reverse(arr);
        System.out.println("Reversed Array = " + Arrays.deepToString(arr));
    }

    public void double_3_array() {
        System.out.println("enter no of rows = ");
        int row = sc.nextInt();
        System.out.println("enter no of columns = ");
        int col = sc.nextInt();
        System.out.println("enter no of z direction = ");
        int zd = sc.nextInt();
        double[][][] arr = new double[row][col][zd];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                for (int k = 0; k < zd; k++) {
                    System.out.printf("enter element [%d][%d][%d] = \n" , i, j,k);
                    arr[i][j][k] = sc.nextDouble();
                }

            }

        }
        reverse_array rev = new double_array();
        rev.reverse(arr);
        System.out.println("Reversed Array = " + Arrays.deepToString(arr));
    }

}