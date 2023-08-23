package org.example.repository;

import org.example.mapping.dto.ContactoDto;

import java.util.List;

public interface ContactoRespoitory {

    ContactoDto createContact(ContactoDto contact);
    List<ContactoDto> listContacts();
    ContactoDto countContacts(ContactoDto contact);
    ContactoDto listContactsByType(ContactoDto contact);
}
