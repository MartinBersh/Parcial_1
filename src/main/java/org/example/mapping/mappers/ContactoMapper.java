package org.example.mapping.mappers;

import org.example.domain.Contacto;
import org.example.domain.enums.ContactoEnum;
import org.example.mapping.dto.ContactoDto;

import java.util.List;

public class ContactoMapper {

    public static ContactoDto mapFrom(Contacto source){
        return new ContactoDto(source.getName(),
                source.getAdress(),
                source.getType(),
                source.getEmail(),
                source.getCellPhone());
    }

    public static ContactoDto mapFrom(ContactoDto source){
        return  new ContactoDto(source.name(),
                source.address(),
                source.type(),
                source.email(),
                source.cellPhone());
    }

    public List<ContactoDto> mapFrom(List<Contacto> source){
        return source.parallelStream().map(e-> mapFrom(e)).toList();

    }

    public List<Contacto> mapFrom(List<ContactoDto> source){
        return source.parallelStream().map(e-> mapFrom(e)).toList();
    }

}
