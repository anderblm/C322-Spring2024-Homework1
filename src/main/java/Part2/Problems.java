package Part2;
import java.util.Arrays;
import java.lang.StringBuilder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Problems {
    public static int[] problem1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return nums;
    }


    public boolean problem2(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int reversed = 0;
        while (x > reversed) {
            int s = x % 10;
            x /= 10;

            reversed = (reversed * 10) + s;
        }

        if(x == reversed || x == reversed / 10) {
            return true;
        }
        else{
            return false;
        }
    }

    public String problem3(String[] com) {
        StringBuilder prefix = new StringBuilder();
        Arrays.sort(com);
        String first = com[0];
        String last = com[com.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return prefix.toString();
            }
            prefix.append(first.charAt(i));
        }
        return prefix.toString();
    }

    public int problem4(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i >= 0; i--) {
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result -= map.get(s.charAt(i));
            }
            else {
                result += map.get(s.charAt(i));
            }
        }
        return result;

    }


    public boolean problem5(String s) {
        int countRound = 0, countCurly = 0, countSquare = 0;

        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(':
                    countRound++;
                    break;
                case ')':
                    if (countRound == 0) return false;
                    countRound--;
                    break;
                case '{':
                    countCurly++;
                    break;
                case '}':
                    if (countCurly == 0) return false;
                    countCurly--;
                    break;
                case '[':
                    countSquare++;
                    break;
                case ']':
                    if (countSquare == 0) return false;
                    countSquare--;
                    break;
                default:
                    break;
            }
        }

        return countRound == 0 && countCurly == 0 && countSquare == 0;
    }

        //create Linkedlist 3
        // loop? list1 and list2 into list 3
        // sort list 3
        // return list 3
        // make class to pull from 
        // splice together both lists
        static class ListNode {
            int place;
            ListNode next;
            ListNode(int p) {
                this.place = p;
            }
        }

    public ListNode problem6(ListNode list1, ListNode list2) {
        ListNode nodes = new ListNode(0);
        ListNode current = nodes;

        while (list1 != null && list2 != null) {
            if (list1.place < list2.place) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
                }
                current = current.next;
            }

            if (list1 != null) {
                current.next = list1;
            } else {
                current.next = list2;
            }

            return nodes.next;
        }



    public int[] problem7(int[] num) {
        int plus = num.length - 1;
        while(plus >= 0) {
            if(num[plus] == 9) {
                num[plus] = 0;
            }
            else{
                num[plus] += 1;
                return num;
            }
            plus--;
        }
        int[] biggerNumber = new int[num.length + 1];
        biggerNumber[0] = 1;
        return biggerNumber;
    }


}
