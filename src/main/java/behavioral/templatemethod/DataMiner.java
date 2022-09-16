package behavioral.templatemethod;

import java.util.function.Consumer;

public abstract class DataMiner {
    public void mine(String name){
        openFile();
        parseFile();
        closeFile();
    };
    public void openFile(){
        System.out.println("openFile");
    }
    public abstract void parseFile();

    public void closeFile(){
        System.out.println("closeFile");
    }
}

class PDFDataMiner extends DataMiner{
    @Override
    public void parseFile() {
        System.out.println("PDF: parse");
    }
}


