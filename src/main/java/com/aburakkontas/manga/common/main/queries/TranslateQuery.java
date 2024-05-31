package com.aburakkontas.manga.common.main.queries;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class TranslateQuery {
    private String target;
    private String source;
    private String text;
    private final UUID userId;
}
