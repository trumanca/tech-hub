package org.techhub.principle.s;

public class SingleResponsibility {
    public static void main( String[] args ) {
        System.out.println( "Single Responsibility" );
        BadBook badBook = new BadBook("Virus China");
        badBook.printTextToConsole();
        badBook.replaceWordInText("Virus", "Cow");
        badBook.printTextToConsole();
    }
}
