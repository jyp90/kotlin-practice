# Java to Kotlin 

- Kotlin 기본 문법을 연습하기 위한 연습장

---

## Kotlin 접근 제어자 (11강)
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

--- 

## 코틀린에서 object 키워드를 다루는 방법 (12강)
- Java static 변수와 함수를 만드려면 Kotlin companion object 사용해야 한다.
- companion object 도 하나의 객체로 간주되기 때문에 이름을 붙일 수 있고, 다른 타입을 상속받을 수도 있다.
- Kotlin 에서 싱글톤 클래스를 만들 때 'object' 키워드를 사용한다.
- Kotlin 에서 익명 클래스를 만들 때 'object : 타입'을 사용한다.

---

## 중첩클래스 (13강)
1. 내부클래스는 숨겨진 외부 클래스 정보를 가지고 있어, 참조를 해지하지 못하는 경우 메모리 누수가 생길 수 있고, 이를 디버깅하기 어렵다.
2. 내부 클래스의 직렬화 형태가 명확하게 정의되지 않아 직렬화에 있어 제한이 있다.
3. 코틀린에서는 이를 해결하기 위해 이너클래스를 제공한다.
    * 이너 클래스를 사용하기 위해 inner class / this@{className} 으로 사용한다.

---

## Data class 기본 제공 옵션 (14강)
* Data(Field)
* constructor, getter
* equals, hashCode
* toString 

## Enum class
* when 은 enum class / sealed class 와 함께 사용할 경우 효과적

## Sealed class
* 컴파일 단계에서 하위 클래스의 타입을 기억한다. 즉, 런타임 때 클래스 타입이 추가될 수 없다.
* 하위 클래스는 같은 패키지에 있어야 한다.
* enum 과 다른 점
  * 클래스를 상속받을 수 있다.
  * 하위 클래스는 멀티 인스턴스가 가능하다. 
* 추상화가 필요한 DTO 데이터에 sealed class 사용 

---

## Collection (15)
* 가변 컬렉션 : 컬렉션에 element 추가 삭제 가능
* 불변 컬렉션 : 컬렉션에 추가 삭제 불가능