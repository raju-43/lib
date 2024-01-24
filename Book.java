import java.util.scanner;



class Member {
    String name;
    ArrayList<Book> books;

    public Member(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }
}

class Book {
    String name;
    String checkoutDate;
    String returnDate;

    public Book(String name, String checkoutDate, String returnDate) {
        this.name = name;
        this.checkoutDate = checkoutDate;
        this.returnDate = returnDate;
    }
}

public class Library {
    public static void main(String[] args) {
        int numberOfMembers = 10;

        Member[] members = new Member[numberOfMembers];

   
        for (int i = 0; i < numberOfMembers; i++) {
            members[i] = new Member("Member" + (i + 1));
            int numberOfBooks = new Random().nextInt(21) + 10; 
           
            for (int j = 0; j < numberOfBooks; j++) {
                String bookName = "Book" + (j + 1);
                String checkoutDate = generateRandomDate();
                String returnDate = generateRandomDate();
                members[i].books.add(new Book(bookName, checkoutDate, returnDate));
            }
        }

        
        double totalDays = 0;
        int totalBooks = 0;

        for (Member member : members) {
            for (Book book : member.books) {
                totalDays += calculateDaysDifference(book.checkoutDate, book.returnDate);
                totalBooks++;
            }
        }

        double averageDays = totalDays / totalBooks;
        System.out.println("Average number of days each member keeps the book: " + averageDays);
    }

    
    private static String generateRandomDate() {
        int day = new Random().nextInt(28) + 1; 
        int month = new Random().nextInt(12) + 1; 
        int year = new Random().nextInt(5) + 2020; 

        return String.format("%02d-%02d-%04d", day, month, year);
    }

    
    private static int calculateDaysDifference(String startDate, String endDate) {
        

        String[] startParts = startDate.split("-");
        String[] endParts = endDate.split("-");

        int startDay = Integer.parseInt(startParts[0]);
        int startMonth = Integer.parseInt(startParts[1]);
        int startYear = Integer.parseInt(startParts[2]);

        int endDay = Integer.parseInt(endParts[0]);
        int endMonth = Integer.parseInt(endParts[1]);
        int endYear = Integer.parseInt(endParts[2]);

        return Math.abs((endYear - startYear) * 365 + (endMonth - startMonth) * 30 + (endDay - startDay));
    }
}


