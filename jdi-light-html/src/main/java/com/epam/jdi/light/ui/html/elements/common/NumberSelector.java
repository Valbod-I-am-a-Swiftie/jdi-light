package com.epam.jdi.light.ui.html.elements.common;

import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.elements.base.UIBaseElement;
import com.epam.jdi.light.elements.interfaces.base.HasLabel;
import com.epam.jdi.light.elements.interfaces.base.HasPlaceholder;
import com.epam.jdi.light.elements.interfaces.base.HasValue;
import com.epam.jdi.light.ui.html.asserts.NumberAssert;

import static com.epam.jdi.light.logger.LogLevels.DEBUG;
import static com.epam.jdi.light.ui.html.HtmlUtils.getDouble;

/**
 * Created by Roman Iovlev on 26.09.2019
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */
public class NumberSelector extends UIBaseElement<NumberAssert>
        implements HasLabel, HasValue, HasPlaceholder {
    // region Actions

    @JDIAction(value = "Get '{name}' min value", level = DEBUG)
    public Double min() { return getDouble("min", uiElement); }
    @JDIAction(value = "Get '{name}' max value", level = DEBUG)
    public Double max() { return getDouble("max", uiElement); }
    @JDIAction(value = "Get '{name}' value", level = DEBUG)
    public String value() { return uiElement.attr("value"); }
    @JDIAction(value = "Get '{name}' step size", level = DEBUG)
    public Double step() { return getDouble("step", uiElement); }
    @JDIAction("Select number '{0}' for '{name}'")
    public void setNumber(String number) {
        uiElement.setAttribute("value", number);
    }
    // endregion

    // region Set and get value for Forms
    public void setValue(String value) {
        setNumber(value);
    }
    public String getValue() {
        return value()+"";
    }
    // endregion

    // region Extend assertions
    @Override
    public NumberAssert is() {
        return new NumberAssert().set(this);
    }
    // endregion

}
