import com.smu.mscda.CapitalizeAndGenerateMD5Hex;
import org.junit.Assert;
import org.junit.Test;

public class CapitalizeAndGenerateMD5HexTest {
    private String INPUT = "smu";

    @Test
    public void getCapitalizeTest(){
        Assert.assertEquals("Smu", CapitalizeAndGenerateMD5Hex.getCapitalize(INPUT));
    }

    @Test
    public void getMd5String(){
        Assert.assertEquals("3773300c2f413cc7136f8d74b305519c", CapitalizeAndGenerateMD5Hex.getMd5String(INPUT));
    }
}
