package org.vaadin.addons.maskedtextfield.client;

import com.google.gwt.user.client.ui.TextBox;

/**
 * Created with IntelliJ IDEA.
 * User: Solverit
 * Date: 22.05.13
 * Time: 4:23
 */
// TODO extend any GWT Widget
public class MaskedTextFieldWidget extends TextBox
{
    public static final String CLASSNAME = "maskedtextfield";

    public MaskedTextFieldWidget()
    {
        // setText("MyComponent sets the text via MaskedTextFieldConnector using MaskedTextFieldState");
        setStyleName( CLASSNAME );
    }
}
