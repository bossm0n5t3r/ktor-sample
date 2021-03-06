# ktor-sample

- [Creating HTTP APIs](https://ktor.io/docs/creating-http-apis.html)
  - Run [HttpApiApplication.kt](./src/main/kotlin/com/example/HttpApiApplication.kt)
  - Check [#1](https://github.com/bossm0n5t3r/ktor-sample/pull/1)
- [Creating a WebSocket chat](https://ktor.io/docs/creating-web-socket-chat.html)
  - How to run WebSocket chat server and clients
    - Open two `Intellij` programs
      - client `Intellij`
        - (`ktor-sample/websockets/chat/client`)
      - server `Intellij`
        - (`ktor-sample/websockets/chat/server`)
    - Run `Application.kt` at server `Intellij`
      - `ktor-sample/websockets/chat/server/src/main/kotlin/com.example.chat.server/Application.kt`
    - Run `ChatClientKt` at client `Intellij`
      - `ktor-sample/websockets/chat/client/src/main/kotlin/com.example.chat.client/ChatClient.kt`
    - Edit `Run/Debug Configuration` of client `Intellij`
    - Allow parallel run of `ChatClientKt`
    - Run another `ChatClientKt` at client `Intellij`
    - Chat each `ChatClientKt`
  - Check [#2](https://github.com/bossm0n5t3r/ktor-sample/pull/2)
- [Creating an interactive website](https://ktor.io/docs/creating-interactive-website.html)
  - Run [WebsiteApplication](./src/main/kotlin/com/example/WebsiteApplication.kt)
  - Check [#3](https://github.com/bossm0n5t3r/ktor-sample/pull/3)
