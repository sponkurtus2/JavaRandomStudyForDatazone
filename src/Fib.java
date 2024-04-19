public class Fib {
    public void Fibo() {
        int n1 = 0, n2 = 1, n3;
        System.err.printf("%d, %d, ", n1, n2);
        for (int i = 0; i < 10; i++ ){ 
            n3 = n1 + n2;

            System.err.printf("%d, ", n3);

            n1 = n2;
            n2 = n3;
        }
    }
}
