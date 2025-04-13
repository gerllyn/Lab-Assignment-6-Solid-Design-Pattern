public class Thesis implements LibraryResource {
    private String title;
    public Thesis(String title) { this.title = title; }
    public String getTitle() { return title; }
    public void borrow() { System.out.println("Thesis '" + title + "' borrowed."); }
}
