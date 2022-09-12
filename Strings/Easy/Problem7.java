package DSA.Strings.Easy;

public class Problem7 {
    public static void main(String[] args) {
//        System.out.println((char) ('a' - 32));
        System.out.println(toLowerCase2("HERE"));
    }


    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
            sb.append((char) (s.charAt(i) + 32));
            else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }

//    Dono method sahi hai kisi se bhi karo time same hai
    public static String toLowerCase2(String s) {
      char[] arr=s.toCharArray();
      for(int i=0;i<arr.length;i++){
         if(arr[i]>='A'&&arr[i]<=90)
             arr[i]=(char)(arr[i]+32);
      }
      return String.valueOf(arr);
    }
}
