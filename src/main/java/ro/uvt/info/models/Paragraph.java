package ro.uvt.info.models;

import lombok.Getter;
import lombok.Setter;
import ro.uvt.info.designpatternslab2023.AlignLeft;
import ro.uvt.info.designpatternslab2023.AlignStrategy;

public class Paragraph extends Element {
    @Getter
    private final String text;
    @Setter
    private AlignStrategy alignStrategy;
    public Paragraph(String text) {
        this.text = text;
    }
    public Paragraph(Paragraph other){
        this.text = other.text;
        this.alignStrategy = other.alignStrategy;
    }

    @Override
    public void print(){
        if(alignStrategy != null)
            alignStrategy.render(text);
        else new AlignLeft().render(text);
    }

    @Override
    public Element clone() {
        return new Paragraph(this);
    }
}