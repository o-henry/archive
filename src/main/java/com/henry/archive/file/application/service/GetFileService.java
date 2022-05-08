package com.henry.archive.file.application.service;

import com.henry.archive.file.application.port.in.query.GetFileQuery;
import com.henry.archive.file.domain.File;
import java.util.List;
import java.util.Optional;

public class GetFileService implements GetFileQuery {

  @Override
  public Optional<File> findByHidden(Boolean hidden) {
    return null;
  }

  @Override
  public List<File> findByWithoutHidden(String id) {
    return null;
  }

}