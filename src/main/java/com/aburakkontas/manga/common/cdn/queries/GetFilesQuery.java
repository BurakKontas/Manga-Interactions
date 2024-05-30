package com.aburakkontas.manga.common.cdn.queries;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class GetFilesQuery {
    private String fileType;
    private UUID ownerId;
}
