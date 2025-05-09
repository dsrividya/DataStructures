import java.util.LinkedList;

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
}