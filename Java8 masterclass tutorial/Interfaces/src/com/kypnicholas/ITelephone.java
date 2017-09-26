package com.kypnicholas;

/**
 * Created by nkypr on 10/07/2017.
 */
public interface ITelephone {

    void powerOn();                     //Signatures of classes (name and parameters)
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
