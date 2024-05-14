package com.aburakkontas.manga_axon.auth.queries;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChangePasswordQuery {
    private String email;
    private String currentPassword;
    private String newPassword;
}
