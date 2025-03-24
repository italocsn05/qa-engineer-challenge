package appObjects.home;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomeAppObjects {
    public HomeAppObjects(AppiumDriver appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(accessibility = "test-Menu")
    private WebElement menuButton;

    @AndroidFindBy(accessibility = "test-Cart")
    private WebElement cartButton;

    @AndroidFindBy(accessibility = "test-PRODUCTS")
    private WebElement productsListView;

    @AndroidFindBy(accessibility = "test-Cart drop zone")
    private WebElement dropZone;

    @AndroidFindBy(accessibility = "test-Toggle")
    private WebElement buttonSwitchVision;

    @AndroidFindBy(accessibility = "test-Modal Selector Button")
    private WebElement buttonOpenFilters;

    @AndroidFindBy(accessibility = "test-Item")
    private List<WebElement> productItems;

    @AndroidFindBy(accessibility = "test-Drag Handle")
    private WebElement itemDragHandle;

    @AndroidFindBy(accessibility = "test-ADD TO CART")
    private WebElement buttonAddToCart;


    public WebElement getMenuButton() {
        return menuButton;
    }

    public WebElement getCartButton() {
        return cartButton;
    }

    public WebElement getProductsListView() {
        return productsListView;
    }

    public WebElement getDropZone() {
        return dropZone;
    }

    public WebElement getButtonSwitchVision() {
        return buttonSwitchVision;
    }

    public WebElement getButtonOpenFilters() {
        return buttonOpenFilters;
    }

    public List<WebElement> getProductItems() {
        return productItems;
    }

    public WebElement getItemDragHandle() {
        return itemDragHandle;
    }

    public WebElement getButtonAddToCart() {
        return buttonAddToCart;
    }
}
