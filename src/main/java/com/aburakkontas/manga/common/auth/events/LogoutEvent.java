package com.aburakkontas.manga.common.auth.events;

import lombok.Data;

@Data
public class LogoutEvent {
    private String refreshToken;
}
