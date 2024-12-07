public class circumference{
public static int power(int x, int n) {
    if (n == 0) {
        return 1;
    }
    int result = x;
    for (int i = 1; i < n; i++) {
        result *= x;
    }
    return result;
}int base = 2;
int exponent = 3;
int result = power(x,n);
System.out.println("The value of " + base + " raised to the power of " + exponent + " is: " + result);
}