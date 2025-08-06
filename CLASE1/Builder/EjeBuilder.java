public class EjeBuilder {
    public static void main(String[] args) {
        Converter objASCII = new ASCIIConverter();
        Converter objPS = new PostScriptConverter();
        Converter objPDF = new PDFConverter();

        
        Reader objLector1 = new Reader(objASCII);
         objLector1.parseinput("line");
        objLector1.parseinput("paragraph");
        objLector1.parseinput("table");
        Reader objLector2 = new Reader(objPS);
        objLector2.parseinput("line");
        objLector2.parseinput("paragraph");
        objLector2.parseinput("table");
        Reader objLector3 = new Reader(objPDF);
        objLector3.parseinput("line");
        objLector3.parseinput("paragraph");
        objLector3.parseinput("table");
    }
}