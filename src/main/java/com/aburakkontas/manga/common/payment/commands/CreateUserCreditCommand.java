package com.aburakkontas.manga.common.payment.commands;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class CreateUserCreditCommand {
    private String userId;
    private Double credit = 0.0;
    private List<String> payments = new ArrayList<>();
}
