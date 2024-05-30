package com.aburakkontas.manga.common.cdn.events;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class FileUpdatedEvent {

    private final UUID fileId;
    private final String fileName;
    private final byte[] fileData;
    private final String fileType;
    private final UUID ownerId;

}