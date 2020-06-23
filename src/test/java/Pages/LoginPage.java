package Pages;

import Contanst.LoginPageContanst;
import base.BasePage;
import org.apache.log4j.Logger;
import org.junit.Assert;

public class LoginPage  extends BasePage implements LoginPageContanst {
    Logger LOGGER = Logger.getLogger(LoginPage.class);
    String Eposta ="busratstn02@gmail.com";
    String parola ="büşra123";

    public void Login() throws InterruptedException {


        Thread.sleep(6000);

        waitForElementAndClick(oneri_button);
        Assert.assertTrue("Ana sayfada değilsiniz",isElementVisible(HomePage_logo,10)); // Ana sayfa da olup olmama durumu logo ile kontor edildi
        waitForElementAndClick(input_button);
        Thread.sleep(4000);
       waitForElementAndSendKeys(email_,Eposta);
        Thread.sleep(1000);
       waitForElementAndSendKeys(password_,parola);
        Thread.sleep(1000);
        waitForElementAndClick(login);
        Thread.sleep(4000);
        Assert.assertTrue("Ana sayfada değilsiniz",isElementVisible(HomePage_logo,10)); // Ana sayfa da olup olmama durumu logo ile kontor edildi



    }



}
