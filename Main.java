package decode_encode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Decode1 dec = new Decode1();
        String str;
        Scanner scan = new Scanner(System.in);

        str = scan.nextLine();

        String str2 = dec.encode_rus(str);
        System.out.println(str2);
        String str3 = dec.decode_rus(str2);
        System.out.println(str3);
    }
}