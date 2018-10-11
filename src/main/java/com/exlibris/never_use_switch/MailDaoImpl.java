package com.exlibris.never_use_switch;

import org.fluttercode.datafactory.impl.DataFactory;

/**
 * @author Evgeny Borisov
 */
public class MailDaoImpl implements MailDao {

    private DataFactory dataFactory = new DataFactory();

    @Override
    public MailInfo getMailInfo() {

        return new MailInfo(dataFactory.getName(),dataFactory.getNumberBetween(1,3));
    }
}
