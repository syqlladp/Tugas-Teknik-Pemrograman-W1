import java.util.Scanner;

public class DataType {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah test case: ");
        int angka = input.nextInt();

        for (int i = 0; i < angka; i++){
            System.out.println("Masukkan angka: ");

            try {
                long n = input.nextLong();

                System.out.println(n + " can be fitted in: ");

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
                    System.out.println("* byte");

                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
                    System.out.println("*short");

                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
                    System.out.println("*integer");

                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE)
                    System.out.println("*long");
            } catch (Exception e) {
                System.out.println("can't be fitted anywhere.");
                input.next();
            }
        }
    }
}
