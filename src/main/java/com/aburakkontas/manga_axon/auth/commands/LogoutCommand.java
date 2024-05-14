package com.aburakkontas.manga_axon.auth.commands;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LogoutCommand {
    private String refreshToken;
}
