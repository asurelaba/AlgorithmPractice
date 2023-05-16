
public class BinarySearch {

    private static int[] arr = {1, 2, 4, 5, 7, 10};

    public static void main(String[] args) {
        System.out.println("The element is at index :: " + search(5, 0, arr.length - 1));
    }

    private static int search(int element, int start, int end) {
        int mid = (end - start) / 2;
        if (start > end) return -1;
        if (element == arr[mid + start]) {
            return mid + start;
        } else if (element < arr[mid + start]) {
            return search(element, start, mid + start - 1);
        } else {
            return search(element, mid + start + 1, end);
        }
    }
}
