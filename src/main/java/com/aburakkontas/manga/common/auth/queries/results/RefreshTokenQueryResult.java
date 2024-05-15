package com.aburakkontas.manga.common.auth.queries.results;

import lombok.Data;

@Data
public class RefreshTokenQueryResult {
    private String token;
    private String refreshToken;
}
