package com.ohgiraffers.section05.parameter;

public class Application {

    public static void main(String[] args) {

        /* comment. 메소드의 파라미터에 대해 이해하고 사용할 수 있다.*/

        /*  메소드에 전달할 수 있는 값(인자)은 호출 시에 지정하며, 메소드는 이를 매개변수(parameter)로 받아 처리한다.
         *  자바에서 메소드의 매개변수로 사용할 수 있는 자료형은 다음과 같다.
         *
         *  [1] 기본 자료형 (Primitive Type)
         *  [2] 기본 자료형 배열
         *  [3] 클래스 자료형 (참조형)
         *  [4] 클래스 자료형 배열
         *  [5] 가변인자 (Variable Arguments)
         */

        ParameterTest pt = new ParameterTest();

        /* 1. 기본자료형을 매개변수로 전달 받는 메소드 호출 확인
         * - 기본자료형은 값이 복사되어 전달되므로, 메소드 내에서 값을 변경해도 원본에는 영향이 없다.
         */
        int num = 20;
        pt.testPrimaryTypeParameter(num);

        /* 2. 기본자료형 배열을 매개변수로 전달 받는 메소드 호출 확인
         * - 배열은 참조자료형이기 때문에 메소드 내에서 배열의 값을 변경하면 원본 배열에도 반영된다.
         */
        int[] iarr = new int[]{1, 2, 3, 4, 5};

        System.out.println("인자로 전달하는 값 : " + iarr);
        pt.testPrimaryTypeArrayParameter(iarr);

        System.out.print("변경 후 원본 배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        /* 3. 클래스 자료형
         * - 클래스 자료형 역시 참조자료형이므로, 메소드 내에서 객체의 필드를 변경하면 원본 객체에도 영향을 준다.
         */
        RectAngle r1 = new RectAngle(12.5, 22.5);

        System.out.println("인자로 전달하는 값 : " + r1);
        pt.testClassTypeParameter(r1);

        System.out.println("변경 후 사각형의 넓이와 둘레 ========== ");
        r1.calcArea();
        r1.calcRound();

        /* 5. 가변인자 (Variable Arguments)
         * - 전달하는 인자의 개수가 유동적인 경우 사용하는 문법이다.
         * - 형식: 메소드 정의 시 '자료형... 변수명' 형태로 작성한다. 예) test(String... hobbies)
         * - 내부적으로는 전달된 값들이 배열로 처리된다.
         * - 가변인자는 메소드 매개변수 목록에서 **마지막에만** 위치할 수 있다.
         *   (하나의 메소드에 두 개 이상의 가변인자를 선언할 수 없다.)
         *
         * - 가변인자 방식의 장점:
         *   1) 같은 타입의 인자를 여러 개 받을 수 있어 메소드 오버로딩을 줄일 수 있다.
         *   2) 호출 시 인자의 개수를 자유롭게 전달할 수 있다.
         *
         * - 주의할 점:
         *   가변인자는 배열로 처리되기 때문에, 메소드 내에서는 배열처럼 다뤄야 한다.
         *   또한, null 또는 아무 값도 전달하지 않으면 빈 배열로 인식된다.
         */
        // pt.testVariableLengthArrayParameter();  // 매개변수 없이 호출하는 경우는 정의에 따라 다르므로 주석 처리
        pt.testVariableLengthArrayParameter("홍길동"); // 가변인자는 전달하지 않아도 됨
        pt.testVariableLengthArrayParameter("유관순", "볼링");
        pt.testVariableLengthArrayParameter("이순신", "볼링", "테니스", "당구");
        pt.testVariableLengthArrayParameter("신사임당", new String[]{"테니스", "서예", "떡썰기"});
    }
}
