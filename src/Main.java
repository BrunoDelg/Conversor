import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Function monedas = new Function();

        boolean flag = true;

        while(flag){

            String opciones = (JOptionPane.showInputDialog(null,"Seleccione una opción de conversor","Menu",JOptionPane.QUESTION_MESSAGE,
                    null, new Object[] {"Conversor de monedas", "Conversor de temperatura"},"Selección")).toString();

            switch(opciones){

                case "Conversor de monedas":
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                    if (ValidarNumero(input)){
                        double minput = Double.parseDouble(input);
                        monedas.ConvertirMonedas(minput);

                        int respuesta = JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversion?");
                        if (JOptionPane.OK_OPTION == respuesta){
                            System.out.println("Selecciona opción afirmativa");
                        }else{
                            flag = false;
                            JOptionPane.showMessageDialog(null,"Proceso Terminado");

                        }
                    }else {
                        JOptionPane.showMessageDialog(null,"Valor invalido","Error",JOptionPane.ERROR_MESSAGE,null);
                    }
                break;

            }

        }

    }
    public static boolean ValidarNumero(String input){
        try{
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e) {

            return false;
        }

    }
}
