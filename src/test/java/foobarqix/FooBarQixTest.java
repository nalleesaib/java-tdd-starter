package foobarqix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
Test list 
- 1 => 1
- 2 => 2
- 3 => Foo
- 5 => Bar
- 7 => Qix
- 10 => Bar
- 15 => FooBar
- 21 => FooQix
 */
class FooBarQixTest {

    private FooBarQix foobarqix;

    @BeforeEach
    void setUp() {
        foobarqix = new FooBarQix();
    }

    @Test
    public void shouldReturnTheSameNumberConvertedIntoString() {
        assertThat(foobarqix.convert(1)).isEqualTo("1");
    }
    
    @Test
    public void shouldReturnTheSameNumberConvertedIntoString_2() {
        assertThat(foobarqix.convert(2)).isEqualTo("2");
    }
    
    @Test
    public void shouldReturnFoo() {
        assertThat(foobarqix.convert(3)).isEqualTo("Foo");
    }
    @Test
    public void shouldReturnFooWhenDivisibleBy3() {
        assertThat(foobarqix.convert(12)).isEqualTo("Foo");
    }

    @Test
    public void shouldReturnBar() {
        assertThat(foobarqix.convert(5)).isEqualTo("Bar");
    }
    
    @Test
    public void shouldReturnQix() {
        assertThat(foobarqix.convert(7)).isEqualTo("Qix");
    }
    
    @Test
    public void shouldReturnQixWhenDivisibleBy7() {
        assertThat(foobarqix.convert(28)).isEqualTo("Qix");
    }
    
    @Test
    public void shouldReturnBarWhenDivisibleBy5() {
        assertThat(foobarqix.convert(10)).isEqualTo("Bar");
    }
    
    @Test
    public void shouldReturnConcatenatedTokensWhenDivisibleBySeveralDivisors() {
        assertThat(foobarqix.convert(15)).isEqualTo("FooBar");
    }

    @Test
    public void shouldReturnFooAndQixWhenDivisibleByBoth3And7() {
        assertThat(foobarqix.convert(21)).isEqualTo("FooQix");
    }

}