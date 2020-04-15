package katabank;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

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
    public void shouldReturnTenForNewAccountDepositTen(){
        //Geven
        AccountInterface account = new Account();
        //then
        account.deposit(10);
        //Then
        assertThat(account.getBalance()).isEqualTo(10);
    }
}
