package katabank;

import java.util.Date;

public interface DateProvider {
    Date getCurrentDate();

    void setCurrentDate(Date date);
}
