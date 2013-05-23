package org.vaadin.addons.maskedtextfield.client.masks;

public class SignMask extends AbstractMask
{
    @Override
    public boolean isValid( char character )
    {
        return character == '-' || character == '+';
    }
}