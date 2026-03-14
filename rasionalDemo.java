public class rasionalDemo {

    public static void main(String[] args) {

        rasional R1 = new rasional(1, 2);
        rasional R2 = new rasional(1, 3);

        System.out.println("R1.isRasional: " + R1.isRasional());
        System.out.println("R2.isRasional: " + R2.isRasional());
        System.out.println();

        System.out.println("R1 > R2: " + R1.moreThan(R2));
        System.out.println("R1 < R2: " + R1.lessThan(R2));
        System.out.println("R1 <= R2: " + R1.lessEqual(R2));
        System.out.println("R1 >= R2: " + R1.moreEqual(R2));
        System.out.println("R1 != R2: " + R1.notEqual(R2));
        System.out.println();

        System.out.println("R1: ");
        R1.cetak();

        System.out.println("R2: ");
        R2.cetak();
        System.out.println();

        R1.sederhana();
        R2.sederhana();

        System.out.println("Setelah disederhanakan:");

        R1.cetak();
        R2.cetak();
        System.out.println();

        System.out.println("Cast ke double:");

        System.out.println("R1: " + R1.cast());
        System.out.println("R2: " + R2.cast());
        System.out.println();

        R1.negasi();

        System.out.println("Unary - dari R1:");
        R1.cetak();
        System.out.println();

        R1.unaryPlus(R2);

        System.out.println("R1 += R2:");
        R1.cetak();
        System.out.println();

        R1.minus(R2);

        System.out.println("R1 - R2:");
        R1.cetak();
        System.out.println();

        R1.kali(R2);

        System.out.println("R1 * R2:");
        R1.cetak();
        System.out.println();

        R1.bagi(R2);

        System.out.println("R1 / R2:");
        R1.cetak();
    }
}