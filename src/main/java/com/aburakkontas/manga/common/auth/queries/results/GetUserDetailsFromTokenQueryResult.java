package com.aburakkontas.manga.common.auth.queries.results;

import lombok.Data;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.UUID;

@Data
public class GetUserDetailsFromTokenQueryResult {
    private String email;
    private String firstName;
    private String lastName;
    private ArrayList<String> permissions;
    private String username;
    private UUID userId;
    private ZonedDateTime lastLogin;
}
