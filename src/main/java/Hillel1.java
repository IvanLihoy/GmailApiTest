import java.net.MalformedURLException;
import java.net.URL;

public class Hillel1 {
    public static void main(String[] args) throws MalformedURLException {
        String anyURL = "https://stackoverflow.com";
        URL url = new URL(anyURL);
        String hostName = url.getHost();
        System.out.println(hostName);
    }
}

