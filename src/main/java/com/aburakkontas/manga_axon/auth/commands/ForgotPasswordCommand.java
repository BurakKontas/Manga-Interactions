package com.aburakkontas.manga_axon.auth.commands;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
public class ForgotPasswordCommand {
    private String changePasswordId;
    private String newPassword;
}
