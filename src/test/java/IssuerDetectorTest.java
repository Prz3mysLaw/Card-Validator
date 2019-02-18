import org.junit.Assert;
import org.junit.Test;

public class IssuerDetectorTest {

    private Detector issuerDetector;

    public void setUp() {
        issuerDetector = new IssuerDetector();
    }

    @Test
    public void shouldDetectVisaAsIssuer() {
        //given
        final String visaNumber = "4111 1111 1111 1111";

        //when
        String issuer = issuerDetector.detect(visaNumber);

        //then
        Assert.assertEquals("Visa", issuer);
    }

    @Test
    public void shouldDetectMasterCardAsIssuer() {
        //given
        final String mcNumber = "5511 1111 1111 1111";

        //when
        String issuer = issuerDetector.detect(mcNumber);

        //then
        Assert.assertEquals("Master Card", issuer);
    }

    @Test
    public void shouldDetectAmericanExpressAsIssuer() {
        //given
        final String axNumber = "3711 1111 1111 111";

        //when
        String issuer = issuerDetector.detect(axNumber);

        //then
        Assert.assertEquals("American Express", issuer);
    }



}
