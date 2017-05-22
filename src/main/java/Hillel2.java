import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;


public class Hillel2 {

    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);
        System.out.println(getDomainName(s.next()));

    }
    private static String getDomainName(String url) throws URISyntaxException {
        URI uri = new URI(url);
        String domain = uri.getHost();
        return domain.startsWith("www.") ? domain.substring(4) : domain;
    }
}
