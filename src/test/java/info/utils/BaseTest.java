package info.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public interface BaseTest {
    MiscMethods miscmethodObj = new MiscMethods();
    NavigateMethods navigationObj = new NavigateMethods();
    AssertionMethods assertionObj = new AssertionMethods();
    ClickElementsMethods clickObj = new ClickElementsMethods();
    InputMethods inputObj = new InputMethods();
    ProgressMethods progressObj = new ProgressMethods();
    JavascriptHandlingMethods javascriptObj = new JavascriptHandlingMethods();
    ScreenShotMethods screenshotObj = new ScreenShotMethods();
    Faker faker = new Faker(new Locale("pt-BR"));

}
