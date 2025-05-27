package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {

  public static void main(String[] args) {

    /* comment. 배열을 사용하는 예시 (1)
     *  5명의 자바 점수를 입력받아 총점과 평균을 계산하는 프로그램
     *  배열을 사용함으로써 반복문을 통한 입력 및 계산이 가능해짐
     */

    // 크기가 5인 정수형 배열 선언 → 각 요소에 학생 점수를 저장
    int[] scores = new int[5];

    Scanner sc = new Scanner(System.in);

    // 사용자로부터 각 학생의 점수를 입력받아 배열에 저장
    for (int i = 0; i < scores.length; i++) {
      System.out.print((i + 1) + "번째 학생의 자바 점수를 입력해 주세요 : ");
      scores[i] = sc.nextInt();
    }

    // 합계와 평균 계산용 변수 선언 (초기값 설정)
    double sum = 0.0;
    double avg = 0.0;

    // 배열을 순회하며 점수 합산
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }

    // 평균 계산 (정수 배열이지만 평균은 실수로 출력하기 위해 double 사용)
    avg = sum / scores.length;

    // 결과 출력
    System.out.println("합계(sum) = " + sum);
    System.out.println("평균(avg) = " + avg);
  }
}