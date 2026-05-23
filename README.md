# Dong-Seoul-University · Java 수업 자료

동서울 P-TECH 자바(Java) 수업 실습 코드 모음입니다.
각 챕터(`Ch02` ~ `Ch10`) 폴더에 해당 차시의 예제 자바 소스와 README가 들어 있습니다.

> 원본 경로: `Java_Class/Dev/JavaClass/src` (Eclipse 프로젝트의 `src` 디렉터리)

## 챕터 목차

| 챕터 | 주제 | 링크 |
| --- | --- | --- |
| Ch02 | Java 입문 & 출력문 (`System.out.println`) | [Ch02/README.md](Ch02/README.md) |
| Ch03 | 변수와 자료형 (`int`/`double`/`char`/`boolean`, `final`) | [Ch03/README.md](Ch03/README.md) |
| Ch04 | 표준 입력 (`Scanner`) 과 명시적 형 변환 | [Ch04/README.md](Ch04/README.md) |
| Ch05 | 산술 · 관계 · 논리 · 복합 대입 연산자, 단축 평가 | [Ch05/README.md](Ch05/README.md) |
| Ch06 | 비트 · 증감 연산자, `if-else` / `switch` 분기 | [Ch06/README.md](Ch06/README.md) |
| Ch07 | 반복문 (`for` / `while` / `do-while`) 과 중첩 반복 | [Ch07/README.md](Ch07/README.md) |
| Ch09 | 메서드(Method) 정의 · 매개변수 · 반환값 | [Ch09/README.md](Ch09/README.md) |
| Ch10 | 클래스 · 객체 · 예외 처리 · 컬렉션 종합 예제 | [Ch10/README.md](Ch10/README.md) |

> Ch08 폴더는 원본 자료에 포함되어 있지 않아 본 저장소에서도 생략되었습니다.

## 디렉터리 구조
```
.
├── Ch02/   # 출력문
├── Ch03/   # 자료형 / 변수
├── Ch04/   # 입력 / 형 변환
├── Ch05/   # 연산자
├── Ch06/   # 비트 연산자 · 분기문
├── Ch07/   # 반복문
├── Ch09/   # 메서드
└── Ch10/   # 클래스 · 컬렉션 종합 예제
```

## 실행 방법
모든 예제는 `package ChXX;` 선언이 되어 있으므로 저장소 루트에서 컴파일/실행합니다.

```bash
# 컴파일 (예: Ch07/ByTimes5.java)
javac Ch07/ByTimes5.java

# 실행
java Ch07.ByTimes5
```

Eclipse 사용 시에는 본 저장소 루트의 각 `ChXX` 디렉터리를 `src` 폴더에 그대로 넣어 사용할 수 있습니다.
