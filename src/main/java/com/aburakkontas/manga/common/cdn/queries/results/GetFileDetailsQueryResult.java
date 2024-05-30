package com.aburakkontas.manga.common.cdn.queries.results;

import lombok.Data;

import java.util.UUID;

@Data
public class GetFileDetailsQueryResult {
    private UUID fileId;
    private String fileName;
    private String fileType;
    private long size;
    private UUID ownerId;
}
