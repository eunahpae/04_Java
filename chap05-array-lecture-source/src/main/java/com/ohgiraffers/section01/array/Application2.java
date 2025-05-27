package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application2 {

  public static void main(String[] args) {

    /* comment. 배열의 사용 방법을 익혀 배열을 사용할 수 있다. */
    /* 배열 사용 방법 3단계
     *  1. 배열의 선언
     *  2. 배열의 할당
     *  3. 배열 요소(인덱스)에 값 대입 및 활용
     */

    /* --------------------------
     * 1. 배열의 선언
     * --------------------------
     * 자료형[] 변수명;
     * 자료형 변수명[]; 로 선언할 수 있다.
     * 배열을 선언한다는 것은 stack 메모리에 참조형 변수(레퍼런스 변수)를 생성하는 것이다.
     * 이 변수는 실제 배열이 저장될 heap 메모리의 주소를 저장하게 된다.
     */

    int[] iarr;
    char carr[];    // C 스타일 표기법

    /* --------------------------
     * 2. 배열의 할당
     * --------------------------
     * new 연산자를 사용하여 heap 메모리에 배열을 생성한다.
     * 생성된 배열의 시작 주소가 반환되어 변수에 저장된다.
     * 자바에서 배열은 참조자료형(Reference Type)이다.
     */

    // 배열을 할당할 때는 반드시 크기를 지정해야 한다.
//    iarr = new int[]; 크기를 지정하지 않으면 에러 발생
    iarr = new int[5];
    carr = new char[10];

    /* 선언과 동시에 할당도 가능 */
    int[] iarr2 = new int[5];
    char carr2[] = new char[10];

    /* --------------------------
     * 배열의 참조 확인
     * --------------------------
     * heap에 생성된 배열은 이름으로 직접 접근할 수 없고,
     * stack에 있는 참조변수를 통해 저장된 주소로 heap에 할당된 배열로 간접적으로 접근한다.
     * 참조변수를 출력하면 내부적으로 toString() → 클래스명@해시코드(16진수 주소값) 가 출력된다.
     */
    System.out.println("iarr2 = " + iarr2);
    System.out.println("carr2 = " + carr2);

    /* hashCode(): 객체의 고유한 식별값(주소 기반 해시값, 10진수)을 반환한다.
     * 동일객체인지 비교할 때 사용할 목적으로 쓰여진다.
     * */
    System.out.println(iarr2.hashCode());
    System.out.println(carr2.hashCode());

    /* length: 배열의 길이(크기)를 반환하는 속성 */
    System.out.println(iarr2.length);  // 결과: 5
    System.out.println(carr2.length);  // 결과: 10

    /* --------------------------
     * 동적 배열 할당 (사용자 입력에 따라 배열 크기 지정)
     * -------------------------- */
    Scanner sc = new Scanner(System.in);
    System.out.print("새로 할당할 배열의 길이를 입력하세요 : ");
    int size = sc.nextInt(); // 사용자가 원하는 배열 크기 입력

    double[] darr = new double[size]; // 입력된 크기만큼 double형 배열 생성

    System.out.println(darr.hashCode());  // 할당된 배열의 해시코드 출력
    System.out.println(darr.length);      // 길이 출력

    /* 배열 재할당: 기존 배열을 버리고 새로운 배열을 생성 → darr는 새 배열을 참조함 */
    darr = new double[30];

    System.out.println(darr.hashCode());  // 해시코드가 변경됨 (새로운 배열이기 때문)
    System.out.println(darr.length);      // 결과: 30

    /* --------------------------
     * 배열 참조 해제 (null 할당)
     * -------------------------- */
    darr = null;  // darr가 어떤 배열도 참조하지 않도록 설정

    /* 아래 코드 실행 시 예외 발생
     * NullPointerException: 참조변수가 null인 상태에서 참조 연산자(.)를 사용하려 하면 발생
     */
//        System.out.println(darr.length);
  }
}

