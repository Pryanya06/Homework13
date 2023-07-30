public class Main {
    public static void main(String[] args) {
        Author henry = new Author("О.", "Генри");
        Author murakami = new Author("Харуки", "Мураками");

        Book soulMates = new Book("Родственные души", henry, 1911);
        Book kafka = new Book("Кафка на пляже", murakami, 2002);

        printBook(soulMates);
        printBook(kafka);

        soulMates.setPublishingYear(1910);
        printBook(soulMates);

        System.out.println(soulMates.equals(kafka));

        Book soulMates2 = new Book("Родственные души", henry, 1910);

        System.out.println(soulMates.equals(soulMates2));

    }

    private static void printBook(Book soulMates) {
        System.out.println(soulMates.toString);
            }
        }
