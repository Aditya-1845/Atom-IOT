class PowerCalc4 {
    public static int Poc(int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * 4;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        int value = Poc(n);
        System.out.println("4^" + n + " = " + value);
    }
}