package org.example;

/*
    Дан целочисленный массив nums. Необходимо переместить все нули в конец этого массива, сохранив при этом относительный порядок остальных элементов.

    Важно: Операцию необходимо выполнить "на месте" без создания копии исходного массива.
 */

public class MoveZeros {
    public int[] moveZeroes(int[] nums) {
        int insertPos = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }

        return nums;
    }
}
