package com.epam.jdi.light.ui.bootstrap.elements.complex;

import com.epam.jdi.light.asserts.generic.UISelectAssert;
import com.epam.jdi.light.common.ElementArea;
import com.epam.jdi.light.elements.base.UIListBase;
import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.tools.func.JFunc1;
import org.openqa.selenium.WebElement;


import static com.epam.jdi.light.common.ElementArea.ACTION_CLICK;
import static com.epam.jdi.light.common.TextTypes.LABEL;
import static com.epam.jdi.light.settings.WebSettings.ANY_ELEMENT;


public class RadioButtons extends UIListBase<UISelectAssert> {

    @Override
    public WebList list() {

        WebList radioBtnWebList = new WebList(base()).setup(jdiB -> jdiB.setSearchRule(ANY_ELEMENT))
                .setUIElementName(LABEL);
        radioBtnWebList.setClickArea(ACTION_CLICK);
        return radioBtnWebList;
    }

    public WebList list(JFunc1<WebElement, Boolean> searchRule, ElementArea elementArea) {
        WebList radioBtnWebList = new WebList(base()).setup(jdiB -> jdiB.setSearchRule(searchRule))
                .setUIElementName(LABEL);
        radioBtnWebList.setClickArea(elementArea);
        return radioBtnWebList;
    }

    public RadioButtons() {
        base().setLocator("input[type=radio]");
    }
}

