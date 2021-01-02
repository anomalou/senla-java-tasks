package com.senla.six;

import java.util.*;

public class Backpack {
    public final int maxWeight;
    int maxCost;

    public Backpack(int maxWeight){
        this.maxWeight = maxWeight;
        maxCost = 0;
    }

    public void SetCost(int cost){
        maxCost = cost;
    }

    public int GetMaxCost(){
        return maxCost;
    }
}
