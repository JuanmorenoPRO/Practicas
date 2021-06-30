package Slider;

import Base.BaseTest;
import Pages.HorizontalSliderPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTest extends BaseTest {

    @Test
    public void TestSlider(){
        HorizontalSliderPage horizontalSliderPage = homepage.clickHorizontalSlider();
        String setValue = "4";
        horizontalSliderPage.setSliderValue(setValue);
        String value = horizontalSliderPage.getSliderValue();
        assertEquals(value, setValue , "Invalid Value");
    }

}
