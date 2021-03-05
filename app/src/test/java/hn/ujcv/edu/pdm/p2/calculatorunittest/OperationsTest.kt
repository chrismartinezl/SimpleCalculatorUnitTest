package hn.ujcv.edu.pdm.p2.calculatorunittest
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class OperationsTest {
    @Test
    fun `operations function return a result as string`()
    {
        // Given
        val sum = MainActivity()
        // When
        val result = sum.testOperations("Test", 3.3, 3.0, "MULTIPLY")
        // Then
        assertThat(result).isEqualTo("Test is 9.90")
    }
}