import java.net.InetAddress;
import java.net.UnknownHostException;

public class Hostname {
   public static void main(String[]args) throws UnknownHostException{
        String dnsHostname = System.getenv("DNSHOSTNAME");
        InetAddress address = InetAddress.getByName(dnsHostname);

        System.out.println("my local machine: " + address);
    }
}
