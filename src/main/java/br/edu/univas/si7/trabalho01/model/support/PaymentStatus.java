package br.edu.univas.si7.trabalho01.model.support;

import java.util.stream.Stream;

public enum PaymentStatus {
    PENDING(1, "PENDETE"),
    PAID(2, "PAGO"),
    CANCELED(3, "CANCELADO");

    private int code;
    private String description;

    private PaymentStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public static PaymentStatus toEnum(int code) {

        return Stream.of(PaymentStatus.values())
          .filter(t -> t.getCode() == code)
          .findFirst()
          .orElseThrow(() -> new IllegalArgumentException("Invalid customer type code: " + code));
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
