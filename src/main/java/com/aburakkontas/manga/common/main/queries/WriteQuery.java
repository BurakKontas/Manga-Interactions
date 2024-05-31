package com.aburakkontas.manga.common.main.queries;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class WriteQuery {
    private Boolean debug;
    private ArrayList<WriteData> data;
    private byte[] image;
    private final UUID userId;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class WriteData {
        private ArrayList<Double> bbox;
        private String text;
        private String color;
    }
}
