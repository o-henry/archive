package com.henry.archive.file.domain;

import lombok.Getter;


@Getter
public class File {

  private final String id;
  private final Boolean hidden;
  private final Metadata metadata;


  private File(String id, Boolean hidden, Metadata metadata) {
    this.id = id;
    this.hidden = hidden;
    this.metadata = metadata;
  }


  //Factory pattern
  public static File create(String id, boolean hidden, Metadata metadata) {
    return new File(id, hidden, metadata);
  }
}

