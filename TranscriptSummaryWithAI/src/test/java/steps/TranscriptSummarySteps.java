package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.PageVideo;

public class TranscriptSummarySteps {
    PageVideo video = new PageVideo();
    @Given("I navigate to videoLink")
    public void navigationtoVideo(){
        video.navigateToYoutubeVideo();
    }
    @And("I select more option")
    public void selectMore(){
        video.clickOnExpandMore();
    }
    @And("I can select view transcript")
    public void selectViewTranscript(){
        video.clickOnShowTranscript();
    }
}
