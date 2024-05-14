package com.aburakkontas.manga_axon.auth.queries.results;

import lombok.Data;

@Data
public class ValidateTokenQueryResult {
    private boolean isValid;
}
