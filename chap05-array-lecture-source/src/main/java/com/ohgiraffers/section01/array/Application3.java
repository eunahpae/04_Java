package com.ohgiraffers.section01.array;

public class Application3 {

  /* comment. 배열에 초기화되는 자료형별 기본값을 이해할 수 있다. */

  /* 자바에서는 배열이 생성되면, 요소(element)들이 자동으로 기본값으로 초기화된다.
   *
   * 자료형별 기본값
   *  - 정수형(byte, short, int, long): 0
   *  - 실수형(float, double): 0.0
   *  - 논리형(boolean): false
   *  - 문자형(char): '\u0000' (null 문자, 화면에 출력되지 않음)
   *  - 참조형(String, 배열 등): null
   */

  public static void main(String[] args) {

    // 크기 5짜리 int형 배열 선언 및 생성 → 모든 요소는 기본값 0으로 자동 초기화됨
    int[] iarr = new int[5];

    // 각 인덱스의 기본값 출력
    System.out.println(iarr[0]); // 출력: 0
    System.out.println(iarr[1]);
    System.out.println(iarr[2]);
    System.out.println(iarr[3]);
    System.out.println(iarr[4]);

    // 위 코드를 반복문으로 바꾸면 더 간결하게 확인 가능
    for (int i = 0; i < iarr.length; i++) {
      System.out.println(iarr[i]);
    }

    /* ------------------------------
     * 배열 초기화 방법 - 명시적 초기화
     * ------------------------------
     * 자바에서는 배열 생성 시 기본값이 아닌 값을 직접 초기화할 수도 있다.
     * 이때는 중괄호 {}를 사용하여 값을 나열한다.
     * */

    // 방법 1: 선언과 동시에 초기화 (new 키워드 생략 가능)
    int[] iarr2 = {11, 22, 33, 44, 55};  // 컴파일러가 크기 5로 자동 설정

    // 방법 2: new 키워드를 이용한 명시적 초기화
    int[] iarr3 = new int[]{11, 22, 33, 44, 55};  // 위와 동일하지만 문법적으로 new 사용

    System.out.println("iarr2 length = " + iarr2.length);  // 출력: 5
    System.out.println("iarr3 length = " + iarr3.length);

    // 배열 요소 출력 (초기화 확인)
    for (int i = 0; i < iarr2.length; i++) {
      System.out.println("iarr2[" + i + "] = " + iarr2[i]);
    }

    /* ------------------------------
     * 참조형 배열 초기화
     * ------------------------------
     * 문자열(String)도 참조형이므로 배열에 저장할 수 있다.
     * 문자열 리터럴을 중괄호 안에 나열하여 선언과 동시에 초기화 가능하다.
     */
    String[] sarr = {"apple", "banana", "grape", "orange"};

    // 참조형 배열 출력
    for (int i = 0; i < sarr.length; i++) {
      System.out.println("sarr[" + i + "] = " + sarr[i]);
    }
  }
}