import javax.swing.*;

public class ConversorDeMonedas {

    public void ConvertirPesosDolares(double valor){
        double monedaDolar = valor / 18.76;
        monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes $ " + monedaDolar + "Dolares");
    }

    public void ConvertirPesosEuros(double valor){
        double monedaEuro = valor / 19.93;
        monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes $ " + monedaEuro + "Euros");
    }

    public void ConvertirPesosLibras(double valor){
        double monedaLibra = valor / 22.74;
        monedaLibra = (double) Math.round(monedaLibra * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes $ " + monedaLibra + "Libras");
    }

    public void ConvertirPesosYen(double valor){
        double monedaYen = valor / 0.14;
        monedaYen = (double) Math.round(monedaYen * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes $ " + monedaYen + "Yenes");
    }

    public void ConvertirPesosWon(double valor){
        double monedaWon = valor / 0.014;
        monedaWon = (double) Math.round(monedaWon * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes $ " + monedaWon + "Won");
    }

    public void ConvertirDolarPeso(double valor){
        double dolarMoneda = valor * 18.76;
        dolarMoneda = (double) Math.round(dolarMoneda * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes $ " + dolarMoneda + "pesos mxn");
    }

    public void ConvertirEuroPeso(double valor){
        double euroMoneda = valor * 19.93;
        euroMoneda = (double) Math.round(euroMoneda * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes $ " + euroMoneda + "pesos mxn");
    }

    public void ConvertirLibraPeso(double valor){
        double libraMoneda = valor * 22.74;
        libraMoneda = (double) Math.round(libraMoneda * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes $ " + libraMoneda + "pesos mxn");
    }

    public void ConvertirYenPeso(double valor){
        double yenMoneda = valor * 0.14;
        yenMoneda = (double) Math.round(yenMoneda * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes $ " + yenMoneda + "pesos mxn");
    }

    public void ConvertirWonPeso(double valor){
        double wonMoneda = valor * 0.014;
        wonMoneda = (double) Math.round(wonMoneda * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes $ " + wonMoneda + "pesos mxn");
    }
}
