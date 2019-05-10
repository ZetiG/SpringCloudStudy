package com.zeti.email;

import com.zeti.email.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailApplicationTests {

    @Autowired
    private MailService mailService;

    @Autowired
    private TemplateEngine templateEngine;

    /**
     * 纯文本邮件
     */
    @Test
    public void sendTextMail() {
        mailService.sendSimpleMail("1832469634@qq.com", "Test Email Server", "hello email !");
    }

    /**
     * HTML邮件
     */
    @Test
    public void sendHtmlMail() {
        String content="<html>\n" +
                "<body>\n" +
                "    <h3>hello world ! 这是一封Html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendHtmlMail("1832469634@qq.com", "Test Email Server", content);
    }

    /**
     * 附件邮件
     */
    @Test
    public void sendAttachmentsMail() {
        String filePath="/Users/zhangmengke/develop/api-doc.md";
        mailService.sendAttachmentMail("1832469634@qq.com", "主题：带附件的邮件", "有附件，请查收！", filePath);
    }

    /**
     * 资源邮件
     */
    @Test
    public void sendResourceMail() {
        String rscId = "neo006";
        String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
        String filePath="/Users/zhangmengke/develop/api-doc.md";
        mailService.sendResourceMail("1832469634@qq.com", "主题：带资源文件的邮件", content, filePath, rscId);
    }

    /**
     * 模板邮件
     */
    @Test
    public void sendTemplateMail() {
        //创建邮件正文
        Context context = new Context();
        context.setVariable("id", "006");
        String emailContent = templateEngine.process("emailTemplate", context);

        mailService.sendHtmlMail("1832469634@qq.com","主题：这是模板邮件",emailContent);
    }
}
