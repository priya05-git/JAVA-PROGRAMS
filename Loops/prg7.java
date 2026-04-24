class prg7 {
public static void main(String args[]) 
{
	
        int num, sum, r, temp;

        System.out.println("3-digit Armstrong numbers are:");

        for (num = 100; num <= 999; num++) 
{
            temp = num;
            sum = 0;

            while (temp > 0) 
{
                r = temp % 10;
                sum = sum + (r * r * r);
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
