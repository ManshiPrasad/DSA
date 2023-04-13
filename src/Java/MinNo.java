package Java;

public class MinNo {
    public static void main(String[] args) {
        int[] arr = {6,3,-9,18,21} ;
        System.out.println(search(arr));

    }
    static int search(int[] arr){
        int ans = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i] < ans){
                ans = arr[i];
            }

        }
        return ans;
    }
}
