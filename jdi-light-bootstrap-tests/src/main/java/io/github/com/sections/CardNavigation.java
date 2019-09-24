package io.github.com.sections;

import com.epam.jdi.light.elements.common.Label;
import com.epam.jdi.light.elements.complex.Menu;
import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.bootstrap.elements.common.Button;
import com.epam.jdi.light.ui.bootstrap.elements.common.Link;
import com.epam.jdi.light.ui.bootstrap.elements.common.Text;

public class CardNavigation extends Section {

    @UI(".nav")
    public Menu menu;

    @UI(".nav-link active")
    public Link activeLink;
    @UI(".nav-link")
    public Link jdiLink;
    @UI(".nav-link disabled")
    public Link disabledLink;

    @Title
    @UI("h5")
    public Text title;

    @UI(".card-text")
    public Text subtitle;

    @UI("button")
    public Button button;

}
