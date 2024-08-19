import java.lang.Integer;
import java.util.Arrays;

public class App {

  public static Integer findSecondSmallestItem(Integer[] arr) {

    if (arr.length <= 1) {
      return null; // return null if array is empty or has only 1 element
    } else {
      boolean isTheSame = true;
      for (int i = 0; i < arr.length; i++) {
        if (arr[0] != arr[i]) { // checks if we have different elements in the array
          isTheSame = false;
        }
      }
      if (isTheSame) {
        return null; // return null if all elements are the same
      }

      int smallestInt = Integer.MAX_VALUE, secondSmallestInt = Integer.MAX_VALUE;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] < smallestInt){ // when arr[i] smaller than both, we have a new smallest integer
          secondSmallestInt = smallestInt;
          smallestInt = arr[i];
        } else if (arr[i] > smallestInt && arr[i] < secondSmallestInt) { // when arr[i] between, we have a new second smallest integer
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

  public static void moveZerosToTheEnd(int[] arr) {
    int i = 0;
    int zerosCount = 0;
    while (i < arr.length - zerosCount){
      if (arr[i] == 0){
        for (int j = i; j < arr.length-1; j++){
          arr[j] = arr[j+1];
        }
        arr[arr.length-1] = 0;
        zerosCount++;
      } else {
        i++;
      }
    }
  }

  public static void main(String[] args) {
    int testing = 4;

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

    if (testing == 4){
      int[] arr = new int[] { 1, 1, 0, 0, 0, 1, 0 };
      System.out.println(Arrays.toString(arr));
      moveZerosToTheEnd(arr);
      System.out.println(Arrays.toString(arr));
      System.out.println();

      int[] arr2 = new int[] { 0, 0, 1, 2, 3, 0, 4 };
      System.out.println(Arrays.toString(arr2));
      moveZerosToTheEnd(arr2);
      System.out.println(Arrays.toString(arr2));
      System.out.println();

      int[] arr3 = new int[] { 0, 0 };
      System.out.println(Arrays.toString(arr3));
      moveZerosToTheEnd(arr3);
      System.out.println(Arrays.toString(arr3));
      System.out.println();

      int[] arr4 = new int[] { 2, 9, 1 };
      System.out.println(Arrays.toString(arr4));
      moveZerosToTheEnd(arr4);
      System.out.println(Arrays.toString(arr4));
      System.out.println();

      int[] arr5 = new int[] { 0, 10, 0 };
      System.out.println(Arrays.toString(arr5));
      moveZerosToTheEnd(arr5);
      System.out.println(Arrays.toString(arr5));
      System.out.println();

      //int[] arr6 = new int[] { 3, 0, 0 };
      int[] arr6 = new int[] { 8, 11, 0, 0, 12, 0, 44, 0, 0, 1, 5, 6, 6, 0, 2, 45, 0, 0 };
      System.out.println(Arrays.toString(arr6));
      moveZerosToTheEnd(arr6);
      System.out.println(Arrays.toString(arr6));
      System.out.println();

      int[] arr7 = new int[] {};
      System.out.println(Arrays.toString(arr7));
      moveZerosToTheEnd(arr7);
      System.out.println(Arrays.toString(arr7));
      System.out.println();
    }
  }
}