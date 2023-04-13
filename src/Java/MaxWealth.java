package Java;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(account(accounts));
    }
    public static int account(int[][] accounts){

        int ans = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > ans)
                ans = sum;
        }
        return ans;
    }

}
