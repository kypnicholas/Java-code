package com.kypnicholas;

/**
 * Created by nkypr on 16/07/2017.
 */
public interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);           //Start at the root of the list and print out the items

}
