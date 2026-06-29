import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");
        driver.findElement(By.id("datePickerMonthYearInput")).click();
        new Select(driver.findElement(By.className("react-datepicker__month-select"))).selectByVisibleText("May");
        new Select(driver.findElement(By.className("react-datepicker__year-select"))).selectByValue("2006");
        driver.findElement(By.xpath("//div[text()='20']")).click();
    }
}