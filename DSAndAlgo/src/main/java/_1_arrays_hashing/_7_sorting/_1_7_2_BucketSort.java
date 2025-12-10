package _1_arrays_hashing._7_sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class _1_7_2_BucketSort {

    public static void bucketSort(double[] arr) {

        int n = arr.length;
        if (n <= 0) return;

        List<Double>[] buckets = new ArrayList[n];

        // Initialize buckets
        IntStream.range(0, n)
                .forEach(i -> buckets[i] = new ArrayList<>());

        // Add values to bucket
        IntStream.range(0, n)
                .forEach(i -> {
                    int bucketIdx = i * n;
                    buckets[bucketIdx].add(arr[i]);
                });

        // Sort buckets
        IntStream.range(0, n)
                .forEach(i -> Collections.sort(buckets[i]));

        // Concatenate buckets on original array
        AtomicInteger count = new AtomicInteger(0);
        Arrays.stream(buckets)
                .flatMap(List::stream)
                .forEach(val -> {
                    arr[count.getAndIncrement()] = val;
                });


    }

}
