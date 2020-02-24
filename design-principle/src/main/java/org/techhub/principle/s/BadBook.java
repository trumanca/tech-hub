package org.techhub.principle.s;

public class BadBook {

    private String name;
    private String author;
    private String text;

    public BadBook(String text){
        this.text = text;
    }

    //methods that directly relate to the book properties
    public void replaceWordInText(String fromWord, String toWord) {
        text = text.replaceAll(fromWord, toWord);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }

    //methods for outputting text to console - should this really be here?
    void printTextToConsole(){
        System.out.println(text);
    }

}
