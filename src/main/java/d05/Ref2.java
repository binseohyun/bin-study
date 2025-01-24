package d05;

public class Ref2 {
    public static void main(String[] args) {
        //Primitive Type: 기본형/원시 타입
        byte a1 = 3;
        char a2 = 'a';
        short a3 = 10;
        int a4 = 20;
        long a5 = 500L;
        float a6 = 3.14f;
        double a7 = 3.141592;
        boolean a8 = true;

        // Wrapper Type: 래퍼 타입(Reference + 참조 타입의 일종)
        Byte b1 = 3;
        Character b2 = 'a';
        Short b3 = 10;
        Integer b4 = 20;
        Long b5 = 500L;
        Float b6 = 3.14f;
        Double b7 = 3.141592;
        Boolean b8 = true;

        String name = null;
//        name = "빈서현";
        System.out.println(name.length());
    }
}
