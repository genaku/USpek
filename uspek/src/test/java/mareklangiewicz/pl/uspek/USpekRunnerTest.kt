package mareklangiewicz.pl.uspek

import mareklangiewicz.pl.uspek.USpek.o
import org.junit.Assert
import org.junit.runner.RunWith

@RunWith(USpekJUnitRunner::class)
class USpekRunnerTest {

    init {
        USpek.uspek("some nested test") {
            "1st assertion" o {
                Assert.assertTrue(true)
                "nested assertion" o {
                    Assert.assertTrue(true)
                    "even more nested assertion" o {
                        Assert.assertTrue(true)
                    }
                }
            }
            "2nd assertion" o {
                Assert.assertFalse(false)
            }
            "3rd assertion" o {
                Assert.assertFalse(false)
            }
        }
    }
}