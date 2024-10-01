package com.mycompany.clinica;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id;
  @Basic
  private String name;
  @Basic
  private String lastname;

  public Person() {
  }

  public Person(String name, String lastname) {
    this.name = name;
    this.lastname = lastname;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

}
