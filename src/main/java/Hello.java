import org.testng.annotations.Test;
import org.testng.Assert;

public class Hello {
//    @Test
//    public void add() {
//        String s = "googl";
//        String str = "google";
//        Assert.assertEquals(s,str);
//    }
    @Test
    public void Login() {
        System.out.println("login done!");
    }
    @Test(dependsOnMethods = "Login")
    public void home() {
        System.out.println("Welcome to home page");
    }
}