package com.aburakkontas.manga_axon.auth.events;

import lombok.Data;

@Data
public class SendForgotPasswordEvent {
    private String email;
}
