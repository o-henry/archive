package com.henry.archive.file.domain;

import lombok.Getter;


@Getter
public class File {

  private final String id;
  private final Boolean hidden;
  private FileType type;
  private Metadata metadata; // size, timestamp, name


  private File(String id, Boolean hidden) {
    this.id = id;
    this.hidden = hidden;
  }


  //Factory pattern
  public static File withId(String id, boolean hidden) {
    return new File(id, hidden);
  }
}

