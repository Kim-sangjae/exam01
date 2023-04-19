package org.koreait.models.board.member;

public class Member { // 빌더패턴 구조

    private Long userNo;
    private String userId;
    private String userPw;
    private String userNm;


    private Member(){} // 생성자private 다른곳에서 쓸수없게한다

    @Override
    public String toString() {
        return "Member{" +
                "userNo=" + userNo +
                ", userId='" + userId + '\'' +
                ", userPw='" + userPw + '\'' +
                ", userNm='" + userNm + '\'' +
                '}';
    }


    public static Builder builder(){
        return new Builder();
    }




    protected static class Builder{ // 내부클래스여서 Member 사용 가능 // 메서드를 통해 값을 정할수있게 만든다
        private Member member = new Member();

        public Builder userNo(Long userNo){
            member.userNo = userNo;

            return  this;
        }
        public Builder userId(String userId){
            member.userId = userId;
            return this;
        }
        public Builder userPw(String userPw){
            member.userPw = userPw;
            return this;
        }
        public Builder userNm(String userNm){
            member.userNm = userNm;
            return this;
        }

        public Member build() {
            return member;
        }

    }// Builder




}
