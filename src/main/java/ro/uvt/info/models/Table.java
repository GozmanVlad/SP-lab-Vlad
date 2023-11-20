package ro.uvt.info.models;

import lombok.Getter;
import java.util.ArrayList;

@Getter
public class Table extends Element implements Visitee {
    private final String title;
    public Table(String title) {
        this.title = title;
    }
    public Table(Table other){
        this.title = other.title;
        this.elementList = new ArrayList<>(other.elementList);
    }

    @Override
    public Element clone() {
        return new Table(this);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}