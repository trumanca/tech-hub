package org.techhub.principle.s;

public class GoodBook {

    private String name;
    private String author;
    private String text;

    //methods that directly relate to the book properties
    public void replaceWordInText(String fromWord, String toWord) {
        text = text.replaceAll(fromWord, toWord);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }

}
