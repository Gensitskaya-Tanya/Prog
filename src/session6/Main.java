package session6;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by ZaR on 15-Oct-16.
 */
public class Main {
    public static void main(String[] args) {
        try {
            InetAddress adress = InetAddress.getByName("www.google.com");
            System.out.println(adress);
        } catch (UnknownHostException e) {
            System.out.println(e.toString());
        }
    }
}
