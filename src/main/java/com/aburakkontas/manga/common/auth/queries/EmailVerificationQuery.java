package com.aburakkontas.manga.common.auth.queries;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmailVerificationQuery {
    private String verificationId;
    private String oneTimeCode;
}
