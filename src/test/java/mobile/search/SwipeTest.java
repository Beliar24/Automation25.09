package mobile.search;

import mobile.BaseTest;
import mobile.po.ListSavedArticlePage;
import mobile.po.SavePage;
import mobile.po.SkipPage;
import mobile.services.ArticleService;
import mobile.services.ListSavedArticleService;
import mobile.services.SearchService;
import org.testng.annotations.Test;

public class SwipeTest extends BaseTest {
    @Test
    void shouldBeSwipeUp() {
        new SkipPage().clickSkip();

        new SearchService().searchTest("Appium");

        new ArticleService().clickArticle();

        new SavePage().clickSaveButton();

        new ListSavedArticleService()
                .addToListArticle("ABC");

        new ListSavedArticlePage()
                .swipeElementRight(300);
    }
}
