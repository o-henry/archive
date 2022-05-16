package com.henry.archive.file.domain;

import java.util.Objects;

public record Metadata(FileType type, Long size) {

  public Metadata {
    Objects.requireNonNull(type);
    Objects.requireNonNull(size);
  }


}
