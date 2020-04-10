//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
///*
// Test list :
// -0 -> Exception
// - (-1) -> Exception
// - Base Test
//   1(I),2(II),3(III),..9(IX),10(X)
//   ,40(XL),50(L),90(XC),100(C),400(CD)
//   ,500(D),900(CM),1000(M)
// - 2001 = INFINITE
// - Examples =
//    439 = 400 + 30 + 9 = CDXXXIX
//    293 = 200 + 90 + 3 = CCXCIII
//    1589 = 1000 + 500 + 50 + 30 + 9 = MDLXXXIX
//    1586 = 1000 + 500 + 50 + 30 + 6 = MDLXXXVI
//    1000 900 500 400 100 90 50 40 10 9 8 7 6 5 4 3 2 1
//    1    0   1    0   0  0   1  0  3       1
//    M        D               L     XXX     VI = MDLXXXVI
//*/
//public class RomanNumeralTest {
////    @Test
////    public void shouldReturnI() {
////        assertThat(RomanNumeral.convert(1)).isEqualTo("I");
////    }
////
////    @Test
////    public void shouldReturnIV() {
////        assertThat(RomanNumeral.convert(4)).isEqualTo("IV");
////    }
////
////    @Test
////    public void shouldReturnV() {
////        assertThat(RomanNumeral.convert(5)).isEqualTo("V");
////    }
////
////    @Test
////    public void shouldReturnIX() {
////        assertThat(RomanNumeral.convert(9)).isEqualTo("IX");
////    }
////
////    @Test
////    public void shouldReturnIII() {
////        assertThat(RomanNumeral.convert(3)).isEqualTo("III");
////    }
////    @Test
////    public void shouldReturnVI() {
////        assertThat(RomanNumeral.convert(6)).isEqualTo("VI");
////    }
////
////    @Test
////    public void shouldReturnVII() {
////        assertThat(RomanNumeral.convert(7)).isEqualTo("VII");
////    }
////
////    @Test
////    public void shouldReturnVIII() {
////        assertThat(RomanNumeral.convert(8)).isEqualTo("VIII");
////    }
////
////    @Test
////    public void shouldReturnX() {
////        assertThat(RomanNumeral.convert(10)).isEqualTo("X");
////    }
//
////    @Test
////    public void shouldReturnLessThanX() {
////        assertThat(RomanNumeral.convert(5)).isEqualTo("V");
////        assertThat(RomanNumeral.convert(2)).isEqualTo("II");
////        assertThat(RomanNumeral.convert(8)).isEqualTo("VIII");
////    }
//
//    @Test
//    public void shouldReturnTheBasicNumber() {
//        assertThat(RomanNumeral.convert(5)).isEqualTo("V");
//        assertThat(RomanNumeral.convert(2)).isEqualTo("II");
//        assertThat(RomanNumeral.convert(8)).isEqualTo("VIII");
//        assertThat(RomanNumeral.convert(40)).isEqualTo("XL");
//        assertThat(RomanNumeral.convert(100)).isEqualTo("C");
//        assertThat(RomanNumeral.convert(900)).isEqualTo("CM");
//    }
//
//    @Test
//    public void shouldReturnCDXXXIX() {
//        assertThat(RomanNumeral.convert(439)).isEqualTo("CDXXXIX");
//    }
//
//    @Test
//    public void shouldReturnMDLXXXIX() {
//        assertThat(RomanNumeral.convert(1589)).isEqualTo("MDLXXXIX");
//    }
//
//}