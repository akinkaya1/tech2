package casting;

public class CastingPrimitives {
    public static void main(String[] args) {
        byte b = 127; // 1 byte 8 bits -128, 127

        int i = b;    // 4 bytes, 32 bits

        int i2 = 23874623;
        long l = i2;

        short s = 129;

        byte b2 = (byte)s; // -128, 127

        System.out.println(b2);

        double balance = 100.00;

        float bal = (float)balance;
    }
}
