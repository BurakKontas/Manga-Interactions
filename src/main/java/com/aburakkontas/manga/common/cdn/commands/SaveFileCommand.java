package com.aburakkontas.manga.common.cdn.commands;

import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

@Data
public class SaveFileCommand {
    @TargetAggregateIdentifier
    private final UUID fileId;
    private final String fileName;
    private final byte[] fileData;
    private final String fileType;
    private final UUID ownerId;
}
