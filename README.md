# Leetcode

## Problemas Resueltos
- [TwoSum](#1-two-sum---easy)
- [Add Two Numbers](#2-add-two-numbers---medium)
- [Palindrome Number](#9-palindrome-number---easy)
- [Roman to Integer](#13-roman-to-integer---easy)
- [Longest Common Prefix](#14-longest-common-prefix---easy)
- [Valid Parentheses](#20-valid-parentheses---easy)
- [Merge Two Sorted List](#21-merge-two-sorted-lists---easy)
- [Remove Element](#27-remove-element---easy)
- [Find the Index of the First Occurrence in a String](#28-find-the-index-of-the-first-occurrence-in-a-string---easy)
- [Search Insert Position](#35-search-insert-position---easy)
- [Length of Last Word](#58-length-of-last-word---easy)
- [Plus One](#66-plus-one---easy)
- [Add Binary](#67-add-binary)


***

## Problemas
### 1. Two Sum - Easy

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

### 2. Add Two Numbers - Medium

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

![addtwonumber1](https://github.com/AlejaSj/leetcode/assets/170385707/ed1b2e45-5c28-44a1-ab8f-efc96ca3a4d8)


### 9. Palindrome Number - Easy

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

### 13. Roman to Integer - Easy

Roman numerals are represented by seven different symbols: `I`, `V`, `X`, `L`, `C`, `D` and `M`.

|Symbol|Value|
|---|---|
|I|1|
|V|5|
|X|10|
|L|50|
|C|100|
|D|500|
|M|1000|

For example, `2` is written as `II` in Roman numeral, just two ones added together. `12` is written as `XII`, which is simply `X + II`. The number `27` is written as `XXVII`, which is `XX + V + II`.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

### 14. Longest Common Prefix - Easy

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string `""`.

### 20. Valid Parentheses - Easy
Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

### 21. Merge Two Sorted Lists - Easy

You are given the heads of two sorted linked lists `list1` and `list2`.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

### 26. Remove Duplicates from Sorted Array - Easy

Given an integer array `nums` sorted in **non-decreasing order**, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in `nums`.

Consider the number of unique elements of `nums` to be `k`, to get accepted, you need to do the following things:

- Change the array `nums` such that the first `k` elements of `nums` contain the unique elements in the order they were present in `nums` initially. The remaining elements of `nums` are not important as well as the size of nums.
- Return `k`.

### 27. Remove Element - Easy

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

- Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.

- Return k.

### 28. Find the Index of the First Occurrence in a String - Easy

Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

### 35. Search Insert Position - Easy

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.

### 58. Length of Last Word - Easy

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
consisting of non-space characters only.

### 66. Plus One - Easy

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

### 67. Add Binary

Given two binary strings a and b, return their sum as a binary string.

***



