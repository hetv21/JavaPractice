package d_Variables040223;
public class StaticVariableBooks {
    static String books = "Different types of Books:- " ; // Different types of books
    static String type1 = "Fiction";
    static String type2 = "Mystery";
    static String type3 ="Non-Fiction";
    static String type4 = "Science";
    public static void reading() {
        System.out.println("Reading is a great avocation. Its fun and gives you immense happiness."); }
        public static void knowledge () {
            System.out.println("Books are great source of knowledge.");
        }

    public static void main(String[] args) {
        System.out.println(books);
        System.out.println("Books are of various types i.e. "+type1 +"; "+type2+"; "+type3+"; "+type4+" etc");
        reading();
        knowledge();    }
}
