import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DollarTest {
    @Test
    void multiplication() {
        Dollar five = new Dollar(5);
        Dollar ten = five.times(2);
        assertThat(ten).isEqualTo(new Dollar(10));

        Dollar fifteen = five.times(3);
        assertThat(fifteen).isEqualTo(new Dollar(15));
    }

    @Test
    void equals() {
        assertThat(new Dollar(5)).isEqualTo(new Dollar(5));
        assertThat(new Dollar(5)).isNotEqualTo(new Dollar(6));
    }
}
