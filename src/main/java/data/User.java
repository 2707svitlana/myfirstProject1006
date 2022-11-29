package data;

public class User {
    String Firstname = "Ivanov";
    String Lastname = "Ivan";
    String email = "email@mail.com";
    String telephone = "899877788";
    String subjects = "Chemistry";
    public User() {
        this.Firstname = "Ivanov";
        this.Lastname = "Ivan";
        this.email = "email@email.com";
        this.telephone = "0998765432";
        this.subjects = "Maths";
    }

    public User(String firstname, String lastname, String email, String telephone, String subjects) {
        this.Firstname = firstname;
        this.Lastname = lastname;
        this.email = email;
        this.telephone = telephone;
        this.subjects = subjects;
    }
    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getSubjects() {
        return subjects;
    }

    public String getTelephone() {
        return telephone;
    }
}

