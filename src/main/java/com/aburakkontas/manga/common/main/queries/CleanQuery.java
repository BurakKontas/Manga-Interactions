package com.aburakkontas.manga.common.main.queries;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CleanQuery {
    private final byte[] image;
    private final String fileType;
}
