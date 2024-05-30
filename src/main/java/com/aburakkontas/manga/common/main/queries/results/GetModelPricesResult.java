package com.aburakkontas.manga.common.main.queries.results;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@Getter
@AllArgsConstructor
public class GetModelPricesResult {
    private Map<String, Double> prices;
}
