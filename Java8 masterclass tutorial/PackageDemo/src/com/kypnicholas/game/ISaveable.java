package com.kypnicholas.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nkypr on 11/07/2017.
 */
public interface ISaveable {

    List<String> write();                      //Signature of write() class that returns an ArrayList of strings
    void read(List<String> savedValues);       //signature of read() class that doesn't return anything but takes as input an A.L. of savedValues
}
