package com.ohgiraffers.section01.array;

public class Application5 {

  public static void main(String[] args) {

    /* comment. 배열을 사용하는 예시 (2)
     *  카드 한 장을 무작위로 뽑는 시뮬레이션
     *  배열을 사용하여 카드의 모양(shapes)과 숫자(cardNumbers)를 저장하고,
     *  Math.random()을 이용해 랜덤하게 한 장을 출력하는 프로그램
     */

    // 카드 모양을 저장한 문자열 배열
    String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};

    // 카드 숫자(2~10, J, Q, K, A)를 저장한 문자열 배열
    String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING",
        "ACE"};

    // 카드 모양 배열에서 랜덤 인덱스 추출 (0 이상 shapes.length 미만)
    int randomShapeIndex = (int) (Math.random() * shapes.length);

    // 카드 숫자 배열에서 랜덤 인덱스 추출
    int randomCardNumberIndex = (int) (Math.random() * cardNumbers.length);

    // 무작위로 선택된 카드 출력
    System.out.println(
        "당신이 뽑은 카드는 " + shapes[randomShapeIndex] + " " + cardNumbers[randomCardNumberIndex]
            + " 카드 입니다.");
  }
}
