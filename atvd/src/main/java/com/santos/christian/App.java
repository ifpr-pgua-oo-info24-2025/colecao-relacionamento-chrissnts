package com.santos.christian;
import com.santos.christian.models.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Book> library = new ArrayList();

        //autores;
        Author author1 = new Author("Robert C. Martin", "American");
        Author author2 = new Author("Toni Morrison", "American");
        Author author3 = new Author("Machado de Assis", "Brazilian");
        Author author4 = new Author("Stephen King", "North American");

        // livros digitais;
        DigitalBook digitalBook1 = new DigitalBook("Clean Code", 2008, author1, 1.5);
        DigitalBook digitalBook2 = new DigitalBook("The Bluest Eye", 1970, author2, 2.0);

        //livros fisicos;
        PrintedBook printed1 = new PrintedBook("Dom Casmurro", 1899, author3, 256);
        PrintedBook printed2 = new PrintedBook("It", 1986, author4, 1168);

        library.add(digitalBook1);
        library.add(digitalBook2);
        library.add(printed1);
        library.add(printed2);

        System.out.println("\n");
        for (int i = 0; i < library.size(); i++){
          library.get(i).showDetails();
        }
    }
}
