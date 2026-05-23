package Ch10;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class BitSet {

	public void printBinaryValue(byte flagSet) {
		String rtn = "";
		int tmp = 0;

		for (int i = 7; i >= 0; i--) {
			tmp = (flagSet >> i) & 1;
			rtn = rtn + tmp;
		}

		System.out.println(">>>>>> 현재 비트값 : " + rtn);
	}

	public byte setFlagBit(byte flagValue, int bitPosition) throws Exception {
		if (bitPosition < 0 || bitPosition > 7) {
			System.out.println("[ERR] bitPosition 범위 벗어남 : " + bitPosition);
			return flagValue;
		}

		byte rst = flagValue;
		rst = (byte) (rst | (1 << bitPosition));

		return rst;
	}

	public byte setBitOne(byte flag, int idx) {
		byte rtn = flag;
		if (idx >= 0 && idx <= 7) {
			rtn = (byte) (rtn | (1 << idx));
		}
		return rtn;
	}

	public static void main(String[] args) throws Exception {
		BitSet vrBit = new BitSet();
		byte flag = (byte) 0b00000000;
		Scanner sc = new Scanner(System.in);
		Map<String, Object> rtnMap = new HashMap<String, Object>();
		List<Integer> list = new ArrayList<Integer>();
		int cnt = 0;

		System.out.println("==== BitSet START ====");
		vrBit.printBinaryValue(flag);

		while (true) {
			System.out.println("==================================");
			System.out.print("세팅할 비트 위치 입력(0~7, 종료:-1) >>> ");

			int idx = -1;
			String tmp = "";

			try {
				tmp = sc.nextLine().trim();
				if (tmp == null || "".equals(tmp)) {
					System.out.println("값을 입력해주세요");
					continue;
				}
				idx = Integer.parseInt(tmp);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("숫자만 입력하세요");
				continue;
			}

			if (idx == -1) {
				break;
			}

			if (idx < 0 || idx > 7) {
				System.out.println("0 ~ 7 사이 값만 입력 가능합니다");
				continue;
			}

			flag = vrBit.setFlagBit(flag, idx);
			vrBit.printBinaryValue(flag);

			list.add(idx);
			cnt++;

			rtnMap.put("lastIdx", idx);
			rtnMap.put("lastValue", flag);
			rtnMap.put("cnt", cnt);
		}

		System.out.println("==== 최종 결과 ====");
		vrBit.printBinaryValue(flag);
		System.out.println("총 세팅 횟수 : " + cnt);
		System.out.println("입력 idx list : " + list.toString());
		System.out.println("rtnMap : " + rtnMap.toString());

		sc.close();
	}
}