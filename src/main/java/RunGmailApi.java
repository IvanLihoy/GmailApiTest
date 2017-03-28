import org.testng.annotations.Test;

/**
 * Created by 777 on 28.03.2017.
 */
public class RunGmailApi extends GmailApi {
    @Test
    public void gmailTest() throws Exception {
        getActivationLink();
    }
}
