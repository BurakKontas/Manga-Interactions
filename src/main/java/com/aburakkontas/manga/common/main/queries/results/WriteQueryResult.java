package com.aburakkontas.manga.common.main.queries.results;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;

@Getter
@AllArgsConstructor
public class WriteQueryResult {
    private Boolean debug;
    private String lastImage;
    private ArrayList<WriteResult> results;

    @Data
    @AllArgsConstructor
    public static class WriteResult {
        private String color;
        private Integer fontSize;
        private String text;
    }
}
