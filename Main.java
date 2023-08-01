import javax.swing.*;


public class Main {
    // static int lenghtArray = 0;
    //  IntegerStore integerStore = new IntegerStore(0);

    public static void main(String[] args) {

        IntegerStore integerStore = new IntegerStore(0);
        Calculation calculation = new Calculation();


        boolean bandera = true;

        int choice;
        boolean activated = true;


        do {
            try {
                choice = Integer.parseInt(JOptionPane.showInputDialog(null, getMenu()));


                switch (choice) {
                    case 1:
                        integerStore.inputArray();

                        break;
                    case 2:
                        if (integerStore.getValues() == null) {
                            JOptionPane.showMessageDialog(null, "No existe Arreglo debe de Crearlo");
                        } else {

                            int min = calculation.calculateMinimum(integerStore.getValues());
                            integerStore.setMinimum(min);
                            int max = calculation.calculateMaximum(integerStore.getValues());
                            integerStore.setMaximum(max);
                            double avg = calculation.calculateAverage(integerStore.getValues());
                            integerStore.setAverage(avg);
                            calculation.setCalculated(true);
                            JOptionPane.showMessageDialog(null, "Calculo de valores minimo, máximo y promedio realizado con exito");
                        }
                        break;

                    case 3:
                        integerStore.showArray();
                        break;
                    case 4:

                        if (integerStore.getValues() == null && !calculation.isCalculated()) {
                            JOptionPane.showMessageDialog(null, "No existe Arreglo debe de Crearlo");
                        } else if (calculation.isCalculated()) {
                            integerStore.showStore();
                        } else {
                            JOptionPane.showMessageDialog(null, "Los valores de Mínimo, Maximo y Promedio no han sido Calculados");
                        }
                        break;

                    case 5:
                        integerStore.destroyArray();

                        break;


                    case 6:

                        activated = false;
                        JOptionPane.showMessageDialog(null, "Ha salido del sistema");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no valida");
                        break;

                }

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, " No ha seleccionado ninguna opción");

            }
        } while (activated);


    }


    public static String getMenu() {

        String menu = "--------------------------------------------------------------" + "\n";
        menu += "CALCULOS PARA UN ARREGLO" + "\n";
        menu += "                        " + "\n";
        menu += "Seleccione la opción que desea realizar:" + "\n";
        menu += "1- Ingresar valores de cada elemento del Arreglo" + "\n";
        menu += "2- Realizar cálculos  y almacenamiento (Mínimo, Maximo y Promedio)" + "\n";
        menu += "3- Mostrar el Arreglo" + "\n";
        menu += "4- Mostrar los valores almacenados (Mínimo, máximo , promedio)" + "\n";
        menu += "5- Destruir el Arreglo" + "\n";
        menu += "6- Salir" + "\n";

        return menu;


    }


}