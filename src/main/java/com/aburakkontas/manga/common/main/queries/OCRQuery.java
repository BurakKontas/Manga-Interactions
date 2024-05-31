package com.aburakkontas.manga.common.main.queries;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class OCRQuery {
    private ArrayList<ArrayList<Double>> predBoxes;
    private byte[] image;
    private final UUID userId;
}
