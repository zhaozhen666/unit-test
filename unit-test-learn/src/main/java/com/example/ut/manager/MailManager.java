package com.example.ut.manager;

import cn.hutool.extra.template.Template;
import cn.hutool.extra.template.TemplateConfig;
import cn.hutool.extra.template.TemplateEngine;
import cn.hutool.extra.template.TemplateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: 发送邮件
 * @author: zhaozhen
 * @create: 2023/02/19 10:46
 */
@Slf4j
@Component
public class MailManager {

    @Resource
    private JavaMailSender mailSender;

    public void  sendEmail(){
        // 获取MimeMessage对象
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper messageHelper;
        try {
            messageHelper = new MimeMessageHelper(message, true, "utf-8");
            // 发件人
            messageHelper.setFrom("xxxx@qq.com");
            // 收件人
            messageHelper.setTo("xxxxx@qq.com");
            // 邮件主题
            message.setSubject("测试邮件发送功能");
            // 邮件内容
            messageHelper.setText(getNoticeHtmlByTemplate(1,"test.vtl"), true);

            messageHelper.addAttachment(MimeUtility.encodeWord("drools.pdf","utf-8","B"),new File("/Users/zhaozhen/Desktop/office/规则引擎drools讲义.pdf"));
            // 发件
            mailSender.send(message);
            // 更新发件状态

            log.info("发送理赔通知邮件任务已结束");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private String getNoticeHtmlByTemplate(int applyCnt,String temp) {

        // 创建数据模型
        Map<String, Object> map = new HashMap(16);
        map.put("name", "赵镇");
        // 写数据
        TemplateEngine engine = TemplateUtil.createEngine(new TemplateConfig("templates/", TemplateConfig.ResourceMode.CLASSPATH));
        Template template = engine.getTemplate(temp);
        return template.render(map);
    }
}
