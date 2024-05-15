package com.aburakkontas.manga.common.auth.commands;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SendForgotPasswordCommand {
    private String email;
}
