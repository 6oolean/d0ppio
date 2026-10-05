public class Prime{
    public static void main(String[] args) {
        int n = 6;
        System.out.println(isPrime(n,n/2));
    }
    public static boolean isPrime(int n, int i){
        if(i==1)
            return true;
        if(n <= 1 || n % i == 0)
            return false;
        return isPrime(n, i-1);
    }
}