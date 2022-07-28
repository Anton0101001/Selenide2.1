package ru.netology;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class OrderCardTest {

        private WebDriver driver;

        @BeforeAll

        public static void setUpAll() {
            System.setProperty("webdriver.chrome.driver", "./driver/win/chromedriver.exe");

        }

        @BeforeEach

    public void setUp() {
            driver = ChromeDriver();
            driver.get
        }

}