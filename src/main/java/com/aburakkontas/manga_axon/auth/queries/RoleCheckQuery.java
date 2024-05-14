package com.aburakkontas.manga_axon.auth.queries;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleCheckQuery {
    private String email;
    private String role;
}
