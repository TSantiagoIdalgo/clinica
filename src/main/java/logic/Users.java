package logic;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id;
  @Basic
  private String userName;
  @Basic
  private String password;
  @Basic
  private String role;
  @Basic
  private String email;

  public Users() {
  }

  public Users(String userName, String password, String role, String email) {
    this.userName = userName;
    this.password = password;
    this.role = role;
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public String toString() {
    return "User{" + "id=" + id + ", userName=" + userName + ", password=" + password + ", role=" + role + ", email=" + email + '}';
  }

}
