package Pages;

import Contanst.LoginPageContanst;
import base.BasePage;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectProductPage extends BasePage implements Contanst.SelectProduct {
    Logger LOGGER = Logger.getLogger(LoginPage.class);


    public void Addürün() throws InterruptedException {


        Thread.sleep(6000);

        Thread.sleep(1000);
        waitForElementAndSendKeys(Search_,"bilgisayar");
        Thread.sleep(4000);
        waitForElementAndClick(Search_icon);
        Thread.sleep(4000);
        waitForElementAndClick(Urün_);
        Thread.sleep(4000);
        waitForElementAndClick(Sepete_Ekle);
        Thread.sleep(4000);
        waitForElementAndClick(sepet_ıcon);
        Assert.assertEquals("fiyatları eşit değildir",Ilk_ürün_fiyat_,sepet_fıyat);
        waitForElementAndClick(arttırma_ıcon);
        Assert.assertTrue("Ürün artırımı olmamıştır",isElementVisible(yeni_ürün_fiyat,10)); // Ana sayfa da olup olmama durumu logo ile kontor edildi
        waitForElementAndClick(silme);
        Thread.sleep(1000);
        waitForElementAndClick(silme_okey);
        Thread.sleep(3000);
        Assert.assertTrue("Ürün silme işlemi başarısızdır",isElementVisible(sepet_bos_yazısı,10));
        Thread.sleep(3000);

    }



}
