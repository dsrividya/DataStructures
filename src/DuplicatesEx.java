/* import java.util.LinkedList;

public class DuplicatesEx {

    public LinkedList<Integer>  duplicates(int[] arr)
    {
        LinkedList<Integer> al= new LinkedList<Integer>();
        LinkedList<Integer> result= new LinkedList<>();

        for(int nums: arr)
        {
            if(al.contains(nums))
            {
                result.add(nums);
            }
            else {
                al.add(nums);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 4, 3, 2};

        DuplicatesEx obj = new DuplicatesEx();
        LinkedList<Integer> output = obj.duplicates(arr);

        System.out.println(output); // Output: [1, 1, 2, 3]
    }
}*/
/*import java.util.LinkedList;
public class DuplicatesEx {

    public LinkedList<Integer> duplicates(int[] arr) {
        LinkedList<Integer> al = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();

        for (int nums : arr) {
            if (!al.contains(nums)) {
                al.add(nums);
            }
            else if(!result.contains(nums)) {
                result.add(nums);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 4, 3, 2};

        DuplicatesEx obj = new DuplicatesEx();
        LinkedList<Integer> output = obj.duplicates(arr);

        System.out.println(output); // Output: [1, 1, 2, 3]
    }
}*/


// using maps to get duplicates more than one
import java.util.HashMap;
import java.util.LinkedList;
public class DuplicatesEx {

    public LinkedList<Integer> duplicates(int[] arr) {
        LinkedList<Integer> result = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Add duplicates to the result (one by one for each extra occurrence)
        for (int num : arr) {
            if (map.get(num) > 1) {
                result.add(num);
                map.put(num, map.get(num) - 1);  // Decrease the count so we don't add it again
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 4, 3, 2};

        DuplicatesEx obj = new DuplicatesEx();
        LinkedList<Integer> output = obj.duplicates(arr);

        System.out.println(output); // Output: [1, 1, 2, 3]
    }
}


