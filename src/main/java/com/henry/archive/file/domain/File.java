package com.henry.archive.file.domain;

import java.util.Date;
import lombok.Getter;


@Getter
public class File {

  private final String id;
  private Boolean hidden;
  private String size;
  private FileType type;
  private Date timestamp;
  private Metadata metadata;

  private File(String id, Boolean hidden) {
    this.id = id;
    this.hidden = hidden;
  }


  //Factory pattern
  public static File withId(String id, boolean hidden) {
    return new File(id, hidden);
  }
}

