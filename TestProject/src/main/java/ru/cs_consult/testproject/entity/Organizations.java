package ru.cs_consult.testproject.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "TP_ORGANIZATIONS")
@Entity(name = "tp_Organizations")
public class Organizations {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @InstanceName
    @Column(name = "NAME")
    private String name;
    @Temporal(TemporalType.DATE)
    @Column(name = "REGISTRATION_DATE")
    private Date registrationDate;
    @Column(name = "INN")
    private String inn;
    @Column(name = "KPP")
    private String kpp;
    @OneToMany(mappedBy = "organizations")
    private List<Contacts> contacts;

    public List<Contacts> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contacts> contacts) {
        this.contacts = contacts;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}