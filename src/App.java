import java.lang.Integer;

public class App {
  
  public static Integer findSecondSmallestItem(Integer[] arr) {
    
    if (arr.length <= 1){
      return null; // return null if array is empty or has only 1 element
    }
    else {
      int smallestInt = arr[0]; // start with first element of array
      for (int i = 0; i < arr.length; i++){
        if (arr[i] < smallestInt){ // replace variable value if next element in array is smaller
          smallestInt = arr[i];
        }
      }

      int secondSmallestInt;
      if (smallestInt != arr[0]){ // start with first element of array as long as not equal to the smallest integer
        secondSmallestInt = arr[0];
      } else {
        secondSmallestInt = arr[1];
      }
      
      for (int i = 0; i < arr.length; i++){ // replace variable value if next element in array is smaller AND bigger than smallest
        if (arr[i] < secondSmallestInt && arr[i] > smallestInt){
          secondSmallestInt = arr[i];
        }
      }

      Integer[] value = new Integer[]{secondSmallestInt};
      return value[0];

    }
  }

  public static void main(String[] args) {
    // testing findSecondSmallestItem
    Integer[] arr = new Integer[]{ 5, 8, 3, 2, 6 };
    System.out.println(findSecondSmallestItem(arr));
    
    Integer[] arr2 = new Integer[]{ 3, 8, 5, 2, 6 };
    System.out.println(findSecondSmallestItem(arr2));
    
    Integer[] arr3 = new Integer[]{ 6, 8, 5, 2, 3 };
    System.out.println(findSecondSmallestItem(arr3));
    
    Integer[] arr4 = new Integer[]{ 3, 3, 3, 3, 3 };
    System.out.println(findSecondSmallestItem(arr4));
    
    Integer[] arr5 = new Integer[]{ 3, 3, 3, 2, 3 };
    System.out.println(findSecondSmallestItem(arr5));
    
    Integer[] arr6 = new Integer[]{ 3, 4, 3, 3, 3 };
    System.out.println(findSecondSmallestItem(arr6));
    
    Integer[] arrEmpty = new Integer[] {};
    System.out.println(findSecondSmallestItem(arrEmpty));
    
    Integer[] arrOne = new Integer[] { 1 };
    System.out.println(findSecondSmallestItem(arrOne));
  }
}