package ro.uvt.info.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import ro.uvt.info.models.Book;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final List<Book> books = new ArrayList<>();
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(books);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBook(@PathVariable Long id) {
        return ResponseEntity.ok(null);
    }

    @PostMapping
    public ResponseEntity<String> createBook(@RequestBody Book book) {
        // For now, return a success message
        return ResponseEntity.ok("Book created successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateBook(@PathVariable Long id, @RequestBody Book book) {
        // For now, return a success message
        return ResponseEntity.ok("Book with id: " + id + " updated successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id) {
        // For now, return a success message
        return ResponseEntity.ok("Book with id: " + id + " deleted successfully");
    }
}