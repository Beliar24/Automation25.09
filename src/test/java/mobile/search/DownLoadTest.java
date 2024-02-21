package mobile.search;

import mobile.BaseTest;
import mobile.po.SkipPage;
import mobile.services.ArticleService;
import mobile.services.SearchService;
import org.testng.annotations.Test;

public class DownLoadTest extends BaseTest {

    @Test
    void downloadScreenshot() {
        new SkipPage().clickSkip();
        new SearchService().searchTest("Odesa");

        new ArticleService()
                .clickArticleAndSaveImage();
    }
}
