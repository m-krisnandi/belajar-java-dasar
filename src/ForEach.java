public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Muhamad", "Krisnandi"
        };
        // Using forLoop
        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Using ForEach
        for (String name: names) {
            System.out.println(name);
        }
    }
}
