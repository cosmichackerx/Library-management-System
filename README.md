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
