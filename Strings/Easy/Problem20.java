package DSA.Strings.Easy;

public class Problem20 {
    public static void main(String[] args) {
        System.out.println(checkOnesSegment("101010"));
    }

//    Que me basically ye hona chaiye ki agar 1 occur hue to 1 hi baar occur hoga chahe individually ya contigous group
//    me agar beech me 0 aya or uske baad 1 aya individually ya contigous to wahi false ho jayega and as it is given
//    ki string me leading 0s nahi hai to string hmesha 1 se chalu hogi to agar 1 aaye to starting me aaye jitne marzi
//    lekin 1 baar bhi 0 aya uske baad 1 nahi ana chaiye
    public static boolean checkOnesSegment(String s) {
        boolean findZer0 = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1' && findZer0 == true)
                return false;
            if (s.charAt(i) == '0') {
                findZer0 = true;
            }
        }
        return true;
    }

    public static boolean checkOnesSegment2(String s) {
//        basically 01 kabhi nahi ana chaiye 10 chalega 11 chalega
      return !s.contains("01");
    }
}
