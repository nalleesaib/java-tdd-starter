package katabank;

import java.util.Date;


public class StubDateProvider implements DateProvider {
    private Date currentDate;


    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    @Override
    public Date getCurrentDate() {
        return currentDate;
    }
}
