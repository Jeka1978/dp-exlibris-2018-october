package com.exlibris.never_use_switch;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public enum MailType {
    WELCOME(1, new WelcomeMailGenerator()),
    EMAIL_CALLBACK(2, new EmailCallbackMailGenerator());

    private final int dbCode;
    private final MailGenerator mailGenerator;

    MailType(int dbCode, MailGenerator mailGenerator) {
       System.out.println("MailType was create. dbCode = " + dbCode);
        this.dbCode = dbCode;
       this.mailGenerator = mailGenerator;
    }

    public int getDbCode() {
        return dbCode;
    }

    public MailGenerator getMailGenerator() {
        return mailGenerator;
    }

    public static MailType findByCode(int dbCode) throws Exception {
        MailType[] mailTypes = values();
        for (MailType mailType : mailTypes) {
            if (mailType.dbCode == dbCode) {
                return mailType;
            }
        }
        throw new Exception(dbCode + " not supported yet");
    }






}
