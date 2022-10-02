
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrancTest {
    @Test
    void multiplication() {
        Franc five = new Franc(5);
        Franc ten = five.times(2);
        assertThat(ten).isEqualTo(new Franc(10));

        Franc fifteen = five.times(3);
        assertThat(fifteen).isEqualTo(new Franc(15));
    }

    @Test
    void equals() {
        assertThat(new Franc(5)).isEqualTo(new Franc(5));
        assertThat(new Franc(5)).isNotEqualTo(new Franc(6));
    }
}
