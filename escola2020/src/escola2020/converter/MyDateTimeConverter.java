package escola2020.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;
import javax.faces.convert.DateTimeConverter;
import javax.faces.convert.FacesConverter;
@FacesConverter(value = "conversorDeData")
public class MyDateTimeConverter extends DateTimeConverter {
	public MyDateTimeConverter() {
        setPattern("dd/MM/yyyy");
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value != null && value.length() != getPattern().length()) {
            throw new ConverterException("Formato invalido");
        }

        return super.getAsObject(context, component, value);
    }
}
