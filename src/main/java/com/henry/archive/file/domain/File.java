package com.henry.archive.file.domain;

import lombok.Getter;


@Getter
public class File {

  private final String id;
  private final Boolean key;

  private String size;
  private String type;
  private String timestamp;
  private String metadata;

  public File(String id, Boolean key) {
    this.id = id;
    this.key = key;
  }


  public static File withKey(String id, boolean key) {
    return new File(id, key);
  }

  public static File withoutKey(String id) {
    return new File(id, null);
  }
  

}
