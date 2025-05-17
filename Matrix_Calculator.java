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
        System.out.println("RESULTANT MATRIX OF SUBRACTION");
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
        System.out.println("RESULTANT MATRIX OF SUBRACTION");
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
    private  double[][] resb; // subraction
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
            System.out.println("4. Exit");
            System.out.print("Enter Here = ");
            int choice = obj.nextInt();
            System.out.println();

            matrix m = null;

            if (choice == 1) {
                m = new int_matrix();
            } else if (choice == 2) {
                m = new float_matrix();
            } else if (choice == 3) {
                m = new double_matrix();
            } else if(choice == 4){
                System.out.println("Exiting Calculator..................");
                System.out.println("Thank You!");

                break;

            }
            else {
                System.out.println("Invalid choice!");
            }

            m.init();
            m.input();

            System.out.println("================== OPERATION SELECTION MENU =====================");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Addition & Multiplication");
            System.out.println("5. Subtraction & Multiplication");
            System.out.println("6. Addition & Subtraction");
            System.out.print("Enter Here = ");
            int op = obj.nextInt();

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