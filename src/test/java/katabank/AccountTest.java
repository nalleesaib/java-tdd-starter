package katabank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    @Test
    public void shouldReturnZeroForNewAccount(){
        //Given
        // When Then
        DateProvider dateProvider = new DateProviderImpl();
        assertThat(new Account(dateProvider).getBalance()).isEqualTo(0);
    }


    @Test
    public void shouldReturnBalanceForNewAccountDepositAmount(){
        //Geven
        DateProvider dateProvider = new DateProviderImpl();
        AccountInterface account = new Account(dateProvider);
        //then
        account.deposit(20);
        //Then
        assertThat(account.getBalance()).isEqualTo(20);

        account = new Account(dateProvider);
        account.deposit(200);

        assertThat(account.getBalance()).isEqualTo(200);
    }

    @Test
    public void shouldReturn15ForExistingAccountWithBalance10Deposit15(){
        //Geven
        DateProvider dateProvider = new DateProviderImpl();
        AccountInterface account = new Account(dateProvider);
        account.deposit(10);

        //when
        account.deposit(5);

        //Then
        assertThat(account.getBalance()).isEqualTo(15);
    }


    @Test
    public void shouldReturn10ForNewAccountCredit5(){
        //Geven
        DateProvider dateProvider = new DateProviderImpl();
        AccountInterface account = new Account(dateProvider);
        account.deposit(15);
        //then
        account.withdrawal(5);
        //Then
        assertThat(account.getBalance()).isEqualTo(10);
    }
    /*
     1 - ShouldPrintNothingForNewAccount
     2 - ShouldPrintHistoryFor2DepositAndOneWithDrawal
     */
    @Test
    public void ShouldPrintNothingForNewAccount(){
        //Given
        DateProvider dateProvider = new DateProviderImpl();
        AccountInterface account = new Account(dateProvider);
        //when
        account.printStatement();

        //then
        StringBuilder history = new StringBuilder("Date||Transaction||Balance");
        assertThat(account.getHistory()).isEqualTo(history.toString());
    }

    @Test
    public void ShouldPrintHistoryFor2DepositAndOneWithDrawal(){
        //Given
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        DateProvider dateProvider = new DateProviderImpl();
        AccountInterface account = new Account(dateProvider);
        account.deposit(25);
        account.withdrawal(10);

        //when
        account.printStatement();

        //then
        StringBuilder history = new StringBuilder("Date||Transaction||Balance");
        history.append( sdf.format(new Date()) + "||-10||15");
        history.append(sdf.format(new Date()) + "||25||25");
        assertThat(account.getHistory()).isEqualTo(history.toString());
    }


    @Test
    public void shouldPrintTrxHistoryWhithMultilpleDays() throws ParseException {
        //Given
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        //when(new Date()).Then(return 'fdfd');
        StubDateProvider dateProvider = new StubDateProvider();
        String strDate1 = new String("15-04-2020");

        dateProvider.setCurrentDate(sdf.parse(strDate1));
        AccountInterface account = new Account(dateProvider);
        //operation for thay 1
        account.deposit(25);


        //operation for thay 2
        String strDate2 = new String("16-04-2020");
        dateProvider.setCurrentDate(sdf.parse(strDate2));
        account.withdrawal(25);

        //when
        account.printStatement();

        //then
        StringBuilder history = new StringBuilder("Date||Transaction||Balance");
        history.append("16-04-2020||-25||0");
        history.append("15-04-2020||25||25");
        assertThat(account.getHistory()).isEqualTo(history.toString());


    }



}
