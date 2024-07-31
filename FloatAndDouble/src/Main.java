public class Main {
    public static void main (String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatvalue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatvalue);
        
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoublevalue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoublevalue);

        int myIntValue = 5;
        float myFloatValue = 5.256f; //declaring a float point variable without putting f by the end of the value will result in a error
        //because just like int, double is the default data type in Java. So if u type a float point number just like 5.256 (without an f),
        // java will expect it to be a double data type and not a float data type;
        double myDoubleValue = 5.36d;

        float myFloatValueTwo = (float) myDoubleValue;
        System.out.println(myFloatValueTwo);

        // Double type value are more precise than float type value but they occupy more space on the memory;

        int divOne = 5 / 3;
        float divTwo = 5f / 3f;
        double divThree = 5d / 3d; // double type is the default type for float point values, in this case d at the end ins not necessary but it's a
        //good practice;

        System.out.println(divOne); //int type
        System.out.println(divTwo); //float type
        System.out.println(divThree); //double type

        double pounds = 200d;
        double kilos = pounds*0.45359237d;
        System.out.println(kilos);

        //it's also possible to declare double type values as follows:
        double thisIsOnlyANotationTest = 3_000_000.369_450;
        System.out.println(thisIsOnlyANotationTest);

        }
}

