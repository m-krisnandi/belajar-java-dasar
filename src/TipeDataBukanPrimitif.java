public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 10;
        Long iniLong = 10L;
        Boolean iniBoolean = true;

        Short iniShort; // null (default value)
        short iniShort2; // 0 (default value) - Tipe data Primitif
        iniShort = 100;
        iniShort2 = 120;
        System.out.println(iniShort);
        System.out.println(iniShort2);

        // Convert primitif ke bukan primitif (Object)
        int iniInt = 1000;
        Integer iniInteger2 = iniInt;

        // Convert bukan primitif (Object) ke primitif
        int iniInt2 = iniInteger2;

        // Convert bukan primitif ke short and byte (ke type data lain)
        short shortNum = iniInteger2.shortValue();
        byte byteNum = iniInteger2.byteValue();
        Long longNum = iniInteger2.longValue();
    }
}
