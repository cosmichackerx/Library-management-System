# Library-management-System
Design and implement a Library Management System that keeps track of books, users, and borrowing history using different Java data structures

```
📌 Program Statement:
Design and implement a Library Management System that keeps track of books, users, and borrowing history using different Java data structures:

Java List (ArrayList, LinkedList, Sorting):

Store all book titles in an ArrayList.

Maintain a LinkedList for recent book borrow/return history.

Provide a feature to sort books alphabetically or by publication year using Collections.sort().

Java Set (HashSet, TreeSet, LinkedHashSet):

Use a HashSet to store unique genres of books.

Use a TreeSet to store and display all registered users in sorted order by name.

Use a LinkedHashSet to store the sequence of unique recently-searched book titles (preserve insertion order).

Java Map (HashMap, TreeMap, LinkedHashMap):

Use a HashMap to map bookID → book details (title, author, genre, availability).

Use a TreeMap to map userID → user details, ensuring users are sorted by ID.

Use a LinkedHashMap to store the most recent borrow/return transactions (preserve the order of activity).

Java Iterator:

Iterate through the ArrayList of books to display available ones.

Use an Iterator to remove overdue books from a LinkedList of borrowed books.

Java Algorithms (Collections utility methods):

Use Collections.max() and Collections.min() to find the book with the highest and lowest number of times borrowed.

Use Collections.frequency() to check how many times a particular book was borrowed.

Use Collections.shuffle() to create a “Random Book Suggestion” feature for users.
```
---
```java
import java.util.*;
import java.io.*;

// Library Management System using multiple Java Data Structures
class LMS {

    void reception() {
        // Java List (ArrayList, LinkedList, Sorting)
        ArrayList<String> books = new ArrayList<>();
        books.add("The Quran");
        books.add("The Bible");
        books.add("The Lord of the Rings");
        books.add("The Little Prince");
        books.add("A Tale of Two Cities");
        books.add("The Halloween");
        books.add("Xinhua Zidian");
        books.add("Quotations from Chairman Mao Tse-Tung");

        // Borrow/return history in LinkedList
        LinkedList<String> borrowHistory = new LinkedList<>();
        borrowHistory.add(books.get(1));
        borrowHistory.add(books.get(3));
        borrowHistory.add(books.get(5));

        // Sorting
        Collections.sort(books);
        Collections.sort(borrowHistory);
        System.out.println("Sorted Books: " + books);
        System.out.println("Sorted Borrow History: " + borrowHistory);

        // Java Set (HashSet, TreeSet, LinkedHashSet)
        HashSet<String> genres = new HashSet<>();
        genres.add("Religion");
        genres.add("Fantasy");
        genres.add("Classic");
        genres.add("Fiction");
        genres.add("Philosophy");
        System.out.println("Genres: " + genres);

        TreeSet<String> users = new TreeSet<>();
        users.add("Maria");
        users.add("Nushi");
        users.add("Mohammed");
        users.add("Jose");
        users.add("Muhammad");
        users.add("Mohamed");
        users.add("Wei");
        System.out.println("Users (sorted): " + users);

        LinkedHashSet<String> searchList = new LinkedHashSet<>();
        searchList.add("The Quran");
        searchList.add("The Bible");
        searchList.add("The Halloween");
        System.out.println("Recently searched (in order): " + searchList);

        // Java Map (HashMap, TreeMap, LinkedHashMap)
        HashMap<Integer, String> bookMap = new HashMap<>();
        bookMap.put(0, books.get(0));
        bookMap.put(1, books.get(1));
        bookMap.put(2, books.get(2));
        System.out.println("Book Map: " + bookMap);

        TreeMap<Integer, String> userList = new TreeMap<>();
        userList.put(1, "Maria");
        userList.put(2, "Nushi");
        userList.put(3, "Mohammed");
        userList.put(4, "Wei");
        userList.put(5, "Jose");
        System.out.println("User List (TreeMap): " + userList);

        LinkedHashMap<Integer, String> transactions = new LinkedHashMap<>();
        transactions.put(1, "Maria borrowed The Quran");
        transactions.put(2, "Nushi borrowed The Bible");
        transactions.put(3, "Mohammed returned The Little Prince");
        System.out.println("Transactions (LinkedHashMap): " + transactions);

        // Java Iterator
        System.out.println("Available Books using Iterator:");
        Iterator<String> it = books.iterator();
        while (it.hasNext()) {
            System.out.println(" - " + it.next());
        }

        // Iterator remove example
        Iterator<String> historyIterator = borrowHistory.iterator();
        while (historyIterator.hasNext()) {
            String borrowed = historyIterator.next();
            if (borrowed.contains("Halloween")) { // assume overdue
                historyIterator.remove();
            }
        }
        System.out.println("Borrow history after removing overdue: " + borrowHistory);

        // Java Algorithms (Collections utility methods)
        List<Integer> borrowCounts = Arrays.asList(5, 12, 7, 3, 9); // mock counts
        System.out.println("Most borrowed count: " + Collections.max(borrowCounts));
        System.out.println("Least borrowed count: " + Collections.min(borrowCounts));
        System.out.println("Frequency of count '3': " + Collections.frequency(borrowCounts, 3));

        Collections.shuffle(books);
        System.out.println("Random Book Suggestion: " + books.get(0));
    }
}

public class Main {
    public static void main(String[] args) {
        LMS lms = new LMS();
        lms.reception();
    }
}
```
## 📚 Java Library Management System (LMS)

