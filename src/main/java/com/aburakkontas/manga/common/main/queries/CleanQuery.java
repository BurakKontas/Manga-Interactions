package com.aburakkontas.manga.common.main.queries;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class CleanQuery {
    private final byte[] image;
    private final String fileType;
    private final UUID userId;
}
