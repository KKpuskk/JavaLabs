package ru.ivt5.v1;

import ru.ivt5.misc.ListObject;

public class Main {
    public static void main(String[] args) {

        ListObject list1 = new ListObject(20);
        ListObject list2 = new ListObject(20);

        ListObject list3 = list1.add(list2);
    }
}