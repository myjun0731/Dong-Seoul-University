# Ch06. 비트 연산자 · 증감 연산자 · 분기문

비트 단위 연산, 단항 증감 연산자, 조건 분기(`if/else`, `switch`)를 학습합니다.

## 학습 주제
- 비트 연산자 (`&`, `|`, `^`, `~`)
- 비트 시프트 연산자 (`<<`, `>>`)
- 전위/후위 증감 연산자 (`++num`, `num++`)
- `if / else if / else` 분기문
- `switch / case / break` 와 `default`
- 반복문 내에서 `break` / `continue` 활용

## 예제 코드

| 파일 | 설명 |
| --- | --- |
| [`BitOperator.java`](BitOperator.java) | AND/OR/XOR/NOT 비트 연산 후 이진수로 출력. |
| [`BitShiftOp.java`](BitShiftOp.java) | 좌/우 시프트 연산. 양수·음수에 따른 동작 차이 확인. |
| [`BitSearch.java`](BitSearch.java) | 특정 위치 비트를 추출하고 전체 비트열을 출력. |
| [`bitSet.java`](bitSet.java) | 사용자가 입력한 위치의 비트를 1로 세팅하는 반복 프로그램. |
| [`PrefixOp.java`](PrefixOp.java) | 전위 증가 연산자(`++num`) 동작 확인. |
| [`PostfixOp.java`](PostfixOp.java) | 후위 증가/감소 연산자(`num++`, `num--`) 동작 확인. |
| [`SwitchBreak.java`](SwitchBreak.java) | `if-else if-else` 분기로 메시지 선택 출력. |
| [`NumberRange.java`](NumberRange.java) | `switch` 문으로 정수 범위(0~10/10~20/20~30) 판별. |
