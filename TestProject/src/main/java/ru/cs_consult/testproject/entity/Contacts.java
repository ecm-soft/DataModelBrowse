package ru.cs_consult.testproject.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.util.UUID;

@JmixEntity
@Table(name = "TP_CONTACTS", indexes = {
        @Index(name = "IDX_TP_CONTACTS_ORGANIZATIONS", columnList = "ORGANIZATIONS_ID")
})
@Entity(name = "tp_Contacts")
public class Contacts {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @Column(name = "SURNAME")
    private String surname;
    @InstanceName
    @Column(name = "NAME")
    private String name;
    @Column(name = "POST")
    private String post;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PHONE")
    private String phone;
    @JoinColumn(name = "ORGANIZATIONS_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Organizations organizations;

    public Organizations getOrganizations() {
        return organizations;
    }

    public void setOrganizations(Organizations organizations) {
        this.organizations = organizations;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}