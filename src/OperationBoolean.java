public class OperationBoolean {
    public static void main(String[] args) {
        var absen = 75;
        var nilaiAkhir = 90;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }
}
