public class Main {
    public static void main(String[] args) {
        String a="as";
        String b="dassd";
        System.out.println(b.contains(a));
    }
    public int countSubstrings(String s) {
        int[][] dp=new int[s.length()][s.length()];
        int count=0;
        //处理长度为1的子串
        for(int i=0;i<s.length();i++){
            dp[i][i]=1;
            count++;
        }
        //处理长度为2的子串
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=1;
                count++;
            }
        }
        for(int i=3;i<=s.length();i++){
            for(int j=0;j<=s.length()-i;j++){
                int start=j;
                int end=j+i-1;
                if(s.charAt(start)==s.charAt(end)&&dp[start+1][end-1]==1){
                    dp[start][end]=1;
                    count++;
                }
            }

        }
        return count;
    }
}
