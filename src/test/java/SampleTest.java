import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {


    SampleClass sampleClass = new SampleClass();
    @Test
    public void check(){
        Assert.assertEquals(sampleClass.methodAB(), true);
    }
}
