package info.pages;

import com.github.javafaker.Faker;
import info.utils.BaseTest;
import info.utils.DriverManager;
import info.utils.DriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.Locale;

public abstract class AbstractPage implements BaseTest {

    private final DriverManager driverManager = new DriverManager();
    private final DriverWait driverWait = new DriverWait(driverManager);
    public static Faker faker = new Faker(new Locale("pt-BR"));

    protected AbstractPage() {
        PageFactory.initElements(driverManager.getDriver(), this);
    }

    public WebDriver getDriver() {
        return driverManager.getDriver();
    }

    public DriverWait getDriverWait() {
        return driverWait;
    }


}
