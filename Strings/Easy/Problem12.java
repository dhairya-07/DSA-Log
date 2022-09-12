package DSA.Strings.Easy;

public class Problem12 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords2(s));
    }

    static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String[] temp = sb.toString().split(" ");
        for (int i = 0; i < temp.length / 2; i++) {
            String str = temp[i];
            temp[i] = temp[temp.length - i - 1];
            temp[temp.length - i - 1] = str;
        }
        StringBuilder ans = new StringBuilder("");
        for (String str : temp) {
            ans.append(str);
            ans.append(" ");
        }
        return ans.toString().trim();
    }

    private static String reverseWord(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    static String reverseWords2(String s){
        char[] c=s.toCharArray();
        int i=0,j=0;
        for(;j<c.length;j++){
            if(c[j]==' '){
                reverse(c,i,j-1);
                i=j+1;
            }
        }
        reverse(c,i,j-1);
        return new String(c);
    }

//    Strings me character array thoda fast kaam karta hai zyada nahi thoda
    public static char[] reverse(char[] c, int start, int end) {
        while(start<end){
            char ch=c[start];
            c[start]=c[end];
            c[end]=ch;
            start++;
            end--;
        }
        return c;
    }
}
