# Ch04. 표준 입력과 형 변환

`Scanner` 클래스를 이용한 표준 입력과 명시적 형 변환을 학습합니다.

## 학습 주제
- `java.util.Scanner` 임포트와 객체 생성
- `nextInt()`, `nextFloat()` 등 다양한 입력 메서드
- 입력 받은 값에 대한 사칙연산
- `int`, `double`, `float` 간의 명시적 형 변환(casting)

## 예제 코드

| 파일 | 설명 |
| --- | --- |
| [`ScanInteger.java`](ScanInteger.java) | `Scanner` 로 정수 한 개를 입력 받아 그대로 출력. |
| [`Scan02.java`](Scan02.java) | 정수 입력 후 `/10`, `%10` 으로 마지막 자릿수를 분리. |
| [`Scan03.java`](Scan03.java) | 실수 두 개를 입력 받아 합계와 평균을 출력. |
| [`Explicit_Conversion01.java`](Explicit_Conversion01.java) | `int → double → float` 명시적 캐스팅 예제. |

## 실행 시 주의사항
- `Scanner` 를 사용하므로 콘솔에서 직접 값을 입력해야 합니다.
- 실수 입력 시 한글 OS 환경에서는 소수점이 `,` 로 인식될 수 있어, `Locale` 설정이 필요할 수 있습니다.
