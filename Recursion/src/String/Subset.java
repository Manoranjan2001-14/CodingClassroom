package String;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
//        subset(" ", "abc");
//        System.out.println(subsetReturn(" ", "abc"));
       // subsetAscii(" ", "abc");

        System.out.println(subsetReturnAscii(" ", "abc"));
    }
    static void subset(String p, String up){
        if(up.isEmpty()){
            System.out.print(p);
            return;
        }
        char ch = up.charAt(0);
        subset(p + ch, up.substring(1));
        subset(p, up.substring(1));
    }
    static ArrayList<String> subsetReturn(String p, String up){
        if(up.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsetReturn(p + ch, up.substring(1));
        ArrayList<String> right = subsetReturn(p, up.substring(1));

        left.addAll(right);

        return left;
    }

    static void subsetAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsetAscii(p + ch, up.substring(1));
        subsetAscii(p, up.substring(1));
        subsetAscii(p+(ch+0), up.substring(1));
    }

    static ArrayList<String> subsetReturnAscii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subsetReturnAscii(p + ch, up.substring(1));
        ArrayList<String> second = subsetReturnAscii(p, up.substring(1));
        ArrayList<String> third = subsetReturnAscii(p+(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }
}
