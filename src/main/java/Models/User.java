package Models;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="User")
public class User {
    @Id
    @Autowired
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name="username")
    public String username;
    @Column(name="email")
    public String email;
    @Column(name="password")
    public String password;
}
