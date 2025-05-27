package com.ohgiraffers.section03.copy;

public class Application2 {

  public static void main(String[] args) {

    /* comment. 얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다. */

    /* 얕은 복사의 활용
     * - 메소드 호출 시 배열을 인자로 전달할 때 사용
     * - 동일한 배열을 반환(return)하고자 할 때 사용
     * → 모두 배열의 주소값(참조값)을 전달하므로 메모리를 절약할 수 있고, 원본 배열의 변경도 가능하다.
     */

    // 이름 목록을 저장한 배열 생성
    String[] names = {"홍길동", "유관순", "이순신"};

    // 현재 배열의 주소값(hashcode) 출력
    System.out.println("names의 hashcode : " + names.hashCode());

    /* 1. 배열을 메서드 인자로 전달 (얕은 복사) */
    /* - 메서드 내부에서 동일한 배열 객체를 사용하고 싶은 경우 얕은 복사를 이용한다. */
    print(names);

    /* 2. 메서드에서 동일한 배열을 리턴받기 (얕은 복사) */
    /* - 메서드 내부에서 생성한 배열의 주소값을 리턴받아 외부에서도 동일 배열 사용 가능 */
    String[] animals = getAnimals();

    System.out.println("리턴 받은 animals hashcode : " + animals.hashCode());

    print(animals);
  }

  // 전달받은 배열의 내용을 출력하는 메서드
  public static void print(String[] sarr) {

    // 전달받은 배열의 주소값 출력
    System.out.println("sarr의 hashcode : " + sarr.hashCode());

    // 배열 요소 출력
    System.out.print("배열 요소 출력 : ");
    for (int i = 0; i < sarr.length; i++) {
      System.out.print(sarr[i] + " ");
    }
    System.out.println();  // 줄바꿈
  }

  // 문자열 배열을 생성하여 리턴하는 메서드
  public static String[] getAnimals() {

    // 동물 이름이 담긴 배열 생성
    String[] animals = new String[]{"낙타", "호랑이", "나무늘보"};

    // 생성된 배열의 주소값 출력
    System.out.println("새로 만든 animals의 hashcode : " + animals.hashCode());

    // 배열 주소값(참조값) 리턴 (얕은 복사)
    return animals;
  }
}
