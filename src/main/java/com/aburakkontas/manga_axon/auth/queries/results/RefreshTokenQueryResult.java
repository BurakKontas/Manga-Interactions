package com.aburakkontas.manga_axon.auth.queries.results;

import lombok.Data;

@Data
public class RefreshTokenQueryResult {
    private String token;
    private String refreshToken;
}
