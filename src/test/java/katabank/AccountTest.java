package katabank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * -tester le solde d'un compte
 *   *tester que le solde d'un compte nouvellement cree est egale a 0
 *   *tester que si solde=0 et on credite 10 alors le solde = 10
 *   *tester que si solde=10 et on debite 5 alors solde = 5
 *   *tester que si solde=7 et on debite 10 alors trow un exception
 * -imprimer les details d'un compte
 *
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


}
