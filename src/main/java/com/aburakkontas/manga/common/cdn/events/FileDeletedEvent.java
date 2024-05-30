package com.aburakkontas.manga.common.cdn.events;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class FileDeletedEvent {

    private final UUID fileId;
    private final UUID ownerId;

}