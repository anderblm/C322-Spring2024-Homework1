package Part2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemsTest {

    @org.junit.jupiter.api.Test
    void problem1() {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        assertArrayEquals(expected1, Problems.problem1(nums1, target1));

    }
    @org.junit.jupiter.api.Test
    void problem1p() {
        int[] nums1 = {3, 2, 4};
        int target1 = 6;
        int[] expected1 = {1, 2};
        assertArrayEquals(expected1, Problems.problem1(nums1, target1));

    }
    @Test
    void problem2() {
        Problems problems = new Problems();
        assertTrue(problems.problem2(121));
        assertTrue(problems.problem2(12321));
        assertTrue(problems.problem2(1221));
        assertTrue(problems.problem2(0));
    }
    @Test
    void problem2p() {
        Problems problems = new Problems();
        assertFalse(problems.problem2(-121));
        assertFalse(problems.problem2(10));
        assertFalse(problems.problem2(100));

    }
    @Test
    void problem3() {
        Problems problems = new Problems();
        String[] input1 = {"apple", "appreciate", "apology"};
        assertEquals("ap", problems.problem3(input1));

    }
    @Test
    void problem3p(){
        Problems problems = new Problems();
        String[] input2 = {"java", "python", "ruby"};
        assertEquals("", problems.problem3(input2));
    }
    @Test
    void problem4() {
        Problems problems = new Problems();
        assertEquals(3, problems.problem4("III"));
        assertEquals(4, problems.problem4("IV"));
        assertEquals(9, problems.problem4("IX"));
        assertEquals(58, problems.problem4("LVIII"));
        assertEquals(1994, problems.problem4("MCMXCIV"));

    }
    @Test
    void problem5() {
        Problems problems = new Problems();
        assertTrue(problems.problem5("()"));
        assertTrue(problems.problem5("{[]}"));
        assertTrue(problems.problem5("(())"));
        assertTrue(problems.problem5("[{()}]"));
    }
    @Test
    void problem5p() {
        Problems problems = new Problems();
        assertFalse(problems.problem5("("));
        assertFalse(problems.problem5(")"));
        assertFalse(problems.problem5("{[})"));

    }
    @Test
    public void Problem6() {
        // Create two sorted linked lists
        Problems.ListNode list1 = new Problems.ListNode(1);
        list1.next = new Problems.ListNode(3);
        list1.next.next = new Problems.ListNode(5);

        Problems.ListNode list2 = new Problems.ListNode(2);
        list2.next = new Problems.ListNode(4);
        list2.next.next = new Problems.ListNode(6);


        Problems problems = new Problems();


        Problems.ListNode result = problems.problem6(list1, list2);

        int[] expected = {1, 2, 3, 4, 5, 6};
        for (int value : expected) {
            assertNotNull(result);
            assertEquals(value, result.place);
            result = result.next;
        }
        assertNull(result);
    }

    @Test
    void problem7() {
        Problems problems = new Problems();
        int[] input1 = {1, 2, 9};
        int[] output1 = problems.problem7(input1);
        assertArrayEquals(new int[]{1, 3, 0}, output1);

    }
    @Test
    void problem7p() {
        Problems problems = new Problems();
        int[] input3 = {9, 9, 9};
        int[] output3 = problems.problem7(input3);
        assertArrayEquals(new int[]{1, 0, 0, 0}, output3);
    }


}