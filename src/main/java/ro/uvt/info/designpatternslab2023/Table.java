package ro.uvt.info.designpatternslab2023;

public class Table implements Element {
    private final String title;

    public Table(String title) {
        this.title = title;
    }

    public void print(){
        System.out.println("Table with Title: " + title);
    }
}