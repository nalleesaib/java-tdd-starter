package foobarqix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
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
    @Disabled
    public void shouldReturnFoo() {
        // TODO implement me as a red test
    }

}