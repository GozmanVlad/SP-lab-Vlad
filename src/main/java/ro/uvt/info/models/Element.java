package ro.uvt.info.models;

import lombok.Getter;
import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class Element implements Visitee {

    protected List<Element> elementList;
    public Element() {
        this.elementList = new ArrayList<>();
    }

    public void add(Element e) {
        elementList.add(e);
    }
    public void remove(Element e) {
        elementList.remove(e);
    }
    public Element get(int index) {
        return elementList.get(index);
    }

    public abstract Element clone();
}