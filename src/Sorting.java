public class Sorting {
        // Function to sort an array of 0s, 1s, and 2s
        public void sort012(int[] arr) {
            int low = 0, mid = 0, high = arr.length - 1;

            while (mid <= high) {
                if (arr[mid] == 0) {
                    // Swap arr[low] and arr[mid]
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                } else if (arr[mid] == 1) {
                    mid++;
                } else { // arr[mid] == 2
                    // Swap arr[mid] and arr[high]
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                }
            }
        }

        public static void main(String[] args) {
            Sorting obj = new Sorting();
            int[] arr = {0, 2, 1, 2, 0, 1, 2};
            obj.sort012(arr);

            // Print sorted array
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

