package com.aburakkontas.manga.common.main.queries.results;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;

@Getter
@AllArgsConstructor
public class CleanQueryResult {
    private ArrayList<ArrayList<Double>> predBoxes;
    private byte[] gt;
    private byte[] mask;
    private byte[] output;
    private byte[] outputComp;
    private byte[] outputImage;
}
