package compare;

public class EqualStringDemo {
    public static void main(String[] args) {

        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b); // 실제론 true 가 되어야하는데 false 가 나옴.
        System.out.println(a.equals(b)); // 이건 true

        /**
         * 문자 데이터 형식 변수 a에 문자열을 담음.
         * .equals 를 이용해, 문자열끼리 문자열을 비교한다. 알고 있기 !
         */


    }
}
