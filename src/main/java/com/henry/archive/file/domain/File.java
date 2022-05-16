package com.henry.archive.file.domain;

import lombok.Getter;


public class File {

  @Getter
  private final String id;
  @Getter
  private final Boolean hidden;
  @Getter
  private final Metadata metadata;


  private File(String id, Boolean hidden, Metadata metadata) {
    this.id = id;
    this.hidden = hidden;
    this.metadata = metadata;
  }


  public static File withKey(String id, boolean hidden, Metadata metadata) {
    return new File(id, hidden, metadata);
  }

  public static File withoutKey(String id, Metadata metadata) {
    return new File(id, null, metadata);
  }

  // TODO: 유저가 갖고있는 최대 저장 용량 을 초과하면 업로드가 불가능하다. (다른 도메인에 있어야 한다.)
}

