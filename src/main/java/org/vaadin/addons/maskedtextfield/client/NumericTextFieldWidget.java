package org.vaadin.addons.maskedtextfield.client;

import com.google.gwt.user.client.ui.TextBox;

/**
 * Created with IntelliJ IDEA.
 * User: Solverit
 * Date: 21.05.13
 * Time: 23:23
 */
// TODO extend any GWT Widget
public class NumericTextFieldWidget extends TextBox
{
    public static final String CLASSNAME = "numerictextfield";

    public NumericTextFieldWidget()
    {
        setStyleName( CLASSNAME );
    }
}
