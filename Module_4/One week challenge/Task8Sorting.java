package com.OneWeekCodingChallenge;

import org.junit.Test;

public class Task8Sorting {
    public int[] sort(int[] array, int min, int max) {
            int range = max - min + 1;
            int[] result = new int[range];
            for (int i: array) {
                result[i]++;
            }
            return result;
        }



        @Test
        public void testBucketSortFor1To9() {
            int[] array = {
                    2, 1, 5, 1, 2, 3, 4, 3, 5, 6, 7, 8, 5, 6, 7, 0
            };
            int[] sort = new Task8Sorting().sort(array, 0, 8);

            for (int i = 0; i < sort.length; i++) {
                for (int j = 0; j < sort[i]; j++) {
                    System.out.println(i);
                }
            }
        }
    }

