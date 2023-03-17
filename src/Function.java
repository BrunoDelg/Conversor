import javax.swing.*;

public class Function {

    ConversorDeMonedas moneda = new ConversorDeMonedas();

    public void ConvertirMonedas (double minput){
        String opciones = (JOptionPane.showInputDialog(null,"Elige la moneda para tu cambio","Monedas",JOptionPane.PLAIN_MESSAGE,
                null,new Object[] {"De pesos mxn a Dólar","De pesos mxn a Euros","De pesos mxn a Libras Esterlinas","De pesos mxn a Yen Japones",
                "De pesos mxn a Won sul-coreano", "De Dólar a peso mxn","De Euros a peso mxn","De Libras Esterlinas a peso mxn","De Yen Japones a peso mxn",
                "De Won sul-coreano"},"Selección")).toString();
        switch(opciones){
            case "De pesos mxn a Dólar":
                moneda.ConvertirPesosDolares(minput);
                break;

            case "De pesos mxn a Euros":
                moneda.ConvertirPesosEuros(minput);
                break;

            case "De pesos mxn a Libras Esterlinas":
                moneda.ConvertirPesosLibras(minput);
                break;

            case "De pesos mxn a Yen Japones":
                moneda.ConvertirPesosYen(minput);
                break;

            case "De pesos mxn a Won sul-coreano":
                moneda.ConvertirPesosWon(minput);
                break;

            case "De Dólar a peso mxn":
                moneda.ConvertirDolarPeso(minput);
                break;

            case "De Euros a peso mxn":
                moneda.ConvertirEuroPeso(minput);
                break;

            case "De Libras Esterlinas a peso mxn":
                moneda.ConvertirLibraPeso(minput);
                break;

            case "De Yen Japones a peso mxn":
                moneda.ConvertirYenPeso(minput);
                break;

            case "De Won sul-coreano":
                moneda.ConvertirWonPeso(minput);
        }
    }

}
