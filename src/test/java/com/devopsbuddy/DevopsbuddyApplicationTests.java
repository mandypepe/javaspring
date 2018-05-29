package com.devopsbuddy;

import com.devopsbuddy.web.i18n.I18NService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sound.midi.VoiceStatus;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopsbuddyApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Autowired
    public I18NService i18NService;
    @Test
    public void testMessageByLocaleService() throws Exception{
        String expectdResult="Index web";
        String messageId="index.main.callout";
        String actual=i18NService.getMessage(messageId);
        Assert.assertEquals("the actual String don't match",expectdResult,actual);
    }
}
