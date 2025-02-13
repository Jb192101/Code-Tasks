/*
Description:
Implement a function that receives two IPv4 addresses, and returns the number of addresses between them (including the first one, excluding the last one).

All inputs will be valid IPv4 addresses in the form of strings. The last address will always be greater than the first one.

Examples
* With input "10.0.0.0", "10.0.0.50"  => return   50
* With input "10.0.0.0", "10.0.1.0"   => return  256
* With input "20.0.0.10", "20.0.1.0"  => return  246
 */

public class CountIPAddresses {
    public static long ipsBetween(String start, String end) {
        String[] ip1S = start.split("\\.");
        String[] ip2S = end.split("\\.");

        long count_of_ips = 0;
        // Определение числа ipшников
        for (int i = 0; i < ip1S.length; i++) {
            long ip_n1 = Integer.parseInt(ip1S[i]);
            long ip_n2 = Integer.parseInt(ip2S[i]);
            long res = ip_n2 - ip_n1;
            if (i == 2) {
                res *= 256;
            } else if (i == 1) {
                res *= 256*256;
            } else if (i == 0) {
                res *= 256*256*256;
            }

            count_of_ips += res;
        }

        return count_of_ips;
    }
}