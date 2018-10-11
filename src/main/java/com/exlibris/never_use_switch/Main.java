package com.exlibris.never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MailSender mailSender = new MailSenderImpl();
        while (true) {
            try {
                mailSender.sendMail();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            Thread.sleep(1000);
        }
    }
}
