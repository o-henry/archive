package com.henry.archive.file.domain;

import java.util.Date;
import java.util.Objects;

public record Metadata(String name, FileType type, String size, Date timestamp) {

  public Metadata {
    Objects.requireNonNull(name);
    Objects.requireNonNull(type);
    Objects.requireNonNull(size);
    Objects.requireNonNull(timestamp);
  }
}
