package Net.SoftwareII.BackendCursoJava.Entitiess;
import java.io.Serializable;


@Entity(name="users")


public class UserEntity implements Serializable {


    private static final long serialVersionUID = 1L;


     @id
     @GeneratedValue
     private long id;

     @Column(nullable = false)
     private String userID;

    

     @Column(nullable = false, length =50)
     private String firstName;

     @Column(nullable = false, length =50)
     private String lastName;

     @Column(nullable = false, length =50)
     private String email;

     @Column(nullable = false, length =50)
     private String encriptedPassword;



    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEncriptedPassword() {
        return encriptedPassword;
    }

    public void setEncriptedPassword(String encriptedPassword) {
        this.encriptedPassword = encriptedPassword;
    }
    





}
