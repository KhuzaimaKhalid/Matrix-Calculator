abstract class reverse_array{
    public abstract void reverse(int[] arr);
    public abstract void reverse(int[][] arr);
    public abstract void reverse(int[][][] arr);

    public abstract void reverse(float[] arr);
    public abstract void reverse(float[][] arr);
    public abstract void reverse(float[][][] arr);

    public abstract void reverse(double[] arr);
    public abstract void reverse(double[][] arr);
    public abstract void reverse(double[][][]arr);

}
class int_reverse extends reverse_array{
    @Override
    public void reverse(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }

    @Override
    public void reverse(int[][] arr) {
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
            int[] temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for(int[] row: arr){
            reverse(row);
        }

    }

    @Override
    public void reverse(int[][][] arr) {
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
            int[][] temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for(int[][] row: arr){
            reverse(row);
        }

    }

    @Override
    public void reverse(float[] arr) {

    }

    @Override
    public void reverse(float[][] arr) {

    }

    @Override
    public void reverse(float[][][] arr) {

    }

    @Override
    public void reverse(double[] arr) {

    }

    @Override
    public void reverse(double[][] arr) {

    }

    @Override
    public void reverse(double[][][] arr) {

    }
}
class float_reverse extends reverse_array{
    @Override
    public void reverse(int[] arr) {

    }

    @Override
    public void reverse(int[][] arr) {

    }

    @Override
    public void reverse(int[][][] arr) {

    }

    @Override
    public void reverse(float[] arr) {
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
            float temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

    }

    @Override
    public void reverse(float[][] arr) {
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
            float[] temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for(float[] row: arr){
            reverse(row);
        }

    }

    @Override
    public void reverse(float[][][] arr) {
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
            float[][] temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for(float[][] row: arr){
            reverse(row);
        }

    }

    @Override
    public void reverse(double[] arr) {

    }

    @Override
    public void reverse(double[][] arr) {

    }

    @Override
    public void reverse(double[][][] arr) {

    }
}
class double_array extends reverse_array{
    @Override
    public void reverse(int[] arr) {

    }

    @Override
    public void reverse(int[][] arr) {

    }

    @Override
    public void reverse(int[][][] arr) {

    }

    @Override
    public void reverse(float[] arr) {

    }

    @Override
    public void reverse(float[][] arr) {

    }

    @Override
    public void reverse(float[][][] arr) {

    }

    @Override
    public void reverse(double[] arr) {
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
            double temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

    }

    @Override
    public void reverse(double[][] arr) {
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
            double[] temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for(double[] row: arr){
            reverse(row);
        }

    }

    @Override
    public void reverse(double[][][] arr) {
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
            double[][] temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for(double[][] row: arr){
            reverse(row);
        }

    }
}