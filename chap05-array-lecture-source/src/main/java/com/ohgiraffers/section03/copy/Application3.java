package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application3 {

  public static void main(String[] args) {

    /* comment. 깊은 복사에 대해 이해할 수 있다. */
    /* 깊은 복사란?
     * - heap 영역에 생성된 배열이 가지고 있는 실제 값을 또 다른 별도의 배열에 복사를 해 놓은 것이다.
     * - 같은 값을 가지고 있지만, 두 배열은 서로 독립적이며, 한 배열의 변경이 다른 배열에 영향을 주지 않는다.
     * */

    /* 깊은 복사를 하는 대표적인 방법 4가지
     * 1. for문을 이용한 인덱스별 값 복사 (가장 기본적이고 직관적 방법)
     * 2. Object 클래스의 clone() 메서드 이용 (배열 클래스가 제공하는 복제 기능)
     * 3. System 클래스의 arraycopy() 메서드 이용 (원본 배열의 일부 또는 전체를 복사 가능)
     * 4. Arrays 클래스의 copyOf() 메서드 이용 (새 배열 생성과 동시에 복사, 크기 조절 가능)
     * */

    int[] originArr = new int[]{1, 2, 3, 4, 5};

    // 원본 배열 출력 및 해시코드(주소 개념) 출력
    print(originArr);

    /* 1. for문을 이용한 동일 인덱스 값 복사 */
    int[] copyArr1 = new int[10];  // 원본보다 큰 크기의 배열 생성 (나머지 공간은 0으로 초기화)

    for (int i = 0; i < originArr.length; i++) {
      copyArr1[i] = originArr[i];  // 값 복사
    }

    // 복사 결과 출력 (원본 값은 앞부분에, 나머지는 0)
    print(copyArr1);

    /* 2. Object의 clone() 메서드 이용 */
    int[] copyArr2 = originArr.clone();
    // clone()은 원본 배열과 같은 길이, 같은 값으로 새 배열을 생성함.
    // 주소(해시코드)가 원본과 다르므로 별개의 배열임을 확인 가능
    print(copyArr2);

    /* 3. System.arraycopy() 메서드 이용 */
    int[] copyArr3 = new int[10];  // 원본보다 큰 배열 생성

    /* 파라미터 설명:
     * 원본 배열(originArr), 원본 배열의 복사를 시작할 인덱스(0),
     * 복사 대상 배열(copyArr3), 대상 배열 복사 시작 인덱스(3),
     * 복사할 길이(originArr.length)
     */
    System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);
    // 복사된 값들은 copyArr3의 인덱스 3부터 시작해 저장되고, 그 이전 인덱스는 0으로 초기화됨.
    print(copyArr3); // 복사한 만큼의 값은 같지만, 길이도 다르고 주소도 다르다.

    /* 4. Arrays.copyOf() 메서드 이용 */
    // originArr을 복사하면서 크기를 7로 지정 (원본보다 길거나 짧을 수 있음)
    int[] copyArr4 = Arrays.copyOf(originArr, 7);
    // 복사 후 길이는 7, 뒤의 2칸은 기본값 0으로 초기화됨
    print(copyArr4); // 복사한 만큼의 값은 같지만, 길이도 다르고 주소도 다르다.
  }

  // 배열의 해시코드(주소 개념)와 요소 값을 출력하는 메서드
  public static void print(int[] iarr) {

    System.out.println("iarr의 hashcode : " + iarr.hashCode());

    for (int i = 0; i < iarr.length; i++) {
      System.out.print(iarr[i] + " ");
    }
    System.out.println();
  }
}
