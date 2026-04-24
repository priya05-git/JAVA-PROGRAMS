public class Array{
    public static void main(String[] args) {

        // Array declaration
        int a[] = {10, 20, 30, 40, 50};

        // Normal for loop
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

        // For-each loop
        for (int x : a) {
            System.out.println(x + " ");
        }
    }
}