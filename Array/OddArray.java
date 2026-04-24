//store 10  odd numbers in 1D array and display it in reverse order
public class OddArray {
    public static void main(String[] args) {

        int a[] = new int[10];
        int num = 1;

        // Store first 10 odd numbers
        for (int i = 0; i < 10; i++) {
            a[i] = num;
            num = num + 2;
        }

        // Display in reverse order
        for (int i = 9; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}