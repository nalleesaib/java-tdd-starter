package katabank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * -tester le solde d'un compte
 *   *tester que le solde d'un compte nouvellement cree est egale a 0
 *   *tester que si solde=0 et on credite 10 alors le solde = 10
 *   *tester que si solde=10 et on debite 5 alors solde = 5
 *   *tester que si solde=7 et on debite 10 alors trow un exception
 * -imprimer les details d'un compte
 */
public class AccountTest {

    @Test
    public void shouldReturnZeroForNewAccount(){
        //Given
        // When Then
        assertThat(new Account().getBalance()).isEqualTo(0);
    }


    @Test
    public void shouldReturnBalanceForNewAccountDepositAmount(){
        //Geven
        AccountInterface account = new Account();
        //then
        account.deposit(20);
        //Then
        assertThat(account.getBalance()).isEqualTo(20);

        account = new Account();
        account.deposit(200);

        assertThat(account.getBalance()).isEqualTo(200);
    }

    @Test
    public void shouldReturn15ForExistingAccountWithBalance10Deposit5(){
        //Geven
        AccountInterface account = new Account();
        account.deposit(10);

        //when
        account.deposit(5);

        //Then
        assertThat(account.getBalance()).isEqualTo(15);
    }


    @Test
    public void shouldReturn10ForNewAccountCredit5(){
        //Geven
        AccountInterface account = new Account();
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
        AccountInterface account = new Account();
        //when
        account.printStatement();

        //then
        StringBuilder history = new StringBuilder("Date||Transaction||Balance");
        assertThat(account.getHistory()).isEqualTo(history.toString());
    }

    @Test
    public void ShouldPrintHistoryFor2DepositAndOneWithDrawal(){
        //Given
        AccountInterface account = new Account();
        account.deposit(25);
        account.withdrawal(10);

        //when
        account.printStatement();

        //then
        StringBuilder history = new StringBuilder("Date||Transaction||Balance");
        history.append("15-04-2020||-10||15");
        history.append("15-04-2020||25||25");
        assertThat(account.getHistory()).isEqualTo(history.toString());
    }

    @Test
    public void ShouldPrintSatementWhenBalanceIs0WithTransaction(){
        //Given
        AccountInterface account = new Account();
        account.deposit(25);
        account.withdrawal(25);

        //when
        account.printStatement();

        //then
        StringBuilder history = new StringBuilder("Date||Transaction||Balance");
        history.append("15-04-2020||-25||0");
        history.append("15-04-2020||25||25");
        assertThat(account.getHistory()).isEqualTo(history.toString());
    }

    @Test
    public void shouldPrintTrxHistoryWhithMultilpleDays(){
        //Given

        //when(new Date()).Then(return 'fdfd');

        AccountInterface account = new Account();
        //operation for thay 1
        account.setDate(new Date(2020, Calendar.APRIL,15));
        account.deposit(25);


        //operation for thay 2
        account.setDate(new Date(2020, Calendar.APRIL,16));
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
