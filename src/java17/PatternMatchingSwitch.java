package java17;

//Still a preview feature in 17 - need to enable from project settings
public class PatternMatchingSwitch {
    static String formatter(Object obj) {
        //Pattern matching in switch
        //Preview  in j17, actual in j21
//        return switch (obj) {
//            case Integer i -> String.format("Integer: %d", i);
//            case Long l    -> String.format("Long: %d", l);
//            case String s  -> String.format("String: %s", s);
//            case null -> "Null"  //allowed from java 17
//            default        -> obj.toString();
//        };

        //Pattern matching instanceOf
        if(obj instanceof String s) {
            return s.toUpperCase();
        } else if (obj instanceof Integer i){
            return i+" is a number";
        }
        return null;


    }

    public static void main(String[] args) {
        System.out.println(formatter(42));           // Output: Integer: 42
        System.out.println(formatter("Hello"));      // Output: String: Hello
        System.out.println(formatter(3L));           // Output: Long: 3
    }
}
