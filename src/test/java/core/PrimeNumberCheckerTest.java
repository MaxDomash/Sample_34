package core;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PrimeNumberCheckerTest {

    @DataProvider(name = "prime number")
    public static Object[][] primeNumbers() {
        return new Object[][]{
                {2, true}, {3, true}, {4, false}, {5, true}, {2, true}, {3, true}, {4, false}, {5, true}, {6, false}, {7, true},
                {8, false}, {9, false}, {11, true}, {12, false}, {13, true}, {14, false}, {15, false}, {16, false}, {17, true}, {18, false}, {19, true},
                {21, false}, {22, false},{23, true}, {24, false}, {25, false}, {26, false}, {27, false}, {28, false}, {29, true}, {30, false}, {31, true},
                {32, false}, {33, false}, {34, false}, {35, false}, {36, false}, {37, true}, {38, false}, {39, false}, {40, false}, {41, true}, {42, false},
                {43, true}, {44, false}, {45, false}, {46, false}, {47, true}, {48, false}, {49, false}, {50, false}, {90, false}, {91, false}, {92, false},
                {93, false}, {94, false}, {95, false}, {96, false}, {97, true}, {98, false}, {99, false}, {100, false},

                {21, false}, {22, false},{23, true}, {24, false}, {25, false}, {26, false}, {27, false}, {28, false}, {29, true}, {30, false}, {31, true},
                {32, false}, {33, false}, {34, false}, {35, false}, {36, false}, {37, true}, {38, false}, {39, false}, {40, false}, {41, true}, {42, false},
                {43, true}, {44, false}, {45, false}, {46, false}, {47, true}, {48, false}, {49, false}, {50, false}, {90, false}, {91, false}, {92, false},
                {93, false}, {94, false}, {95, false}, {96, false}, {97, true}, {98, false}, {99, false}, {100, false},

                {1034093230, true}    //failure as expected
        };
    }


    @Test(timeOut = 1000, dataProvider = "prime number", groups = {"qa"})
    public void test(int number, boolean expected) {
        System.out.println(number + (PrimeNumberChecker.validate(number) ? " - Prime number":" - Not prime number"));
        assertThat(expected, equalTo(PrimeNumberChecker.validate(number)));
    }
}

