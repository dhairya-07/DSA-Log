package DSA.Strings.Easy;

public class Problem5 {
    public static void main(String[] args) {
        String str = "is2 a3 This1 sentence4";
        System.out.println(sortSentence(str));
    }

    public static String sortSentence(String s) {
        StringBuilder sb = new StringBuilder("");
//        String ko split karke iske words ka array bana liya
        String arr[] = s.split(" ");

//        Ab 1 dusre array me words ki correct position par us array me store karenge
        String[] temp = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
//            word ke end me jo number hai wo us word ka correct index hai
            int index = arr[i].charAt(arr[i].length() - 1) - '0';
            temp[index - 1] = arr[i].substring(0, arr[i].length() - 1);
        }

//        Us array se string me conversion
        for (String str : temp) {
            sb.append(str + " ");
        }
        return sb.toString().trim();
    }
}
