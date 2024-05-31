package com.aburakkontas.manga.common.main.queries.results;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TranslateQueryResult {
    private String target;
    private String source;
    private String text;
    private String result;
}
