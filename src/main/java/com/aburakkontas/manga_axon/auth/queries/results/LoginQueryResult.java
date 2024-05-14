package com.aburakkontas.manga_axon.auth.queries.results;

import lombok.Data;

@Data
public class LoginQueryResult {
    private String token;
    private String refreshToken;
}
