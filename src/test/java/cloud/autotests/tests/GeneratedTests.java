package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Проверка авторизации")
    void generatedTest() {
        step("Открыть 'https://plarium.com/ru/'", () -> {
            step("// todo: just add selenium action");
        });

        step("Нажать на Войти", () -> {
            step("// todo: just add selenium action");
        });

        step("Ввести электронную почту", () -> {
            step("// todo: just add selenium action");
        });

        step("Кликнуть Далее", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить, что форма авторизации выдала ошибку", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://plarium.com/ru/'", () ->
            open("https://plarium.com/ru/"));

        step("Page title should have text 'Plarium: кроссплатформенные игры ждут тебя!'", () -> {
            String expectedTitle = "Plarium: кроссплатформенные игры ждут тебя!";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://plarium.com/ru/'", () ->
            open("https://plarium.com/ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}