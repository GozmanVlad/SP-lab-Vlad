package ro.uvt.info.designpatternslab2023;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private TableOfContents tableOfContents;
    private final List<Chapter> chapters;

    public Book(String title) {
        chapters = new ArrayList<>();
    }

    public void print(){}

    public void addAuthor(Author author) {
    }

    public int createChapter(String chapterName) {
        Chapter newChapter = new Chapter(chapterName);
        this.chapters.add(newChapter);
        return this.chapters.size() - 1;
    }

    public Chapter getChapter(int indexChapterOne) {
        return chapters.get(indexChapterOne);
    }
}