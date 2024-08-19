import java.lang.Integer;
import java.util.Arrays;

public class App {

  public static Integer findSecondSmallestItem(Integer[] arr) {

    if (arr.length <= 1) {
      return null; // return null if array is empty or has only 1 element
    } else {
      int smallestInt = arr[0]; // start with first element of array
      boolean isTheSame = true;

      for (int i = 0; i < arr.length; i++) {
        if (smallestInt != arr[i]) {
          isTheSame = false;
        }
      }
      if (isTheSame) {
        return null; // return null if all elements are the same
      }

      for (int i = 0; i < arr.length; i++) {
        if (arr[i] < smallestInt) { // replace variable value if next element in array is smaller
          smallestInt = arr[i];
        }
      }

      int secondSmallestInt;
      if (smallestInt != arr[0]) { // start with first element of array as long as not equal to the smallest
                                   // integer
        secondSmallestInt = arr[0];
      } else {
        secondSmallestInt = arr[1];
      }

      for (int i = 0; i < arr.length; i++) { // replace variable value if next element in array is smaller AND bigger
                                             // than smallest
        if (arr[i] < secondSmallestInt && arr[i] > smallestInt) {
          secondSmallestInt = arr[i];
        }
      }

      Integer[] value = new Integer[] { secondSmallestInt };
      return value[0]; // return second smallest integer

    }
  }

  public static void printTriangle(Object[] arr) {
    int len = arr.length;

    for (int i = 0; i < len; i++) { // one row for each element in the array
      for (int j = 0; j <= i; j++) { // one column from 0th element to the row number
        System.out.print(arr[j]); // print array elements side by side
      }
      System.out.print("\n"); // start a new line for each row
    }
  }

  public static Object[] rotateRight(Object[] arr) {
    Object[] rotatedArr = new Object[arr.length]; // new array to store rotated values

    for (int i = 0; i < arr.length; i++) {
      rotatedArr[(i+1) % arr.length] = arr[i]; // move elements over 1 index to the right
    }
    return rotatedArr;
  }

  public static void main(String[] args) {
    int testing = 3;

    if (testing == 1) {// testing findSecondSmallestItem
      Integer[] arr = new Integer[] { 5, 8, 3, 2, 6 };
      System.out.println(findSecondSmallestItem(arr));
      Integer[] arr2 = new Integer[] { 3, 8, 5, 2, 6 };
      System.out.println(findSecondSmallestItem(arr2));
      Integer[] arr3 = new Integer[] { 6, 8, 5, 2, 3 };
      System.out.println(findSecondSmallestItem(arr3));
      Integer[] arr4 = new Integer[] { 3, 3, 3, 3, 3 };
      System.out.println(findSecondSmallestItem(arr4));
      Integer[] arr5 = new Integer[] { 3, 3, 3, 2, 3 };
      System.out.println(findSecondSmallestItem(arr5));
      Integer[] arr6 = new Integer[] { 3, 4, 3, 3, 3 };
      System.out.println(findSecondSmallestItem(arr6));
      Integer[] arrEmpty = new Integer[] {};
      System.out.println(findSecondSmallestItem(arrEmpty));
      Integer[] arrOne = new Integer[] { 1 };
      System.out.println(findSecondSmallestItem(arrOne));
    }

    // testing printTriangle
    if (testing == 2) {
      printTriangle(new Integer[] { 1, 2, 3, 4 });
      printTriangle(new Character[] { 'A', 'B', 'C', 'D', 'E' });
      printTriangle(new String[] {});
      printTriangle(new String[] { "Hello" });
      printTriangle(new String[] { "Hello", "There", "Friend" });
    }

    // testing rotateRight
    if (testing == 3) {
      Object[] arr = new Integer[] { 1, 2, 3, 4, 5 };
      arr = rotateRight(arr);
      System.out.println(Arrays.toString(arr));
      arr = rotateRight(arr);
      System.out.println(Arrays.toString(arr));
      arr = rotateRight(arr);
      System.out.println(Arrays.toString(arr));
      arr = rotateRight(arr);
      System.out.println(Arrays.toString(arr));
      arr = rotateRight(arr);
      System.out.println(Arrays.toString(arr));
      Object[] arr2 = new String[] { "Hello", "there", "my friend" };
      arr2 = rotateRight(arr2);
      System.out.println(Arrays.toString(arr2));
      arr2 = rotateRight(arr2);
      System.out.println(Arrays.toString(arr2));
      arr2 = rotateRight(arr2);
      System.out.println(Arrays.toString(arr2));
    }
  }
}