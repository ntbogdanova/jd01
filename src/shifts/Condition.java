package shifts;

public class Condition {

    public static String ternEquality(String a, String b){
        String res = a.equals(b) ? "Значения равны" : "Значения не равны";
        System.out.println(res);
        return res;
    }

    public static String equallity(String a, String b){
        String res;
        if(a.equals(b)){
            res = "Равны";
        }
        else {
            res = "не равны";
        }
        System.out.println(res);
        return res;
    }
}

