package org.example;

/*
Напишите функцию, которая переворачивает строку. Входная строка задана как массив символов s.

Это необходимо сделать, изменив входной массив на месте с использованием O(1) дополнительной памяти. Не нужно возвращать исходный массив!
*/

public class ReverseString {
    public void reverseString(char[] s) {
        char temp;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - i - 1] = temp;
        }
    }
}
