
class Book {
    private String title;
    private String edition;
    private String publisher;
    private Double price;

    Book(String s, String e, String pub, Double pr) {
        title = s;
        edition = e;
        publisher = pub;
        price = pr;
    }

    void Display() {
        System.out.println("Title\t\t" + title);
        System.out.println("Edition\t\t" + edition);
        System.out.println("Publisher\t" + publisher);
        System.out.println("Price\t\t" + price);
    }

    public static void main(String[] args) {
        Book bible = new Book("The Bible", "Roman Catholic", "God", 0.0);

        bible.Display();
    }
}
