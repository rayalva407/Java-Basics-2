public class Assignment2 {


    public int maxNum(int[][] array) {

        int max = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                } 
            }
        }
        return max;
    }

    public int[] arrIndex(int[][] array) {
        int[] indexArr = new int[2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == maxNum(array)) {
                    indexArr[0] = i;
                    indexArr[1] = j;
                } 
            }
        }
        return indexArr;
    }


    public static void main(String[] args) throws Exception {
        int[][] array = { {1, 4}, {8, 56}, {20, 7} };

        Assignment2 app = new Assignment2();
        System.out.println("The maximum value in this 2D array is " + app.maxNum(array));
        System.out.println("The position of the maximum value is [" + app.arrIndex(array)[0] + ", " + app.arrIndex(array)[1] + "]");
    }
}
