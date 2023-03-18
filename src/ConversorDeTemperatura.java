import javax.swing.*;

public class ConversorDeTemperatura {

    public void ConvertirCelsiusFar(double valor){
        double CelsiusFar = (valor* 9/5) + 32;
        CelsiusFar = (double) Math.round(CelsiusFar * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes " + CelsiusFar + " grados F°");
    }

    public void ConvertirCelsiusKel(double valor){
        double CelsiusKel = valor + 273.15;
        CelsiusKel = (double) Math.round(CelsiusKel * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes " + CelsiusKel + " grados K°");
    }

    public void ConvertirFahrenheitCel(double valor){
        double FahrenheitCel = (9/5 * valor) + 32;
        FahrenheitCel = (double) Math.round(FahrenheitCel * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes " + FahrenheitCel + " grados F°");
    }

    public void ConvertirFahrenheitKel(double valor){
        double FahrenheitKel = 5/9 * (valor - 32) + 273.15;
        FahrenheitKel = (double) Math.round(FahrenheitKel * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes " + FahrenheitKel + " grados K°");
    }

    public void ConvertirKelvinFar(double valor) {
        double KelvinFar = 9/5 * (valor - 273.15) + 32;
        KelvinFar = (double) Math.round(KelvinFar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + KelvinFar + " grados F°");
    }

    public void ConvertirKelvinCel(double valor) {
        double KelvinCel = valor - 273.15;
        KelvinCel = (double) Math.round(KelvinCel * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + KelvinCel + " grados C°");
    }
}
