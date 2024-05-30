package com.aburakkontas.manga.common.cdn.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class UpdateFileCommand {

    @TargetAggregateIdentifier
    private final UUID fileId;
    private final String fileName;
    private final byte[] fileData;
    private final String fileType;
    private final UUID ownerId;

}
