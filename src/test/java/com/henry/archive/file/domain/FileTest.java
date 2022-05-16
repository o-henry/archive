package com.henry.archive.file.domain;

import org.junit.jupiter.api.Test;

class FileTest {

  @Test
  public void createFileWithKey() throws Exception {
    //given
    File file = new File("tester", true, new Metadata(FileType.PNG, 1000L));
    //when

    //then

  }
}