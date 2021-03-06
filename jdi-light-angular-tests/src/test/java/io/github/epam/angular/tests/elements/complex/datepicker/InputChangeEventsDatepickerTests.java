package io.github.epam.angular.tests.elements.complex.datepicker;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.epam.jdi.light.elements.composite.WebPage.refresh;
import static io.github.com.pages.sections.DatepickerSection.inputChangeEventsDatepicker;

public class InputChangeEventsDatepickerTests extends TestsDatepickerBase {
    private final String inputChangeEvents = "Input & change events";

    @BeforeMethod(alwaysRun = true)
    public void before() {
        inputChangeEventsDatepicker.show();
        inputChangeEventsDatepicker.clear();
    }

    @Test
    public void checkLabelValue() {
        inputChangeEventsDatepicker.label().has().value(inputChangeEvents);
    }

    @Test
    public void selectFirstInputChangeEventsTest() {
        refresh();
        LocalDate firstEventDate = LocalDate.now();
        List<String> inputChangeEvents = getInputChangeEvents(firstEventDate);
        inputChangeEventsDatepicker.select(firstEventDate);
        inputChangeEventsDatepicker.select(LocalDate.of(2020, 8, 9));
        inputChangeEventsDatepicker.is().firstInputChangeEvents(inputChangeEvents);
    }

    @Test
    public void selectLastInputChangeEventsTest() {
        LocalDate lastEventDate = LocalDate.now();
        List<String> inputChangeEvents = getInputChangeEvents(lastEventDate);
        inputChangeEventsDatepicker.select(LocalDate.of(2020, 8, 9));
        inputChangeEventsDatepicker.select(lastEventDate);
        inputChangeEventsDatepicker.is().lastInputChangeEvents(inputChangeEvents);
    }

    @Test
    public void selectLastNullInputChangeEventsTest() {
        LocalDate eventDate = LocalDate.now();
        List<String> inputChangeEvents = new ArrayList<>(Arrays.asList("input: null", "change: null"));
        inputChangeEventsDatepicker.select(eventDate);
        inputChangeEventsDatepicker.clear();
        inputChangeEventsDatepicker.is().lastInputChangeEvents(inputChangeEvents);
    }

    @Test
    public void selectLastNullChangeEventTest() {
        LocalDate eventDate = LocalDate.now();
        String changeEvent = "change: null";
        inputChangeEventsDatepicker.select(eventDate);
        inputChangeEventsDatepicker.clear();
        inputChangeEventsDatepicker.is().lastChangeEvent(changeEvent);
    }

    @Test
    public void selectLastNullInputEventTest() {
        String inputEvent = "input: null";
        inputChangeEventsDatepicker.setText("2020");
        inputChangeEventsDatepicker.clear();
        inputChangeEventsDatepicker.is().lastInputEvent(inputEvent);
    }

    @Test
    public void selectLastUndefinedChangeEventTest() {
        refresh();
        String changeEvent = "change: undefined";
        inputChangeEventsDatepicker.show();
        inputChangeEventsDatepicker.sendKeys("august");
        inputChangeEventsDatepicker.clear();
        inputChangeEventsDatepicker.is().lastChangeEvent(changeEvent);
    }

    @AfterMethod(alwaysRun = true)
    public void after() {
        if (inputChangeEventsDatepicker.isExpanded()) {
            inputChangeEventsDatepicker.collapse();
        }
        if (!inputChangeEventsDatepicker.isEmpty()) {
            inputChangeEventsDatepicker.clear();
        }
    }
}
