package DSA.Strings.Easy;

public class Problem8 {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
    }

//    Jo leetcode pe uploaded hai wo simple method for loop chalaya string me charAt() karke dekha if any vowel
//    to cnt1++ or cnt2++ depending hum konse half of string par hai
    public static boolean halvesAreAlike(String s) {
        int n=s.length()/2;
        return ifVowel(s.substring(0,n))==ifVowel(s.substring(n,2*n));
    }

    static int ifVowel(String s) {
        int cnt=0;
        for(char c:s.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                cnt++;
        }
        return cnt;
    }
}
