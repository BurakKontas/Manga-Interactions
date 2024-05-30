package com.aburakkontas.manga.common.payment.events;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserCreditCreatedEvent {
    private String userId;
    private Double credit;
    private List<String> payments;
}
