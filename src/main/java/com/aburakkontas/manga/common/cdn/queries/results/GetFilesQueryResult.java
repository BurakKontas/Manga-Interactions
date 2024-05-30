package com.aburakkontas.manga.common.cdn.queries.results;

import lombok.Data;

import java.util.ArrayList;

@Data
public class GetFilesQueryResult {
    private ArrayList<GetFileDetailsQueryResult> files;
}
