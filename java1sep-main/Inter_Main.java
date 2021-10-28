/*===========================
Simple interfaceDemo
============================*/

interface RBI {
    static float rate = 0; //interacewill be  treated by default as public static final

    float calculateRateofInterest(float rate); //by default for this method public  and abstract  keyword will assign

    void floatingrate();
}

//implementing  the interface in class using a keyword of implements
class SBI implements RBI {
    public void floatingrate() {
        rate = 3.5f;
    }

    public float calculateRateofInterest(float rate) {
        return rate;
    }
}

class Inter_Main {
    public static void main(String[] ar) {
        SBI sobj = new SBI();
        System.out.println("SBI is announced the interest rate =" + sobj.calculateRateofInterest(2.5f));
    }
}