This project demonstrates a simple **Library Management System** implemented in Java, primarily to showcase the practical application of various **Java Collections Framework** data structures, including **Lists**, **Sets**, **Maps**, and **Iterators**, along with utility methods from the **`Collections`** class.

-----

## 💻 Program Overview

The `LMS` class contains a `reception()` method that initializes different library-related datasets using appropriate Java collections. The output prints the state of these collections and the results of various operations, simulating basic library functions.

### **Key Data Structures Used**

| Collection Type | Specific Class | Purpose in LMS Context | Key Feature Demonstrated |
| :--- | :--- | :--- | :--- |
| **List** | `ArrayList<String>` | Stores the main catalog of **books**. | Efficient element access and **`Collections.sort()`**. |
| **List** | `LinkedList<String>` | Stores a running **borrow/return history**. | Flexible insertions/removals (though used for simple storage here). |
| **Set** | `HashSet<String>` | Stores distinct **genres**. | **Unordered** collection of **unique** elements. |
| **Set** | `TreeSet<String>` | Stores a list of **users**. | Elements are automatically **sorted** (natural order). |
| **Set** | `LinkedHashSet<String>` | Stores the **recently searched** books. | Maintains the **insertion order** while ensuring uniqueness. |
| **Map** | `HashMap<Integer, String>` | A mapping of index to a few book titles (mock **book index**). | **Unordered** mapping of key-value pairs. |
| **Map** | `TreeMap<Integer, String>` | A mapping of user ID to **user names**. | Keys are automatically **sorted** (by user ID). |
| **Map** | `LinkedHashMap<Integer, String>` | Stores a log of library **transactions**. | Maintains the **insertion order** of key-value entries. |
| **Iterator** | `Iterator<String>` | Iterating and printing the list of available books. | Standard way to **traverse** a collection. |

-----

## ▶️ Execution

### **Prerequisites**

  * Java Development Kit (JDK) installed (version 8 or higher).

### **How to Run**

1.  Save the provided code into two files: `LMS.java` (for the `LMS` class) and `Main.java` (for the `Main` class, which contains `main()`). *Alternatively, save the entire code into a single file named `Main.java`.*
2.  Compile the Java files:
    ```bash
    javac Main.java
    ```
3.  Execute the compiled program:
    ```bash
    java Main
    ```

### **Expected Output Highlights**

The program will print a series of lines demonstrating the operations performed on the various collections.

  * **Sorting:** Books and Borrow History will be printed in alphabetical order.
  * **Set Behavior:** Genres will be printed in an arbitrary, unsorted order; Users will be printed in sorted alphabetical order; Search List will be printed in the order they were added.
  * **Map Behavior:** The different map outputs will show key-value pairs based on their specific ordering rules.
  * **Iterator Removal:** The `Borrow history after removing overdue` line will show that "The Halloween" (the overdue book) has been successfully removed using the `Iterator.remove()` method.
  * **`Collections` Algorithms:** It will print the maximum, minimum, and frequency from a list of mock borrow counts, and a single **random book suggestion**.

-----

## ✨ Features Demonstrated

1.  **Sorting:** Uses `Collections.sort()` to sort `ArrayList` and `LinkedList`.
2.  **Uniqueness:** Uses `HashSet` to ensure all genres are unique.
3.  **Automatic Ordering:** Uses `TreeSet` and `TreeMap` to maintain data in a sorted order.
4.  **Insertion Order:** Uses `LinkedHashSet` and `LinkedHashMap` to preserve the order in which elements were added.
5.  **Traversal:** Uses the standard `Iterator` to loop through the available books.
6.  **Safe Removal:** Demonstrates how to safely remove elements from a collection during iteration using `Iterator.remove()`.
7.  **Utility Algorithms:** Uses `Collections.max()`, `Collections.min()`, `Collections.frequency()`, and `Collections.shuffle()` to perform common data analysis and manipulation tasks.
