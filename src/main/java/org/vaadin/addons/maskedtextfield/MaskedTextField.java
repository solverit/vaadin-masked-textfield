package org.vaadin.addons.maskedtextfield;

import com.vaadin.data.Property;
import com.vaadin.ui.TextField;
import org.vaadin.addons.maskedtextfield.client.MaskedTextFieldState;

/**
 * Server side component for the VMaskedTextField widget.
 */
// TODO extend any GWT Widget
public class MaskedTextField extends TextField
{
    private static final long serialVersionUID = -5168618178262041249L;

    public MaskedTextField()
    {
    }

    public MaskedTextField( String caption )
    {
        setCaption( caption );
    }

    public MaskedTextField( String caption, String mask )
    {
        setCaption( caption );
        setMask( mask );
    }

    public MaskedTextField( Property dataSource )
    {
        super( dataSource );
    }

    public MaskedTextField( String caption, Property dataSource )
    {
        super( caption, dataSource );
    }

    public String getMask()
    {
        return getState().mask;
    }

    public void setMask( String mask )
    {
        getState().mask = mask;
    }

    @Override
    public MaskedTextFieldState getState()
    {
        return (MaskedTextFieldState) super.getState();
    }
}