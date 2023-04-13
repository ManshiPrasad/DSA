package Java;

public class SearchEvenNo {
    public static void main(String[] args) {
        int[] nums = {2,14,153,6666};
        System.out.println(search(nums));
    }
    static int search(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even (int num){
        int numofdigits = digits(num);
        return numofdigits%2 == 0;
    }
    static int digits(int num){
        int count = 0 ;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }


}
