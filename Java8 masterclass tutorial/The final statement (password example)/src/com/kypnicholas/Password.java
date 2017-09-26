package com.kypnicholas;

/**
 * Created by nkypr on 03/08/2017.
 */
public class Password {
    private static final int key = 748576362;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ key;                                                    //Simplest form of encryption (DO NOT USE!!)
    }

    public final void storePassword() {                                            //we need this to be FINAL so we cannot overwrite this function and compromise security!
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if(encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }

}
