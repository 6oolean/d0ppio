class StrongNumber{
    static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n-1);
    }

    static int sumOfFactorials(int n){
        if(n == 0) return 0;
        return factorial(n % 10) + sumOfFactorials(n/10);
    }

    public static void main(String[] args) {
        int n = 145;
        int sum = sumOfFactorials(n);
        System.out.println(n + " is Strong? " + (sum == n));
    }
}