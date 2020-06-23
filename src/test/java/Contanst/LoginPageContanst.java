package Contanst;

import org.openqa.selenium.By;
import util.ElementInfo;

public interface LoginPageContanst {

    public ElementInfo oneri_button = new ElementInfo("Uyarı mesajı gelmedi",By.xpath("//a[@title='Close']"));
    public ElementInfo HomePage_logo = new ElementInfo("Ana Sayfada değilsiniz",By.id("logo"));
    public ElementInfo input_button = new ElementInfo("Giriş yap buttonu bulunamadı", By.xpath("//*[@id=\"accountBtn\"]/div[2]"));
    public ElementInfo email_ = new ElementInfo("Mail bilgisi girilmedi",By.xpath("//*[@id=\"email\"]"));
    public ElementInfo password_ = new ElementInfo("Parola girilmedi",By.xpath("//*[@id=\"password\"]"));
    public ElementInfo login = new ElementInfo("Giriş yap button tıklanmadı",By.xpath("//*[@id=\"loginSubmit\"]"));

}

