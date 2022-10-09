# Java to Kotlin 

- Kotlin 기본 문법을 연습하기 위한 연습장

---

## Kotlin 접근 제어자
|           |                             |
|-----------|-----------------------------|
| 접근 제어자    | 설명                          |
| public    | 모든 곳에서 접근 가능                |
| protected | 선언된 클래스 또는 하위 클래스에서만 접근가능   |
| internal  | default(Java) 같은 모듈에서만 접근 가능 |
| private   | 선언된 클래스 내에서만 접근 가능          |


- kotlin 에서 패키지는 namespace 관리용이기 때문에 protected는 의미가 달라졌다.
- Kotlin 에서는 default 가 사라지고, 모듈간의 접근을 통제하는 internal 이 새로 생겼다.
- 생성자에 접근 지시어를 붙일 때는 constructor를 명시적으로 써주어야 한다.
- 유틸성 함수를 만들 때는 파일 최상단을 이용하면 편리하다.
- 프로퍼티의 custom setter 에 접근 지시어를 붙일 수 있다.
- java 에서 kotlin 코드를 사용할 때 internal 과 protected 는 주의해야 한다.