package com.github.catvod.bean.ali;

import com.github.catvod.utils.Utils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter implements Comparator<Item> {

    public static void sort(List<Item> items) {
        Collections.sort(items, new Sorter());
    }

    @Override
    public int compare(Item o1, Item o2) {
        try {
            return Integer.valueOf(Utils.removeExt(o1.getDisplayName())).compareTo(Integer.valueOf(Utils.removeExt(o2.getDisplayName())));
        } catch (NumberFormatException e) {
            return o1.getDisplayName().compareToIgnoreCase(o2.getDisplayName());
        }
    }
}
