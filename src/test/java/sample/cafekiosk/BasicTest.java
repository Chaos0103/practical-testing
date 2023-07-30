package sample.cafekiosk;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class BasicTest {

    @DisplayName("리스트 사이즈 테스트")
    @Test
    void listSize() {
        List<Integer> numbers = List.of(1, 2, 3);

        assertThat(numbers)
                .hasSize(3);
    }

    @DisplayName("리스트 사이즈 테스트")
    @Test
    void test() {
        List<Integer> numbers = List.of(1, 2, 3);

        assertThat(numbers)
                .hasSize(3);
    }
}
