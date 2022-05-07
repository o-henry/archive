package com.henry.archive.file.application.port.in.query;

import com.henry.archive.file.domain.File;
import java.util.List;

public interface GetFileQuery {

  List<File> findByHidden(Boolean hidden);

  List<File> findByWithoutHidden(String id);
}
