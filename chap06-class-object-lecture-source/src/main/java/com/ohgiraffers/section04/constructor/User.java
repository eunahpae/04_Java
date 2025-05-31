package com.ohgiraffers.section04.constructor;

public class User {

    // === 필드 선언부 ===
    private String id;                      // 사용자 아이디
    private String pwd;                     // 비밀번호
    private String name;                    // 사용자 이름
    private java.util.Date enrollDate;      // 가입일 (필드로 다른 클래스 자료형 사용 예시)

    // === 생성자 선언부 ===
    /* 생성자(Constructor)
     * - 클래스 이름과 동일한 이름을 가진 특수한 메소드 (대/소문자까지 같아야 함)
     * - 인스턴스가 생성될 때 자동으로 호출되며, 주로 필드 초기화에 사용됨
     * - 반환형을 작성하지 않음 (작성하면 일반 메소드로 인식됨)
     *
     * 생성자 작성 위치:
     * - 문법상 클래스 내부 어디든 작성 가능하지만, 관례적으로 필드와 메소드 선언부 사이에 위치함
     *
     * 생성자의 주요 목적:
     * 1. 인스턴스 생성 시 필드를 초기화하기 위한 명령 수행
     * 2. 초기값 전달을 강제하여 객체 생성을 통제
     * 3. 초기화 종류별로 다양한 생성자 오버로딩 가능
     *
     * 생성자 작성 방법
     *  [표현식]
     *  접근제한자 클래스명(매개변수) {
     *       인스턴스 생성 시점에 수행할 명령 기술(주로 필드를 초기화)
     *       this.필드명 = 매개변수;        // 설정자(setter) 여러 개의 기능을 한 번의 호출로 수행할 수 있다.
     *  }
     * */


    // 1. 기본 생성자(Default Constructor)
    // - 매개변수가 없으며, 필드 초기화는 하지 않음
    public User() {

        /* 수행할 내용이 아무 것도 존재하지 않는다. */
        System.out.println("User 클래스의 기본 생성자 호출함...");
    }

    // 동일한 이름의 생성자 혹은 메소드를 한 클래스 안에서 작성하는 것은 불가능하다.
//    public User() {}

    // 2. 매개변수 있는 생성자(Constructor with parameters)
    // 초기화할 필드가 여러개 인 경우, 초기화 하고 싶은 필드의 갯수별로 생성자를 여러 개 준비해둘 수 있다.
    // - id, pwd, name 필드를 초기화
    public User(String id, String pwd, String name) {

        /* 매개변수 있는 생성자의 주 목적은 인스턴스 생성 시점에 매개변수로 전달 받은 값을 이용해서 필드를 초기화한다. */
        this.id = id;
        this.pwd = pwd;
        this.name = name;

        System.out.println("User 클래스의 id, pwd, name을 초기화하는 생성자 호출함...");
    }

    // 3. 모든 필드를 초기화하는 생성자
    // - this()를 통해 기존 생성자 호출로 중복 제거
    public User(String id, String pwd, String name, java.util.Date enrollDate) {

        // 매개변수로 전달 받은 값을 이용해 모든 필드를 초기화한다.
        // 3-1. 각 필드에 접근하여 초기화
//        this.id = id;
//        this.pwd = pwd;
//        this.name = name;
//        this.enrollDate = enrollDate;

        // 3-2. 사전에 작성되어 있는 다른 생성자 함수를 이용하여 초기화
        // this()는 반드시 생성자의 첫 줄에 호출해야 함
        this(id, pwd, name);                // 기존 생성자 재사용하여 매개변수로 받은 값을 전달
        this.enrollDate = enrollDate;

        System.out.println("User 클래스의 모든 필드를 초기화하는 생성자 호출함...");
    }

    // === 메소드 선언부 ===
    /**
     * 객체의 필드 정보를 문자열로 반환하는 메소드
     *
     * @return 객체 정보를 형식화된 문자열로 반환
     */
    public String getInformation() {

        return "User [" +
            "id=" + this.id + ", " +
            "pwd=" + this.pwd + ", " +
            "name=" + this.name + ", " +
            "enrollDate=" + this.enrollDate + "]";
    }
}
