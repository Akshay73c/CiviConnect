package com.civic.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class AddressDTO {
	private String street;
    private String city;
    private String state;
    private String sector;
}
