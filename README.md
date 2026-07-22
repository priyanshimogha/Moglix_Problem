# Moglix_Problem

---

# Write a program

Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.

Example 1:
Input: s = "(()"Output: 2Explanation: The longest valid parentheses substring is "()".

Example 2:
Input: s = ")()())"Output: 4Explanation: The longest valid parentheses substring is "()()".

Example 3:
Input: s = ""Output: 0

Constraints:
0 <= s.length <= 3 \* 104
s[i] is '(', or ')'.

Here are the **Brute**, **Better**, and **Optimal** Java solutions for the **Longest Valid Parentheses** problem.

## 1. Brute Force — O(n³)

### Idea

- Generate every substring.
- Check whether it is a valid parentheses string.
- Keep the maximum length.

### Time Complexity

- **O(n³)**
- Space: **O(1)**

## 2. Better — Stack (O(n))

### Idea

Store indices.

- Push `-1` initially.
- If `'('`, push its index.
- If `')'`, pop.
- If stack becomes empty, push current index.
- Otherwise answer is `i - stack.peek()`.

### Time Complexity

- **O(n)**
- Space: **O(n)**

## 3. Optimal — Two Traversals (O(n), O(1))

### Idea

Left → Right

- `left++` for `'('`
- `right++` for `')'`

If `left == right`
update answer.

If `right > left`
reset both.

---

Right → Left

This handles cases where extra `'('` remain.

If `left == right`
update answer.

If `left > right`
reset both.

### Time Complexity

- **O(n)**
- Space: **O(1)**
