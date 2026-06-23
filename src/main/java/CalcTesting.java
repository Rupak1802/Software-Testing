import org.testng.Assert;
import org.testng.annotations.Test;

public class  CalcTesting {
    @Test(priority = 1)
    public void add() {
        int a = 15+15;
        Assert.assertEquals(a,30);
    }
    @Test(priority = 2)
    public void diff() {
        int a = 45-15;
        Assert.assertEquals(a,30);
    }
    @Test(priority = 0)
    public void mul() {
        int a = 15 * 15;
        Assert.assertEquals(a,225);
    }
    @Test(priority = -1)
    public void div() {
        int a = 15/5;
        Assert.assertEquals(a,3);
    }
}
