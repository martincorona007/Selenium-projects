package pages;

public class PageVideo extends BasePage {

    private String expandMoreButton = "//ytd-text-inline-expander[@id='description-inline-expander']//tp-yt-paper-button[@id='expand']";
    private String showTranscriptButton = "//button[@aria-label='Show transcript']";

    public PageVideo(){
        super(driver);
    }

    public void navigateToYoutubeVideo(){
        navigateTo("https://www.youtube.com/watch?v=WimShbiETiE");
        waitForSeconds(3);
    }

    public void clickOnExpandMore(){
        clickElement(expandMoreButton);
    }

    public void clickOnShowTranscript(){
        clickElement(showTranscriptButton);
        waitForSeconds(13);
    }

}