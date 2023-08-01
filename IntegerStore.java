import javax.swing.*;
import java.util.Arrays;

public class IntegerStore extends Store {

  //  Calculation calculation;
    private int[] values;
    private int minimum;
    private int maximum;
    private double average;

    public IntegerStore() {
    }

    public IntegerStore(int minimum, int maximum, double average) {
        this.minimum = minimum;
        this.maximum = maximum;
        this.average = average;
    }

    public IntegerStore(int numvalues) {
        super(numvalues);
    }

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public void ceateArray(int nv) {

        if(this.values != null){
            JOptionPane.showMessageDialog(null,"El arreglo ya ha sido creado");
        }else {
            this.values = new int[nv];

        }

    }

    @Override
    public void destroyArray() {

        if(this.values == null){
            JOptionPane.showMessageDialog(null,"No existe arreglo, debe de crearlo");
        }else {

            this.values = null;
            JOptionPane.showMessageDialog(null, "El arreglo ha sido destruido");
        }

    }


    public void fillArray(int i, int v) {
        values[i] = v;


    }

    public void showArray() {

        String strArray = "[ " ;
        if(this.values == null){
            JOptionPane.showMessageDialog(null,"No existe arreglo, debe de crearlo");
        }else {

            for (int i = 0; i < this.values.length; i++) {
                strArray += values[i] +"  " ;


            }
            strArray += " ]";
            JOptionPane.showMessageDialog(null, strArray);
            System.out.println(Arrays.toString( values));
        }
    }

    public void showStore(){

            String strcalculated = "Minimo: " + getMinimum() + " Mamximo: " + getMaximum() + " Average " + getAverage();
            JOptionPane.showMessageDialog(null, strcalculated);

    }

    public void inputArray() {


        if (this.getValues() != null) {
            JOptionPane.showMessageDialog(null, "Ya existe un arreglo");
        } else {

            int lenghtArray;
            int cont = 0;
            int value;

            try {

                lenghtArray = Integer.parseInt(JOptionPane.showInputDialog(null, "cuantos Elementos desea ingresar"));

                this.ceateArray(lenghtArray);

                if (lenghtArray != 0) {


                    do {
                        cont++;
                        value = Integer.parseInt(JOptionPane.showInputDialog(null, "Igrese  el valor  del elemento " + cont + " del arreglo"));


                        this.fillArray(cont - 1, value);


                    } while (cont < lenghtArray);

                    JOptionPane.showMessageDialog(null, "valores ingresados: " + cont);

                }


            } catch (NumberFormatException npe) {

                JOptionPane.showMessageDialog(null, "El Valor no fue ingresado");
                lenghtArray = 0;
                System.out.println(npe.getMessage());

            }


        }

    }
}
