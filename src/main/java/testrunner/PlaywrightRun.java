package testrunner;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightRun {

    public static void main(String[] args) {
        BrowserType.LaunchOptions options = new BrowserType.LaunchOptions();
        options.setChannel("chrome");
        options.setHeadless(false);
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(options); // browser
            Page page = browser.newPage(); // a tab
            page.navigate("https://playwright.dev");
            System.out.println(page.title());
            browser.close();
        }
    }
}
