public static void main(String[] args) {
      int[] arr1 = { 1, 3, 5, 7, 9};
      int[] arr2 = { 2, 4, 6, 8, 10 };
      int[] arr3 = new int[arr1.length + arr2.length];
      int i = 0, j = 0, k = 0;
      while (i < arr1.length && j < arr2.length) {
           if (arr1[i] < arr2[j]) {
               arr3[k] = arr1[i];
               i++;
           } else {
               arr3[k] = arr2[j];
               j++;
           }
           k++;
      }
 
     
      if (i < arr1.length) {
         
         System.arraycopy(arr1, i, arr3, k, (arr1.length - i));
      }
 
      
      if (j < arr2.length) {
         
         System.arraycopy(arr2, j, arr3, k, (arr2.length - j));
      }
      System.out.println("Merged Sorted Array" + Arrays.toString(arr3));
      