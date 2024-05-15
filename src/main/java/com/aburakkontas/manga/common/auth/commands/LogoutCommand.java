package com.aburakkontas.manga.common.auth.commands;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LogoutCommand {
    private String refreshToken;
}
