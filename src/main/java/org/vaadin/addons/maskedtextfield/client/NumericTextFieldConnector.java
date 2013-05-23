package org.vaadin.addons.maskedtextfield.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;
import org.vaadin.addons.maskedtextfield.NumericTextField;

@Connect( NumericTextField.class )
public class NumericTextFieldConnector extends AbstractComponentConnector
{
    public NumericTextFieldConnector()
    {
        super();
        getWidget().addKeyPressHandler( new KeyPressHandler()
        {
            @Override
            public void onKeyPress( KeyPressEvent e )
            {
                if( e.getCharCode() == KeyCodes.KEY_BACKSPACE
                        || e.getCharCode() == KeyCodes.KEY_DELETE
                        || e.getCharCode() == KeyCodes.KEY_END
                        || e.getCharCode() == KeyCodes.KEY_ENTER
                        || e.getCharCode() == KeyCodes.KEY_ESCAPE
                        || e.getCharCode() == KeyCodes.KEY_HOME
                        || e.getCharCode() == KeyCodes.KEY_LEFT
                        || e.getCharCode() == KeyCodes.KEY_PAGEDOWN
                        || e.getCharCode() == KeyCodes.KEY_PAGEUP
                        || e.getCharCode() == KeyCodes.KEY_RIGHT
                        || e.getCharCode() == KeyCodes.KEY_TAB
                        || e.isAnyModifierKeyDown() )
                {
                    return;
                }
                if( !Character.isDigit( e.getCharCode() ) )
                {
                    e.preventDefault();
                }
            }
        } );

        getWidget().addKeyDownHandler( new KeyDownHandler()
        {
            @Override
            public void onKeyDown( KeyDownEvent event )
            {
                try
                {
                    if( event.getNativeKeyCode() == KeyCodes.KEY_UP )
                    {
                        int value = Integer.parseInt( getWidget().getValue() );

                        value++;

                        getWidget().setValue( String.valueOf( value ) );

                        event.preventDefault();
                    }
                    else
                    {
                        if( event.getNativeKeyCode() == KeyCodes.KEY_DOWN )
                        {
                            int value = Integer.parseInt( getWidget().getValue() );

                            value--;

                            getWidget().setValue( String.valueOf( value ) );

                            event.preventDefault();
                        }
                    }
                }
                catch( Exception e )
                {
                    getWidget().setValue( "0" );
                }
            }
        } );
    }

    @Override
    protected Widget createWidget()
    {
        return GWT.create( NumericTextFieldWidget.class );
    }

    @Override
    public NumericTextFieldWidget getWidget()
    {
        return (NumericTextFieldWidget) super.getWidget();
    }

    @Override
    public NumericTextFieldState getState()
    {
        return (NumericTextFieldState) super.getState();
    }

    @Override
    public void onStateChanged( StateChangeEvent stateChangeEvent )
    {
        super.onStateChanged( stateChangeEvent );

        // TODO do something useful
        final String text = getState().text;
        getWidget().setText( text );
    }

    @SuppressWarnings("unused")
    private String getValueToOperate( String value )
    {
        return value.length() > 1 ? value.substring( value.length() - 2 ) : value
                .substring( value.length() - 1 );
    }

    @SuppressWarnings("unused")
    private String getLiteralValue( String value )
    {
        return value.length() > 1 ? value.substring( 0, value.length() - 2 )
                : value.substring( 0, value.length() - 1 );
    }
}
