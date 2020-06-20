package nativeapp.ios.contacts;

import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.mobile.elements.base.MobileAppUIElement;
import com.epam.jdi.light.mobile.elements.common.ios.app.SystemButton;

public class GroupsPage {
    @FindBy(xpath = "//XCUIElementTypeNavigationBar[@name='Groups']")
    public static MobileAppUIElement groupsBar;
    @FindBy(name = "Done")
    public static SystemButton doneButton;
}