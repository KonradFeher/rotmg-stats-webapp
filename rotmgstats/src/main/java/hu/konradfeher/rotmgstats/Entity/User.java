package hu.konradfeher.rotmgstats.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "user")
public class User {

    @Id
    @Column (name = "username")
    String username;
    @Column (name = "password")
    String password;
    @Column (name = "discord")
    String discord;
    @Column (name = "roles")
    String roles;
    public static Object withDefaultPasswordEncoder() {
        return null;
    }


    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.roles = "USER";
    }

    public User(String username, String password, String discord, String roles) {
        this.username = username;
        this.password = password;
        this.discord = discord;
        this.roles = roles;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return this.roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getDiscord() {
        return this.discord;
    }

    public void setDiscord(String discord) {
        this.discord = discord;
    }


    @Override
    public String toString() {
        return "{" +
            " username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            ", discord='" + getDiscord() + "'" +
            ", roles='" + getRoles() + "'" +
            "}";
    }


}