public class Max {
    public static void main(String[] args) {
        int[][] arr = {{12, 13, 14, 34},
                       {2, 4},
                       {34, 23, 12}};


        System.out.println(search(arr));
    }
    static int search(int[][] arr ){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int col = 0; col < ints.length; col++)
                if (ints[col] > max) {
                    max = ints[col];
                }
        }
       return max;

    }
}

