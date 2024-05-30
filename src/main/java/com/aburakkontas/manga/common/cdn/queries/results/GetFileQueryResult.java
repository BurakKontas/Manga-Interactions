package com.aburakkontas.manga.common.cdn.queries.results;

import lombok.Data;

@Data
public class GetFileQueryResult {
    private byte[] file;
    private String fileName;
    private String fileType;
}
