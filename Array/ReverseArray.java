//store 7 odd numbers in a 1D array and print and display in reverse order
 class ReverseArray {

    public static void main(String args[]) {
        int odd[] = {1, 3, 5, 7, 9, 11, 13};

       
        System.out.println("Original array elements:");
        for (int n : odd) {
            System.out.print(n + " ");
        }
        System.out.println("\n");

        System.out.println("Array elements in reverse order:");
      
        for (int i = odd.length - 1; i >= 0; i--) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
    }
}