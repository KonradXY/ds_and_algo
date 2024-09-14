package _3_stack;

import java.util.Deque;
import java.util.LinkedList;

public class _4_DailyTemperatures {

    public int[] dailyTemperature(int[] temp) {
        if (temp.length == 0) return new int[]{};
        if (temp.length == 1) return new int[]{};

        int[] result = new int[temp.length];
        Deque<Temp> stack = new LinkedList<>();

        Temp currTemp = new Temp(temp[0], 0);
        stack.push(currTemp);
        for (int i = 1; i < temp.length; i++) {
            currTemp = new Temp(temp[i], i);
            while (!stack.isEmpty() && stack.peek().temp < currTemp.temp) {
                Temp pop = stack.pop();
                result[pop.index] = i - pop.index;
            }
            stack.push(currTemp);
        }

        while (!stack.isEmpty()) {
            Temp pop = stack.pop();
            result[pop.index] = 0;
        }

        return result;
    }


    private static class Temp {
        public int index;
        public int temp;

        public Temp(int temp, int index) {
            this.temp = temp;
            this.index = index;
        }


    }
}
