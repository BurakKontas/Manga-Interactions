package com.aburakkontas.manga_axon.auth.queries.results;

import lombok.Data;

import java.util.Map;

@Data
public class GetAllErrorCodesQueryResult {
    private Map<String, Integer> errorCodes;
}
