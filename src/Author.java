public class Author {
    private String authorName;
   private String authorSurname;
    public Author (String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;

    }
    public String getAuthorName(String authorName) {
        return authorName;
    }
    public String getAuthorSurname(String authorSurname) {
        return authorSurname;
    }
}
