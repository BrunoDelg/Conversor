import javax.swing.*;

public class FunctionTemperatura {

    ConversorDeTemperatura temperatura = new ConversorDeTemperatura();

    public void ConvertirTemperatura(double temp){

        String opciones = (JOptionPane.showInputDialog(null,"Selecciona el tipo de cambio de temperaturas","Temperatura",
                JOptionPane.PLAIN_MESSAGE,null,new Object[] {"De Celsius a Fahrenheit", "De Celsius a Kelvin","De Fahrenheit a Celsius",
                "De Fahrenheit a Kelvin","De Kelvin a Fahrenheit","De Kelvin a Celsius"},"Selección")).toString();
        switch(opciones){
            case "De Celsius a Fahrenheit":
                temperatura.ConvertirCelsiusFar(temp);
                break;

            case "De Celsius a Kelvin":
                temperatura.ConvertirCelsiusKel(temp);
                break;

            case "De Fahrenheit a Celsius":
                temperatura.ConvertirFahrenheitCel(temp);
                break;

            case "De Fahrenheit a Kelvin":
                temperatura.ConvertirFahrenheitKel(temp);
                break;

            case "De Kelvin a Fahrenheit":
                temperatura.ConvertirKelvinFar(temp);
                break;

            case "De Kelvin a Celsius":
                temperatura.ConvertirKelvinCel(temp);
                break;
        }

    }
}
