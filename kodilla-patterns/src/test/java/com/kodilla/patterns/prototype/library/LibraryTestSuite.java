package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Main Library");

        Book book1 = new Book("Book1", "Author1", LocalDate.of(1988, 07, 30));
        Book book2 = new Book("Book2", "Author2", LocalDate.of(1981, 01, 26));
        Book book3 = new Book("Book3", "Author3", LocalDate.of(2000, 02, 22));

        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);

        //When
        Library clonedLibrary = null;
        Library deepClonedLibrary = null;

        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("shallow clone");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("deep clone");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        library.books.clear();

        //Then
        Assert.assertEquals(0, library.books.size());
        Assert.assertEquals(0, clonedLibrary.books.size());
        Assert.assertEquals(3, deepClonedLibrary.books.size());
    }
}
