public class Printer {
    Imprimble thingForPrinting;

    public Printer (Imprimble cosaDelexterior) {
        this.thingForPrinting = cosaDelexterior;
    }

    public void printing() {
        this.thingForPrinting.print()
    }

}
//
//impresora = new Printer( TextManipulator );
//impresora.print()