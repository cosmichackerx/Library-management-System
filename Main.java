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
