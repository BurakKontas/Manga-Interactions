package com.aburakkontas.manga.common.cdn.queries;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class GetFileDetailsQuery {
    private final UUID fileId;
    private final UUID ownerId;
}
