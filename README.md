# Logger for Kotlin
- Kotlin 1.5.21으로 컴파일 되었습니다.
- `ch.qos.logback:logback-classic`을 이용하여 SLF4J로 로깅합니다.

## Usage
```kotlin

class Foo {
    
    fun bar() {
        log.info("This is log.")
    }
    
    companion object: Log by Logger()
}

```
