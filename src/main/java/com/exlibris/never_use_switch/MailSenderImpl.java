package com.exlibris.never_use_switch;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class MailSenderImpl implements MailSender {
    private MailDao dao = new MailDaoImpl();


    @Override
    @SneakyThrows
    public void sendMail() {
        MailInfo mailInfo = dao.getMailInfo();
        int mailCode = mailInfo.getMailCode();
        String body = null;
        body = MailType.findByCode(mailCode).getMailGenerator().generateBody(mailInfo);
        send(body);
    }

    private void send(String body) {
        System.out.println("sending...");
        System.out.println("body = " + body);
    }
}
