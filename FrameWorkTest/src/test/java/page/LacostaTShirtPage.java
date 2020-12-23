package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LacostaTShirtPage extends AbstractPage {

    private final By sizeProductLocator = By.xpath("//a[@class = \"sizes-list__item\" and  contains(text(),'46')]");
    private final By checkFunctionLocator = By.xpath("//a[@class = \"w2s-available no-variant-selected\"]");
    private final By cost = By.xpath("//a[@class = \"w2s-available no-variant-selected\"]");
    protected final By addToBasketLocator = By.xpath("//button[@class='btn btn-full btn-new l-cart-button']");
    protected final By openBasketLocator = By.id("top-minicart");

    public LacostaTShirtPage(WebDriver driver, String TShirtUrl) {
        super(driver);
        this.url = TShirtUrl;
    }

    public LacostaTShirtPage openPage() {
        driver.get(url);
        return this;
    }
    public  LacostaTShirtPage closeCookies(){
        clickButtonByXpath(cookiesLocator);
        return this;
    }
    public LacostaTShirtPage addSize(){
        clickButtonByXpath(sizeProductLocator);
        return this;
    }
    public LacostaCheckInTheStorePage openPageCheckOnStoreFunction()    {
        clickButtonByXpath(checkFunctionLocator);
        return new LacostaCheckInTheStorePage(driver);
    }

    public LacostaTShirtPage addToBasket(){
        clickButtonByXpath(addToBasketLocator);
        return this;
    }


    public  LacostaBasketPage openBasket(){
        clickButtonByXpath(openBasketLocator);
        return new LacostaBasketPage(driver);
    }

}