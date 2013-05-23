package org.vaadin.addons.maskedtextfield;


import com.vaadin.data.Property;
import com.vaadin.ui.TextField;


public class NumericTextField extends TextField
{
    private static final long serialVersionUID = 3119804051599796474L;

    public NumericTextField()
    {
        super();
    }

    public NumericTextField( Property dataSource )
    {
        super( dataSource );
    }

    public NumericTextField( String caption, Property dataSource )
    {
        super( caption, dataSource );
    }

    public NumericTextField( String caption, String value )
    {
        super( caption, value );
    }

    public NumericTextField( String caption )
    {
        super( caption );
    }
}
