public class App {
    public int maxNum() {
        int[][] arr = { {1, 4}, {3, 6}, {2, 9} };
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                } 
            }
        }
        return max;
    }


    public static void main(String[] args) throws Exception {
        App app = new App();
        System.out.println("The maximum value in this 2D array is " + app.maxNum());
    }
}
