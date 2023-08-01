public abstract class Store {

    private int numvalues;

    public Store() {
    }

    public Store(int numvalues) {
        this.numvalues = numvalues;
    }

    public abstract  void ceateArray(int nv) ;

    public void cleanArray() {

    }

    public abstract void destroyArray();

    public int getNumvalues() {
        return numvalues;
    }

    public void setNumvalues(int numvalues) {
        this.numvalues = numvalues;
    }
}
