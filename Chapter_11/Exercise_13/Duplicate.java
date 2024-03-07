package Exercise_13;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
         Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5}; 
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

        // calling method
        removeDuplicate(list);

        // print list
        for (Integer inn : list) {
            System.out.println(inn);
        }
        
    }

    public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> checkList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!checkList.contains(list.get(i))) {
                checkList.add(list.get(i));
            } else{
                list.remove(list.get(i));
            }
        }
       
    }
}
