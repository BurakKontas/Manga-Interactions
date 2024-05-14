package com.aburakkontas.manga_axon.auth.queries.results;

import lombok.Data;

@Data
public class OAuth2CallbackQueryResult {
    private String token;
    private String refreshToken;
}
