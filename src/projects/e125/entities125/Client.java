package projects.e125.entities125;

import java.util.Date;

public class Client {

    private String Name;
    private String Email;
    private Date BDate;

//#####################################################################

    public Client() {
    }

    public Client(String Name, String Email, Date BDate) {
        this.Name = Name;
        this.Email = Email;
        this.BDate = BDate;
    }

//#####################################################################

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Date getBDate() {
        return this.BDate;
    }

    public void setBDate(Date BDate) {
        this.BDate = BDate;
    }

//#####################################################################
    
}
