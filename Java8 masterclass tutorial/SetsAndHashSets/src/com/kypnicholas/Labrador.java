package com.kypnicholas;

/**
 * Created by nkypr on 08/08/2017.
 */
public class Labrador extends Dog {

    public Labrador(String name) {
        super(name);
    }
    /*
    //IF WE UN-COMMENT THIS AND MAKE THE equals() in Dog() non-Final, WE WILL GET DIFFERENT RESULTS WHEN TRYING TO COMPARE TWO OBJECTS IN main()
    i.e. compare rover to rover2 and vice-versa
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj instanceof Labrador) {
            String objName = ((Labrador) obj).getName();
            return this.getName().equals(objName);
        }
        return false;
    }
    */
}
