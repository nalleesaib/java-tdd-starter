package katabank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    private final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private DateProvider dateProvider;
    private StringBuilder history;

    @BeforeEach
    public void setup(){
        dateProvider = new StubDateProvider();
        history = new StringBuilder("Date||Transaction||Balance");
    }

    @Test
    public void shouldReturnZeroForNewAccount(){
        assertThat(new Account(dateProvider).getBalance()).isEqualTo(0);
    }

    @Test
    public void shouldReturnBalanceForNewAccountDepositAmount(){
        //Given
        AccountInterface account = new Account(dateProvider);
        //when
        account.deposit(20);
        //Then
        assertThat(account.getBalance()).isEqualTo(20);
        //Given
        account = new Account(dateProvider);
        //when
        account.deposit(200);
        //Then
        assertThat(account.getBalance()).isEqualTo(200);
    }

    @Test
    public void shouldReturn15ForExistingAccountWithBalance10Deposit15(){
        //Given
        AccountInterface account = new Account(dateProvider);
        account.deposit(10);
        //when
        account.deposit(5);
        //Then
        assertThat(account.getBalance()).isEqualTo(15);
    }


    @Test
    public void shouldReturn10ForNewAccountCredit5(){
        //Given
        AccountInterface account = new Account(dateProvider);
        account.deposit(15);
        //then
        account.withdrawal(5);
        //Then
        assertThat(account.getBalance()).isEqualTo(10);
    }


    @Test
    public void ShouldPrintNothingForNewAccount(){
        //Given
        AccountInterface account = new Account(dateProvider);
        //when
        account.printStatement();
        //then
        assertThat(account.getHistory()).isEqualTo(history.toString());
    }

    @Test
    public void ShouldPrintHistoryFor2DepositAndOneWithDrawal(){
        //Given
        dateProvider.setCurrentDate(new Date());
        AccountInterface account = new Account(dateProvider);
        account.deposit(25);
        account.withdrawal(10);
        //when
        account.printStatement();
        //then
        history.append(sdf.format(new Date())).append("||-10||15");
        history.append(sdf.format(new Date()) + "||25||25");
        assertThat(account.getHistory()).isEqualTo(history.toString());
    }


    @Test
    public void shouldPrintTrxHistoryWhithMultilpleDays() throws ParseException {
        //Given
        dateProvider.setCurrentDate(sdf.parse("15-04-2020"));
        AccountInterface account = new Account(dateProvider);
        //operation for day 1
        account.deposit(25);
        //operation for day 2
        dateProvider.setCurrentDate(sdf.parse("16-04-2020"));
        account.withdrawal(25);
        //when
        account.printStatement();
        //then
        history.append("16-04-2020||-25||0");
        history.append("15-04-2020||25||25");
        assertThat(account.getHistory()).isEqualTo(history.toString());
    }

    /**
     * Consultation balance payante 1 EURO / Consultation
     *
     */

}
