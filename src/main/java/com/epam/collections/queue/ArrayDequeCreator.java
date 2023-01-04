package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> res = new ArrayDeque<>();
        boolean isStart = true;
        Integer card;

        while (firstQueue.size() != 0) {
            if (!isStart) {
                card = res.pollLast();
                if (card != null) firstQueue.add(card);
            }
            for (int i = 0; i < 2; i++) {
                card = firstQueue.poll();
                if (card != null) res.add(card);
            }
            if (!isStart) {
                card = res.pollLast();
                if (card != null) secondQueue.add(card);
            }
            for (int i = 0; i < 2; i++) {
                card = secondQueue.poll();
                if (card != null) res.add(card);
            }
            isStart = false;
        }
        return res;
    }
}
