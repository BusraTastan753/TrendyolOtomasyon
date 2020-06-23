package TestRun;


import Pages.LoginPage;
import Pages.SelectProductPage;
import base.baseTest;
import org.junit.Test;

public class Run extends baseTest {


    SelectProductPage selectProduct;
    LoginPage loginPage;

    @Test
    public void LoginTest() throws InterruptedException{
        loginPage = new LoginPage();
        selectProduct =new SelectProductPage();

        loginPage.Login();
        selectProduct.Addürün();









    }




}
