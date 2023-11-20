package ro.uvt.info.designpatternslab2023;

import ro.uvt.info.models.Element;
import ro.uvt.info.models.Image;

public class ImageProxy extends Element implements Picture{
    private Image realImage;
    private final String url;

    public ImageProxy(String url){
        this.url = url;
    }

    @Override
    public String getUrl() {
        return url;
    }

    public Image LoadImage(){
        if(realImage == null)
            realImage = new Image(url);
        return realImage;
    }

    @Override
    public void print() {
        LoadImage().print();
    }

    @Override
    public Element clone() {
        return null;
    }
}