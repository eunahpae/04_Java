package com.ohgiraffers.section04.sort;

public class Application1 {

  public static void main(String[] args) {

    /* comment. 변수의 두 값을 변경하는 방법에 대해 이해할 수 있다. */
    // 두 개의 정수 변수 선언 및 초기화
    int num1 = 10;
    int num2 = 20;

    // 교환 전 값 출력
    System.out.println("변경 전 - num1 = " + num1);
    System.out.println("변경 전 - num2 = " + num2);

    // 변수 값 교환 (임시 변수 temp를 활용)
    int temp;
    temp = num1;
    num1 = num2;
    num2 = temp;

    // 교환 후 값 출력
    System.out.println("변경 후 - num1 = " + num1);
    System.out.println("변경 후 - num2 = " + num2);

    /* 배열 요소 간 값 교환 예시 */
    int[] arr = {2, 1, 3};

    // 배열의 0번 인덱스와 1번 인덱스의 값을 교환
    int temp2;
    temp2 = arr[0];
    arr[0] = arr[1];
    arr[1] = temp2;

    // 교환 후 배열 값 출력
    System.out.print("배열 교환 후 값 : ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    /* comment.
     *  값 교환은 정렬 알고리즘에서 가장 기본적으로 사용되는 개념이다.
     *  위의 예제처럼 임시 변수를 활용하여 값 위치를 바꿔주는 방식이 필수적으로 사용된다.
     */
  }
}
