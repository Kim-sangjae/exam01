package org.koreait.models.board.member;

public class Ex01 {
    public static void main(String[] args) {

        Member member = Member.builder()
                .userNo(1L)
                .userId("user01")
                .userPw("123465")
                .userNm("사용자91")
                .build();

        System.out.println(member);

        Member2 member2 = Member2.builder()
                .userNo(2L)
                .userId("user02")
                .userPw("12315")
                .userNm("이름1111")
                .build();

        System.out.println(member2);




    }
}
