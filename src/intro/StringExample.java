package intro;

public class StringExample {
    public static void main(String[] args) {
        //literal
        String str = "ABC";
        //obj - using new
        String str2 = new String("abCD Ew e rty uik jbvc");
        // using new but passing char[]
        char[] arr = { 'a', 'b', 'c' };
        String str3 = new String(arr);
        int len = str3.length();
        char c = str2.charAt(3);
        String sub = str2.substring(3, 8); //will stop on 7th index
        System.out.println(sub.concat(str3));
        System.out.println(sub + str3);
        int compareTo = str.compareToIgnoreCase(str3);
        String strLower = str.toLowerCase();
        System.out.println(str2.replace(" ", ""));
    }
}
