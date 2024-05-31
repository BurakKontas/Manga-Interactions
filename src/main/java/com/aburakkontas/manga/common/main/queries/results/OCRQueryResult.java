package com.aburakkontas.manga.common.main.queries.results;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;

@Getter
@AllArgsConstructor
public class OCRQueryResult {
    private ArrayList<ArrayList<ArrayList<OCRQueryData>>> ocrData;

    @Data
    public static class OCRQueryData {
        private String text;
        private String image;
        private Double confidence;
    }
}
