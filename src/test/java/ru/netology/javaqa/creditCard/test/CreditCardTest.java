package ru.netology.javaqa.creditCard;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CreditCardTest {
    @Data
    @RequiredArgsConstructor
    public class RegistrationByCardInfo{
        private final String name;
        private final String city;
        private final LocalDate planingDate;
        private final Integer phone;
    }
    @Test
    void dateChange(){
       open("http://localhost:9999");
        $("[data-test-id='city'] input").setValue( city );

    }


}
