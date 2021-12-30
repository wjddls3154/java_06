package compare;

public class EqualDemo {
    public static void main(String[] args) {

        System.out.println(1 == 2); // 값 : False, 1과 2는 다르기 때문
        System.out.println(1 == 1); // 값 : True, 1과 1은 같기 때문
        System.out.println("one"=="two"); // 값 : false
        System.out.println("one"=="one"); // 값 : true

        /**
         * 숫자에도, 문자에도 비교연산자 적용 가능
         * 그리고, 비교연산자 1==2 붙여쓰든 1 == 2 띄어쓰든 상관없음.
         * 이후에, 값이 false 나오는지 true 에 나오는지에 따라, 조건문으로 다르게 동작시키기도 가능.
         * 또한, 1=2 는 말이 안됨. 1==2 는 비교연산자임. 둘은 완전히 다른거라 구분 중요.
         */

    }
}
