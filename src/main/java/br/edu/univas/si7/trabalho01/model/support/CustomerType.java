package br.edu.univas.si7.trabalho01.model.support;

import java.util.stream.Stream;

public enum CustomerType {

    NATURAL_PERSON(1, "PESSOA FISICA"),
    LEGAL_PERSON(2, "PESSOA JURIDICA");

    private int code;
    private String description;

    private CustomerType(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public static CustomerType toEnum(int code) {

        return Stream.of(CustomerType.values())
          .filter(t -> t.getCode() == code)
          .findFirst()
          .orElseThrow(() -> new IllegalArgumentException("INVALID CUSTMER TYPE CODE: " + code));
    }

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
    
}
