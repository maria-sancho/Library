public class TestAuthor {

    public static void main(String[] args) {
        Author anAuthor = new Author("JavaSript", "java@gmail.com", 'm');
        System.out.println(anAuthor.toString());
        anAuthor.setEmail("lau@gmail.com");
        System.out.println(anAuthor);
    }



}