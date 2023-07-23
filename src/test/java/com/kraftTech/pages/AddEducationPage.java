package com.kraftTech.pages;


import com.kraftTech.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddEducationPage extends BasePage{

    @FindBy(xpath = "//button[text()='Add Education'][./parent::div]")
    public WebElement addEducationButton;

    @FindBy (css = "#school")
    public WebElement schoolOrBootcamp;

    @FindBy (xpath = "//*[@id='currentedu']")
    public WebElement checkBox;

    @FindBy(xpath = "(//form)[3]//label")
    public List<WebElement> addEducationFormLabels;

    public void fillingEducationForm(){
        Actions actions=new Actions(Driver.get());

        actions.click(schoolOrBootcamp)
                .sendKeys("Kraft"+ Keys.TAB)
                .sendKeys("First Degree"+Keys.TAB)
                .sendKeys("IT Engineering"+Keys.TAB)
                .sendKeys("01012020"+Keys.TAB+Keys.TAB)
                .sendKeys("02022022"+Keys.TAB)
                .sendKeys("Nice course"+Keys.TAB+Keys.ENTER).perform();
    }
}
