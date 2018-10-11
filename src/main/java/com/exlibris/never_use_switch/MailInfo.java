package com.exlibris.never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class MailInfo {
    private String clientName;
    private int mailCode;

    public MailInfo(String clientName, int mailCode) {
        this.clientName = clientName;
        this.mailCode = mailCode;
    }

    public String getClientName() {
        return clientName;
    }

    public int getMailCode() {
        return mailCode;
    }
}
