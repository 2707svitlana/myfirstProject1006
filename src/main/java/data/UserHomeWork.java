package data;

public class UserHomeWork {


    private String firstname;
    private String secondname;
    private String email;
    private String telephone;
    private String subjects;
    public UserHomeWork() {
        this.firstname = "Tjkhhggf";
        this.secondname = "Ivan";
        this.email = "email@email.com";
        this.telephone = "0998765432";
        this.subjects = "Maths";
    }

    public UserHomeWork(String firstname, String lastname, String email, String telephone, String subjects) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.email = email;
        this.telephone = telephone;
        this.subjects = subjects;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getSubjects() {
        return subjects;
    }
}