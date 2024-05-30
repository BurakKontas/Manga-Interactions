package com.aburakkontas.manga.common.cdn.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class DeleteFileCommand {

    @TargetAggregateIdentifier
    private final UUID fileId;
    private final UUID ownerId;

}

