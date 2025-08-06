public class Reader {
    private Converter converter;

    //constructor
    public Reader(Converter converter) {
        this.converter = converter;
    }

    public void parseinput(String element) {
        switch (element) {
            case "line":
                converter.makeLine();
                break;
            case "paragraph":
                converter.makeParagraph();
                break;
            case "table":
                converter.makeTable();
                break;
            default:
                System.out.println("option not recognized");
        }
    }
}