package com.aburakkontas.manga_axon.auth.queries;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OAuth2CallbackQuery {
    private String code;
}
