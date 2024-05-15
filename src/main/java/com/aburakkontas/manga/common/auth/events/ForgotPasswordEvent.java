package com.aburakkontas.manga.common.auth.events;

import lombok.Data;

@Data
public class ForgotPasswordEvent {
    private String changePasswordId;
    private String newPassword;
}
