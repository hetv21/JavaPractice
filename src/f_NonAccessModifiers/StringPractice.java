package f_NonAccessModifiers;
public class StringPractice {
    public static void main(String[] args) {
        String longWord= "pneumonoultramiscroscopicsilicovolcanoconiosis";
        String s = "abcdef";
        String a = "c";
        System.out.println(longWord);
        System.out.println(longWord.length());
        System.out.println(longWord.toUpperCase());
        System.out.println(longWord.contentEquals(s));
        System.out.println(longWord.contains(a));
        System.out.println(s.contains(a));

        StringBuffer myRevObj =new StringBuffer(longWord);
        System.out.println(myRevObj.reverse());
    }
}
