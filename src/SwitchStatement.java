public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Wow, Selamat Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus dengan cukup baik");
                break;
            case "D":
                System.out.println("Anda belum lulus");
                break;
            default:
                System.out.println("Anda mungkin salah Jurusan");
        }

        // Switch Lambda (for Java Version 14++)
        switch (nilai) {
            case "A" -> System.out.println("Wow, Selamat Anda lulus dengan baik");
            case "B", "C" -> System.out.println("Anda lulus dengan cukup baik");
            case "D" -> System.out.println("Anda belum lulus");
            default -> {
                System.out.println("Anda mungkin salah Jurusan");
            }
        }

        // Switch Lambda using yield (for Java Version 14++)
        String ucapan;
        ucapan = switch (nilai) {
            case "A":
                yield "Wow, Selamat Anda lulus dengan baik";
            case "B", "C":
                yield "Anda lulus dengan cukup baik";
            case "D":
                yield "Anda belum lulus";
            default:
                yield "Anda mungkin salah Jurusan";
        };

        System.out.println(ucapan);
    }
}
