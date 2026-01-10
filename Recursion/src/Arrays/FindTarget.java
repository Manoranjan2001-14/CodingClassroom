package Arrays;

import java.util.ArrayList;

public class FindTarget {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 1, 18, 9};
        int target = 18;
//        System.out.println(find(arr, target, 0));
//        System.out.println(findIndex(arr, target, 0));

//        ArrayList<Integer> ans = findAllIndex(arr, 1, 0, new ArrayList<>());
//        System.out.println(ans);

        System.out.println(findAllIndex2(arr, 1, 0));
    }
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index +1);
    }
    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else
        return findIndex(arr, target, index+1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        //this will contain answar for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
