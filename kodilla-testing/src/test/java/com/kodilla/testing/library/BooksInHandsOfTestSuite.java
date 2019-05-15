package com.kodilla.testing.library;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BooksInHandsOfTestSuite {

    LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
    BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
    LibraryUser user = new LibraryUser("Ania", "Janicka", "88073011111");

    @Test
    public void test5BooksInHandsOf(){
        //Given
        List<Book> booksInHandsList = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(booksInHandsList);

        //Then
        assertEquals(5, bookLibrary.listBooksInHandsOf(user).size());
    }

    @Test
    public void oneBookInHandsOf(){
        //Given
        List<Book> booksInHandsList = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(booksInHandsList);

        //Then
        assertEquals(1, bookLibrary.listBooksInHandsOf(user).size());
    }

    @Test
    public void testNoBooksInHandsOf(){
        //Given
        List<Book> booksInHandsList = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(booksInHandsList);

        //Then
        assertEquals(0, bookLibrary.listBooksInHandsOf(user).size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
}

