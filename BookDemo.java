    public class BookDemo{
        public static void main (String[] args) {
            Author author = new Author ("Russel", "Winderand");
            Book book = new Book("\"Developing Java Software\"", author, 79.75);
            System.out.println(book.toString());
        }
    }
    class Author{
        private String firstName;
        private String lastName;
        public Author(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public String toString(){
            String fullName;
            fullName = firstName + " " + lastName;
            return fullName;
        }

            }
    class Book {
        private String title;
        private Author author;
        private double price;

        public Book(String title, Author author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public String toString() {
            String bookDetails;
            bookDetails = title + " " + author + " " + price;
            return bookDetails;
        }
    }
