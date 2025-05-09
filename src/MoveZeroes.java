
    public class MoveZeroes {

        // Function to move zeroes to the end
        public static void moveZeroes(int[] nums) {
            int nonZeroIndex = 0; // Pointer to track the position of non-zero elements

            // Loop through the array
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    // Swap non-zero elements with zero elements
                    int temp = nums[i];
                    nums[i] = nums[nonZeroIndex];
                    nums[nonZeroIndex] = temp;

                    // Move the nonZeroIndex forward
                    nonZeroIndex++;
                }
            }
        }

        public static void main(String[] args) {
            int[] arr = {0, 1, 0, 3, 12};
            moveZeroes(arr);
            System.out.println("Array after moving zeroes: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }


