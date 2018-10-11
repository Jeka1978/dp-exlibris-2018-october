package com.exlibris.never_use_switch;

/**
 * @author Evgeny Borisov
 */
//@MailCode(1)
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateBody(MailInfo mailInfo) {
        // 50 lines of code
        return "welcome " + mailInfo.getClientName();
    }
}
