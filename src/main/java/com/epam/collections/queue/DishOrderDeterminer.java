package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> dishes = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }
        int counter = 0;
        while (dishes.size() != 0) {
            for (int i = 0; i < dishes.size(); i++) {
                counter++;
                if (counter == everyDishNumberToEat) {
                    res.add(dishes.get(i));
                    dishes.remove(i);
                    counter = 0;
                    i -= 1;
                }
            }
        }
        return res;
    }
}
