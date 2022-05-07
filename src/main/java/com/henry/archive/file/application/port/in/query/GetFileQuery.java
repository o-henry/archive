package com.henry.archive.file.application.port.in.query;

import com.henry.archive.file.domain.File;
import java.util.List;
import java.util.Optional;

public interface GetFileQuery {

  Optional<File> findByHidden(Boolean hidden);

  List<File> findByWithoutHidden(String id);
}
