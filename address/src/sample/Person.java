package sample;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by neonkid on 12/29/16.
 */
public class Person {
    private final SimpleStringProperty firstName = new SimpleStringProperty("");
    private final SimpleStringProperty lastName = new SimpleStringProperty("");
    private final SimpleStringProperty email = new SimpleStringProperty("");
    private final SimpleStringProperty phone = new SimpleStringProperty("");

    public Person() {
        this("","","","");
    }

    public Person(String firstName, String lastName, String email, String phone) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPhone(phone);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String fName) {
        firstName.set(fName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String fName) {
        lastName.set(fName);
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String fName) {
        email.set(fName);
    }

    public String getPhone() {
        return phone.get();
    }

    public void setPhone(String fName) {
        phone.set(fName);
    }
}

