package ReverseString;

public class ReverseString {
    public String reverseString(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseString().reverseString("hello")); // Output: "olleh"
    }
}
