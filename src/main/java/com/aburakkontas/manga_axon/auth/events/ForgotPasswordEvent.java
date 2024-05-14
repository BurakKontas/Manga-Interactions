package com.aburakkontas.manga_axon.auth.events;

import lombok.Data;

@Data
public class ForgotPasswordEvent {
    private String changePasswordId;
    private String newPassword;
}
