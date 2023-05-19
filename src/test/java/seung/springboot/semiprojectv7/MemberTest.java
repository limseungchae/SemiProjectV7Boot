package seung.springboot.semiprojectv7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import seung.springboot.semiprojectv7.model.Member;
import seung.springboot.semiprojectv7.repository.MemmberRepository;

import java.util.List;

@SpringBootTest
public class MemberTest {

    @Autowired
    MemmberRepository memberRepository;

    @Test
    @DisplayName("전체 멤버 조회")
    public void findAllMember() {
        List<Member> mbs = memberRepository.findAll();

        System.out.println(mbs);
    }

    @Test
    @DisplayName("member save")
    public void saveMember() {
        Member m = new Member(null, "abc123", "123456",
                "1234567", "abc123", "987xyz", "123-456",
                "서울시 구로구 구로동", "더좋은 IT 아카데미",
                "abc123@987xyz.co.kr", "123-1234-5678", null);

        memberRepository.save(m);
    }

    @Test
    @DisplayName("member update")
    public void updateMember() {
        Member m = new Member(2L, "987xyz", "123456",
                "1234567", "987xyz", "abc123", "456-123",
                "서울시 구로구 구로동", "더좋은 IT 아카데미",
                "987xyz@abc123.co.kr", "123-4567-6789", null);

        memberRepository.save(m);
    }

    @Test
    @DisplayName("member delete")
    public void deleteMember() {
        Member m = new Member();
        m.setMbno(2L);

        memberRepository.delete(m);
    }
}
