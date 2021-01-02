package com.senla.six;

import java.util.Vector;

public class Main {
    public static void main(String[] args){
        FillBackpack(new Backpack(100));
    }

    static void FillBackpack(Backpack backpack){
        Vector<Item> items = new Vector<>(){};

        items.add(new Item(10, 20));
        items.add(new Item(15, 15));
        items.add(new Item(40, 50));
        items.add(new Item(20, 10));
        items.add(new Item(35, 30));

        int[][] m = new int[items.size()][backpack.maxWeight];

        m[0][0] = 0;

        for(int i = 1; i < items.size(); i++){
            for(int j = 0; j < backpack.maxWeight; j++){
                if(items.get(i).weight > j){
                    m[i][j] = m[i - 1][j];
                }else{
                    m[i][j] = Math.max(m[i - 1][j], m[i - 1][j - items.get(i).weight] + items.get(i).cost);
                    backpack.SetCost(m[i][j]);
                }
            }
        }

        System.out.println("Max cost: " + backpack.GetMaxCost());
    }
}
