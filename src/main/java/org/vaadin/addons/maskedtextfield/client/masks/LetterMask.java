package org.vaadin.addons.maskedtextfield.client.masks;

public class LetterMask extends AbstractMask
{
    @Override
    public boolean isValid( char character )
    {
        return Character.isLetter( character );
    }
}
