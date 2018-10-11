package com.exlibris.never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class MailSender {
    private MailDao dao = new MailDaoImpl();

    public void sendMail() {
        MailInfo mailInfo = dao.getMailInfo();
        int mailCode = mailInfo.getMailCode();
        if (mailCode == 1) {
            //50 lines of code to generate Welcome mail
            System.out.println("Welcome new "+mailInfo.getClientName());
        } else if (mailCode == 2) {
            //60 lines of code (different logic to build email call back mail
            System.out.println("Don't call us we call you");
        }
    }
}
