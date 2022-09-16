package behavioral.templatemethod;

import java.util.function.Consumer;

public class Runner {
    public static void main(String[] args) {
        PDFDataMiner d = new PDFDataMiner();
        d.mine("some pdf");
    }
}
