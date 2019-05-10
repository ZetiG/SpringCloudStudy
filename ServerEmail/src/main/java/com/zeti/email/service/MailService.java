package com.zeti.email.service;

public interface MailService {
    /**
     * 发送纯文本邮件
     *
     * @param to
     * @param subject
     * @param content
     */
    void sendSimpleMail(String to, String subject, String content);

    /**
     * 发送HTML邮件
     *
     * @param to
     * @param subject
     * @param content
     */
    void sendHtmlMail(String to, String subject, String content);

    /**
     * 发送带附件邮件
     *
     * @param to
     * @param subject
     * @param content
     */
    void sendAttachmentMail(String to, String subject, String content, String filePath);

    /**
     * 发送带静态资源邮件
     *
     * @param to
     * @param subject
     * @param content
     */
    void sendResourceMail(String to, String subject, String content, String rscPath, String rscId);



}
