package hello.core.xml;

import hello.core.member.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class XmlAppContextTest {

    @Test
    @DisplayName("XML appConfig로 MemberService를 가져올 수 있다.")
    void xmlAppContext() {
        GenericXmlApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");

        MemberService memberService = ac.getBean("memberService", MemberService.class);

        assertThat(memberService).isInstanceOf(MemberService.class);

    }
}
