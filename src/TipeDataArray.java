public class TipeDataArray {
    public static void main(String[] args) {
        String[] arrayString = new String[2];
        arrayString[0] = "Muhamad";
        arrayString[1] = "Krisnandi";
        System.out.println(arrayString[0]);

        // Array Initialize
        int[] arrayInt = new int[]{
                10, 90, 82, 12, 49
        };

        long[] arrayLong = {
                19L, 89L, 23L, 42L
        };

        arrayLong[0] = 100L;

        System.out.println(arrayInt.length);
        System.out.println(arrayLong[2]);
        System.out.println(arrayLong[0]);

        // Array di dalam array
        String[][] members = {
                {"Muhamad", "Krisnandi"},
                {"Kirishima", "Tooru"},
                {"Satou", "Izumi"}
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members.length);
        System.out.println(members[1][0]);
        System.out.println(members[2][0]);
    }
}
