package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> booksLibraryA) {

        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();

        for (Book bookLibraryA : booksLibraryA) {
            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book bookLibraryB = new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(bookLibraryA.getAuthor(), bookLibraryA.getTitle(), bookLibraryA.getPublicationYear());
            BookSignature bookSignature = new BookSignature(bookLibraryA.getSignature());
            books.put(bookSignature, bookLibraryB);
        }
        return medianPublicationYear(books);
    }
}
