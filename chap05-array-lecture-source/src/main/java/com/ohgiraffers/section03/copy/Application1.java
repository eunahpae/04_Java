package com.ohgiraffers.section03.copy;

public class Application1 {

  public static void main(String[] args) {

    /* comment. 배열의 복사 개념 중 "얕은 복사"에 대해 이해할 수 있다. */

    /* 배열 복사의 종류
     *  1. 얕은 복사 (Shallow Copy) : stack에 저장된 참조값(주소값)만 복사
     *     → 두 참조변수가 동일한 heap 메모리의 배열을 공유
     *  2. 깊은 복사 (Deep Copy) : heap 메모리에 새로운 배열을 만들고 실제 데이터를 복사
     */

    /* 얕은 복사의 특징
     * - 복사된 두 배열 변수는 같은 배열을 참조한다.
     * - 한 쪽에서 배열 값을 변경하면, 다른 쪽에서도 동일하게 반영된다.
     * - 주소값 자체를 복사했기 때문에 메모리 공간을 추가로 사용하지 않는다.
     */

    // 원본 배열 생성 및 초기화 (heap에 배열 생성, stack에는 주소 저장)
    int[] originArr = {1, 2, 3, 4, 5};

    // 얕은 복사 수행 → 주소값만 복사됨
    int[] copyArr = originArr;

    // 두 배열의 hashCode 출력 → 동일한 주소값을 가지고 있음을 확인
    System.out.println("originArr hashCode : " + originArr.hashCode());
    System.out.println("copyArr hashCode   : " + copyArr.hashCode());

    // 원본 배열 값 출력
    System.out.print("originArr values   : ");
    for (int i = 0; i < originArr.length; i++) {
      System.out.print(originArr[i] + " ");
    }
    System.out.println();

    // 복사된 배열 값 출력
    System.out.print("copyArr values     : ");
    for (int i = 0; i < copyArr.length; i++) {
      System.out.print(copyArr[i] + " ");
    }
    System.out.println();

    // 복사된 배열의 첫 번째 요소 변경
    copyArr[0] = 99;

    /* 하나의 참조로 값을 변경했지만, 두 배열 모두 같은 메모리를 참조하므로
     * 원본 배열의 값도 변경된 것을 확인할 수 있다.
     */

    // 변경 후 원본 배열 값 출력
    System.out.print("originArr after modification : ");
    for (int i = 0; i < originArr.length; i++) {
      System.out.print(originArr[i] + " ");
    }
    System.out.println();

    // 변경 후 복사된 배열 값 출력
    System.out.print("copyArr after modification   : ");
    for (int i = 0; i < copyArr.length; i++) {
      System.out.print(copyArr[i] + " ");
    }
    System.out.println();
  }
}
