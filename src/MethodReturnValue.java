public class MethodReturnValue {
    public static void main(String[] args) {
        System.out.println(sum(200, 200));
        System.out.println(hitung(200, "+", 100));
        System.out.println(hitung(200, "-", 100));
    }

    static int sum (int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung (int value1, String operation, int value2) {
        switch (operation) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
