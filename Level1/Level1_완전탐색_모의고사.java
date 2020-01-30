import java.util.*;

class Solution {
	public int[] solution(int[] answers) {
		int[] answer = {};

		int[] pat1 = { 1, 2, 3, 4, 5 };
		int[] pat2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] pat3 = { 3, 1, 2, 4, 5 };
		int[] cnt = { 0, 0, 0 };

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == pat1[i % 5])
				cnt[0]++;
			if (answers[i] == pat3[(i / 2) % 5])
				cnt[2]++;

			if (i % 2 == 0) {
				if (answers[i] == 2)
					cnt[1]++;
			} else {
				if (answers[i] == pat2[i % 8])
					cnt[1]++;
			}

		}

		int max = cnt[0];
		for (int i = 1; i < cnt.length; i++) {
			if (max < cnt[i])
				max = cnt[i];
		}

		List<Integer> size = new ArrayList<>();
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] == max)
				size.add(i);
		}

		answer = new int[size.size()];

		for (int i = 0; i < answer.length; i++)
			answer[i] = size.get(i) + 1;

		Arrays.sort(answer);
		return answer;
	}
}