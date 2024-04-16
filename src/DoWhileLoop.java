public class DoWhileLoop {
    public static void main(String[] args) {
        var counter = 1;
        // Setidaknya 1 kali perulangan akan dieksekusi meskipun kondisinya salah
        do {
            System.out.println("Perulangan " + counter);
            counter++;
        } while (counter <= 10);
    }
}
