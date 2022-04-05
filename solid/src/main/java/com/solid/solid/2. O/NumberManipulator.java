class NumberManipulator implements Imprimible {

    int number;


    public NumberManipulator(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

//    public int squarePower() {
//        res = this.number * this.number;
//
//        return res
//    }


    public void print() {
        System.out.println( this.number );
    }
}