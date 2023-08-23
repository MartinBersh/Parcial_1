package org.example.domain;

import org.example.domain.enums.ContactoEnum;

public class Contacto {

    private String name;
    private String adress;
    private ContactoEnum type;
    private String email;
    private int cellPhone;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public ContactoEnum getType() {
        return type;
    }

    public void setType(ContactoEnum type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(int cellPhone) {
        this.cellPhone = cellPhone;
    }

    public Contacto(String name, String adress, ContactoEnum type, String email, int cellPhone) {
        this.name = name;
        this.adress = adress;
        this.type = type;
        this.email = email;
        this.cellPhone = cellPhone;
    }
}
