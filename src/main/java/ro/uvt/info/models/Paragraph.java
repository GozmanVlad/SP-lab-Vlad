package ro.uvt.info.models;

import lombok.Getter;

@Getter
public class Paragraph extends Element implements Visitee {
    private final String text;
    public Paragraph(String text) {
        this.text = text;
    }
    public Paragraph(Paragraph other){this.text = other.text;}


    @Override
    public Element clone() {
        return new Paragraph(this);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}