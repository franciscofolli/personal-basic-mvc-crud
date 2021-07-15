package com.personal.folli.models;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="users")
public class UserModel implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull(message = "username cannot be null")
//    @NotEmpty(message = "username cannot be empty")
    @Size(max=10)
    private String username;

    @NotNull(message = "password cannot be null")
//    @NotEmpty(message = "password cannot be empty")
    @Size(max=20)
    private String password;

    @NotNull(message = "Phone Number cannot be null")
//    @NotEmpty(message = "Phone Number be empty")
    @Size(max=11)
    private String phoneNumber;

//    @NotNull(message = "cadData cannot be null")
    private LocalDateTime cadData;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public String getPassword() {
//        return password;
//    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDateTime getCadData() {
        return cadData;
    }

    public void setCadData(LocalDateTime cadData) {
        this.cadData = cadData;
    }
}
