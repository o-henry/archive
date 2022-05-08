package com.henry.archive;

import com.henry.archive.file.adapter.out.persistence.FileRepository;
import com.henry.archive.file.domain.File;
import com.henry.archive.file.domain.FileType;
import com.henry.archive.file.domain.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ArchiveApplication {


  private static final Logger log = LoggerFactory.getLogger(ArchiveApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(ArchiveApplication.class, args);
  }

  @Bean
  public CommandLineRunner console(FileRepository repository) {
    return (args) -> {
      repository.save(File.create("1", false, new Metadata("tester", FileType.PNG, "44")));
    };
  }

}
