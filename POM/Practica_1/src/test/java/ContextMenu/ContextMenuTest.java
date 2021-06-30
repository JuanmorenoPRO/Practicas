package ContextMenu;

import Base.BaseTest;
import Pages.ContextMenuPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest {

    @Test
    public void testContextMenu(){
        ContextMenuPage  contextMenuPage = homepage.clickContextMenu();
        contextMenuPage.rightClickContext();
        String message = contextMenuPage.getAlertText();
        contextMenuPage.acceptAlert();
        assertEquals(message, "You selected a context menu", "Message incorrect");
    }
}
