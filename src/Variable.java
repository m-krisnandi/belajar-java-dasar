public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Muhamad Krisnandi";
        System.out.println(name);

        // Tidak perlu deklarasi tipe data
        var firstName = "Muhamad";
        var lastName = "Krisnandi";
        System.out.println(firstName);
        System.out.println(lastName);

        // Tidak bisa diubah lagi valuenya
        final String application = "Belajar Java";
        System.out.println(application);
    }
}
