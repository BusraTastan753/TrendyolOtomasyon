package Contanst;

import org.openqa.selenium.By;
import util.ElementInfo;

public interface SelectProduct {
    public ElementInfo Search_ = new ElementInfo("Arama kutucuğuna bilgisayar yazılamadı", By.xpath("//*[@id=\"auto-complete-app\"]/div/div[1]/input"));
    public ElementInfo login_ = new ElementInfo("Giriş yap button tıklanmadı",By.xpath("//*[@id=\"loginSubmit\"]"));
    public ElementInfo Search_icon = new ElementInfo("İkinci sayfa açılamadı",By.xpath("//*[@id=\"auto-complete-app\"]/div/div/i"));
    public ElementInfo Urün_ = new ElementInfo("Ürün seçilemedi",By.xpath("//*[@id=\"search-app\"]/div/div/div[2]/div[2]/div/div[2]/div[1]/a/div[1]/div/img"));
    public ElementInfo Ilk_ürün_fiyat_ = new ElementInfo("Ürün seçilemedi",By.xpath("//span[contains (text() , '2.459 TL')]"));
    public ElementInfo sepet_ıcon = new ElementInfo("Sepet ıcon bulunamadı",By.id("myBasketListItem"));
    public ElementInfo arttırma_ıcon = new ElementInfo("Sepet ıcon bulunamadı",By.xpath("//div[@class='ty-display-flex ty-numeric-counter']//button[2]"));
    public ElementInfo yeni_ürün_fiyat = new ElementInfo("Sepet ıcon bulunamadı",By.xpath("//*[@id=\"basketAside\"]/div/div[1]/dl/dd[4]"));
    public ElementInfo sepet_fıyat = new ElementInfo("Sepet ıcon bulunamadı",By.xpath("//*[@id=\"basketAside\"]/div/div[1]/dl/dd[4]"));
    public ElementInfo Sepete_Ekle = new ElementInfo("Ürün sepete eklenmedi",By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/div[2]/div[5]/button[1]/div[1]"));

    public ElementInfo silme_okey = new ElementInfo("silme",By.xpath("//*[@id=\"ngdialog1\"]/div[2]/form/div/div[2]/div/div[1]/button[2]"));

    public ElementInfo silme = new ElementInfo("silme",By.xpath("//*[@id=\"partial-basket\"]/div/div[2]/div[2]/div[3]/button"));

    public ElementInfo sepet_bos_yazısı = new ElementInfo("silme",By.xpath("//span[contains (text() , 'Sepetinizde ürün bulunmamaktadır.')]"));






}
