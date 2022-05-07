package com.henry.archive.file.application.port.in.command;


import com.henry.archive.file.domain.Metadata;
import javax.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;

// TODO: validate input
@EqualsAndHashCode(callSuper = false)
public class UploadFileCommand {

  @NotNull
  private final String id;

  @NotNull
  private final Boolean hidden;

  @NotNull
  private final Metadata metadata;


  public UploadFileCommand(
      String id,
      Boolean hidden,
      Metadata metadata
  ) {
    this.id = id;
    this.hidden = hidden;
    this.metadata = metadata;
  }

}
