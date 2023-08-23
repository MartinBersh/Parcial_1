package org.example.repository.impl;

import org.example.domain.Contacto;
import org.example.mapping.dto.ContactoDto;
import org.example.mapping.mappers.ContactoMapper;
import org.example.repository.ContactoRespoitory;

import java.util.ArrayList;
import java.util.List;

public class ContactoRepositoryImpl implements ContactoRespoitory {


    List<Contacto> contacts;

    public ContactoRepositoryImpl() {
        contacts = new ArrayList<>();
    }
    @Override
    public ContactoDto createContact(ContactoDto contact) {
        contacts.add(ContactoMapper.mapFrom(contact));
        return contact;
    }

    @Override
    public List<ContactoDto> listContacts() {
        return ContactoMapper.mapFrom(contacts);
    }

    @Override
    public ContactoDto countContacts(ContactoDto contact) {
        return null;
    }

    @Override
    public ContactoDto listContactsByType(ContactoDto contact) {
        return null;
    }
}
