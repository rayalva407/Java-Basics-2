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

    public int[] arrIndex() {
        int[][] arr = { {1, 4}, {3, 6}, {2, 9} };
        int[] indexArr = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == maxNum()) {
                    indexArr[0] = i;
                    indexArr[1] = j;
                } 
            }
        }
        return indexArr;
    }


    public static void main(String[] args) throws Exception {
        App app = new App();
        System.out.println("The maximum value in this 2D array is " + app.maxNum());
        System.out.println("The position of the maximum value is [" + app.arrIndex()[0] + ", " + app.arrIndex()[1] + "]");
    }
}
