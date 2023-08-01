import javax.swing.*;

public class Calculation implements Statistical {

    int sizeArray;

    private int[] values = new int[sizeArray];
    private int minimum;
    private int maximum;
    private int average;

    private boolean calculated = false;

    public boolean isCalculated() {
        return calculated;
    }

    public void setCalculated(boolean calculated) {
        this.calculated = calculated;
    }

    public Calculation() {
    }

    public Calculation(int[] values) {
        this.values = values;
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

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    @Override
    public int calculateMinimum(int[] numbers) {

        if (numbers == null) {
            JOptionPane.showMessageDialog(null, "No existe arreglo");
            return -1;
        } else {
            int minimum  = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < minimum ) {
                    minimum  = numbers[i];
                }
            }
            return minimum ;
        }


    }

    @Override
    public int calculateMaximum(int[] numbers) {

        if (numbers == null) {
            JOptionPane.showMessageDialog(null, "No existe arreglo");

            return -1;
        } else {
            int maximum = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > maximum) {
                    maximum = numbers[i];
                }
            }
          //  JOptionPane.showMessageDialog(null, "El valor Maximo del arreglo es: " + maximum);
            return maximum;
        }


    }

    @Override
    public int calculateAverage(int[] numbers) {

        if (numbers == null) {
            JOptionPane.showMessageDialog(null, "No existe arreglo, debe de ingresarlo");

            return -1;
        }else {

            int total = 0;
            int average = 0;
            int counter = 0;
            for (int i = 0; i < numbers.length; i++) {


                total += numbers[i];
                counter++;

            }
            average = total / counter;

           // JOptionPane.showMessageDialog(null, "El valor Promedio de los elementos del arreglo es: " + average);

            return average;
        }
    }
}
