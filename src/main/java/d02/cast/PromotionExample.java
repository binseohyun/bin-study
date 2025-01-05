package d02.cast;

public class PromotionExample {
    public static void main(String[] args) {
        // 자동 타입 변환
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue =" + intValue); //10

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 Unicode: " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue = " + longValue); //50

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue = " + floatValue); //100

        floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println("doubleValue = " + doubleValue); //100.5
    }
}
