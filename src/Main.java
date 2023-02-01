public class Main {

    public static void main(String[] args) {
        Author author = new Author("Сергей ", "Есенин");
        Book book = new Book("Собрание сочинений", author, 1988);
        System.out.println("книга 1: " + book.getName() + ", выпущена: " + book.getPublishingYear() + ", автор: " + author.getAuthorName("Сергей ") + author.getAuthorSurname("Есенин"));
        book.setPublishingYear(2005);
        System.out.println("книга 1. переиздание: " + book.getName() + ", выпущена: " + book.getPublishingYear() + ", автор: " + author.getAuthorName("Сергей ") + author.getAuthorSurname("Есенин"));

        Author author1 = new Author("Иван ", "Тургенев");
        Book book1 = new Book("Ася", author, 1857);
        System.out.println("книга 2: " + book1.getName() + ", выпущена: " + book1.getPublishingYear() + ", автор: " + author1.getAuthorName("Иван ") + author1.getAuthorSurname("Тургенев"));
        book1.setPublishingYear(2021);
        System.out.println("книга 2. переиздание: " + book1.getName() + ", выпущена: " + book1.getPublishingYear() + ", автор: " + author1.getAuthorName("Иван ") + author1.getAuthorSurname("Тургенев"));
    }
    }
