import org.junit.Assert;
import org.junit.Test;

public class LuhnChecksumVerifierTest {

    @Test
    public void shouldValidateCardNumber(){
        //given
        String number = "67553";
        ChecksumVerifier checksumVerifiler = new LuhnChecksumVerifier();

        //when
        boolean isCorrect = checksumVerifiler.verify(number);

        //then
        Assert.assertTrue(isCorrect);

    }

    @Test
    public void shouldNotValidateCardNumber(){
        //given
        String number = "67552";
        ChecksumVerifier checksumVerifiler = new LuhnChecksumVerifier();
        //when
        boolean isCorrect = checksumVerifiler.verify(number);
        //then
        Assert.assertFalse(isCorrect);
    }


}
