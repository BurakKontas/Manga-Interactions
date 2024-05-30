package com.aburakkontas.manga.common.cdn.queries;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class GetFileQuery {
    private final UUID fileId;
}