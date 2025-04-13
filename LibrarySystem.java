public class LibrarySystem {
    public static void main(String[] args) {
        Student student = new Student();
        LibraryResource book = new Book("The Hitchhiker's Guide");
        LibraryResource journal = new Journal("Nature");
        LibraryResource thesis = new Thesis("Advanced Algorithms");
        LibraryResource audioBook = new AudioBook("Learning Java");

        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(thesis);
        student.borrowResource(audioBook);
    }
}
