package org.vaadin.addons.maskedtextfield.client.masks;

public class LowerCaseMask implements Mask
{
    @Override
    public boolean isValid( char character )
    {
        return Character.isLetter( getChar( character ) );
    }

    @Override
    public char getChar( char character )
    {
        return Character.toLowerCase( character );
    }
}