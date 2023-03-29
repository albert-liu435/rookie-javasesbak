package com.rookie.bigdata;

import static org.junit.Assert.assertTrue;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private static final JsonFactory jsonFactory = new JsonFactory();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() throws Exception{

        TaobaoResponse taobaoResponse=new TaobaoResponse();
        taobaoResponse.setBindCode("SUC");
        Member member=new Member();
        member.setLevel(0);
        member.setPoint(0);
        member.setNick("ds");
        member.setMobile("15030068587");
        taobaoResponse.setMember(member);

        ObjectMapper mapper = new ObjectMapper(jsonFactory);
        mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);

        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        String s = mapper.writeValueAsString(taobaoResponse);
        System.out.println(s);
        // assertTrue(true);
    }
}
