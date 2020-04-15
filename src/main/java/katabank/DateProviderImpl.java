package katabank;

import java.util.Date;

public class DateProviderImpl implements DateProvider {

    @Override
    public Date getCurrentDate() {
        return new Date();
    }
}
