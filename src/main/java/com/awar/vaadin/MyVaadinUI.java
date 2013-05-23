package com.awar.vaadin;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.addons.maskedtextfield.MaskedTextField;
import org.vaadin.addons.maskedtextfield.NumericTextField;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class MyVaadinUI extends UI
{

    @Override
    protected void init( VaadinRequest request )
    {
        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin( true );
        setContent( layout );

        layout.addComponent( new NumericTextField( "Numeric" ) );
        layout.addComponent( new MaskedTextField( "Phone (###) ####-####", "+55 (###) ####-####" ) );
        layout.addComponent(new MaskedTextField( "Signed number", "~####" ) );
        layout.addComponent(new MaskedTextField( "Escape #2010", "'#####" ) );
        layout.addComponent(new MaskedTextField( "'2010'", "''####''" ) );

    }

}
