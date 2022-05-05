package info;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.model.Report;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.UnsupportedEncodingException;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
                "json:target/reports/cucumber-json-reports/json-report.json",
                "html:target/reports/cucumber-html-reports/html-report.html"
        },
        glue = {"info.steps"
        },
        features = {"classpath:features/"}
)
public class RunnerTest {
        @BeforeClass
        public static void  setDialect()  {
                ExtentReports extentReports = new ExtentReports();

                try {
                        extentReports.setGherkinDialect("pt");

                } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                }
        }


}
