<p align="center">
    <samp>
        ARCHIVE
    </samp>
</p>

---

<br />

```
클라이언트 (모바일)
* GQL 통해 통신
* 백그라운드에서 동작가능 여부
```

```
FS 서비스
* ORM
* PostgreSQL
* S3
* Docker

* USER가 ARCHIVE 서비스를 통해 DB에 저장.
* 한개 이상의 파일을 선택해야 한다.
* 파일을 파일 DB에 업로드/제거/검색 한다.
    * fs
    * CQRS
* 데이터 타입을 전부 소화한다.
    * 압축 알고리즘
* 아카이브에 접근하기 위해서 비밀번호 대신 키워드로 대체한다.
```

```
USER 서비스
* 회원가입
    * 두가지 KEYWORD를 등록한다.
* USER DB에 회원정보(KEYWORD 포함)가 저장된다.
```

```
AUTHENTICATION 서비스
* USER가 키워드를 통해 인증한다.
* 키워드의 조건은 2가지 이며
    * 숨김 키워드를 입력할 경우 아카이브 서버에 숨김 처리 요청을 한다. (Query condition="hidden")
    * 일반 키워드를 입력할 경우 아카이브 서버에 저장된 데이터를 요청한다. (Query)
```
