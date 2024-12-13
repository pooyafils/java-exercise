package javacore;

public class SubsequenceString {
    public static int lcs(String str1, String str2) {
        int m = str1.length();
        int k = str2.length();
        int[][] dp = new int[m + 1][k + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= k; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][k];
    }

    public static void main(String[] args) {
        String str1 = "AGGTAB";
        String str2 = "GXTXAYB";
        System.out.println("Length of LCS is " + lcs(str1, str2));
    }
}
