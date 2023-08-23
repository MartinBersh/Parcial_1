package org.example.mapping.dto;

import org.example.domain.enums.ContactoEnum;

public record ContactoDto (String name,
                          String address,
                          ContactoEnum type,
                          String email,
                          int cellPhone){

}
