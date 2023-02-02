public class Author {
    private String email;
    private String name;
    private char gender;

    public Author(String email, String name, char gender) {
        this.email = email;
        this.name = name;
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + " (" + gender + ")" + " at" + email;
    }
}