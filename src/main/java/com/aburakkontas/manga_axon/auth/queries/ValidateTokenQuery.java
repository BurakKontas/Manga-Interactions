package com.aburakkontas.manga_axon.auth.queries;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ValidateTokenQuery {
    private String token;
}
