package me.shinsunyoung.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class TestService { //비즈니스 계층

    @Autowired
    MemberRepository memberRepository; //MemberRepository 빈 주입

    public List<Member> getAllMembers() {
        return memberRepository.findAll(); //멤버 목록 얻기
    }
}
