import java.net.InetAddress;
import java.net.UnknownHostException;

public class Hostname {
   public static void main(String[]args) throws UnknownHostException{
        InetAddress address = InetAddress.getByName("www.redhat.com");

        System.out.println("my local machine: " + address);
    }
}
