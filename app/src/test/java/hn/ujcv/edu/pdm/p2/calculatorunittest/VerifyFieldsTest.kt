package hn.ujcv.edu.pdm.p2.calculatorunittest
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class VerifyFieldsTest {
    @Test
    fun `empty fields return false`() {
        // Given
        val verify = MainActivity()
        // When
        val result = verify.checkFields("","","")
        // Then
        assertThat(result).isFalse()
    }

    @Test
    fun `full fields return true`() {
        val verify = MainActivity()
        val result = verify.checkFields("Test","23.5","43")
        assertThat(result).isTrue()
    }
}