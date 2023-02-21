import java.util.Scanner;
class t1{
    public static void main(String[] args) {
        //Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int n (triangle number): ");
        int n = iScanner.nextInt();
        int X = 0;
        for (int i = 1; i<=n; i++)
        {
            X = X+i;
        }
        System.out.printf("%d triangle number: %d ", n, X);
        System.out.println();
        System.out.printf("int n (factorial): ");
        n = iScanner.nextInt();
        X = 1;
        for (int i = 1; i<=n; i++)
        {
            X = X*i;
        }
        System.out.printf("%d factorial: %d ", n, X);
        iScanner.close();
    }
}