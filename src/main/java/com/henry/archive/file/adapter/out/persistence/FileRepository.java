package com.henry.archive.file.adapter.out.persistence;

import com.henry.archive.file.domain.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {

}
