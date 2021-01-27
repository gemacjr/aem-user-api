package com.cardinalhealth.userapi.model;



public class User {
    private String email;
    private String firstName;
    private String lastName;
    private String[] memberGroupsList;
    private String id;

    public User(String email, String firstName, String lastName, String[] memberGroupsList, String id) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberGroupsList = memberGroupsList;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String[] getMemberGroupsList() {
        return memberGroupsList;
    }

    public void setMemberGroupsList(String[] memberGroupsList) {
        this.memberGroupsList = memberGroupsList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
