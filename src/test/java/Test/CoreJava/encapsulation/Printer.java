package Test.CoreJava.encapsulation;

public class Printer {
    private int tonerLevel;
    private int noofPage;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.noofPage = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int fillTonerLevel(int tonerLevel) {
        if (tonerLevel >0 && tonerLevel <=100) {
            if (this.tonerLevel + tonerLevel >100) {
                return -1;
            }
            this.tonerLevel += tonerLevel;
            return this.tonerLevel;
        }else {
            return -1;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNoofPage() {
        return noofPage;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public int printPage(int noofPage) {
        int pageToPrinted = noofPage;
       if (this.duplexPrinter) {
           pageToPrinted = (pageToPrinted /2) + (pageToPrinted % 2);

       }
       this.noofPage = pageToPrinted;
       return pageToPrinted;
    }
}
