package com.aburakkontas.manga_axon.auth.queries.results;

import lombok.Data;

@Data
public class ResendEmailVerificationQueryResult {
    private String registrationId;
}
