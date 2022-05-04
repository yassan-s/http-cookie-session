# Http Cookie Session
HttpとCookie,Sessionについて、実際にSpring Bootにて動作確認をしています。

## Http
`GET`と`POST`についての違いを確認する。

### GET
URLのクエリパラメータに、Formの値がセットされる。
```
http://localhost:8080/httptest/result?name=aaa&password=bbb
```
`?` 以降の部分  
Key=Value の組み合わせで表示されている。
```
?name=aaa&password=bbb
```

### POST
リクエストメッセージボディにて、値がセットされる。  
`Chrome`のF12→ネットワークから確認可能。

#### 参考サイト
* [SpringBoot入門 vol.3：画面から値を渡そう](https://learning-collection.com/springboot%E5%85%A5%E9%96%80-vol-3%EF%BC%9A%E7%94%BB%E9%9D%A2%E3%81%8B%E3%82%89%E5%80%A4%E3%82%92%E6%B8%A1%E3%81%9D%E3%81%86/)
* [Spring BootとThymeleafで簡単なフォーム入出力を行う](https://note.com/ymzk_jp/n/n272dc9e5c5d3)
* [SpringBoot フォームの値を別画面に渡す](https://itsakura.com/java-springboot-submit#s2)
