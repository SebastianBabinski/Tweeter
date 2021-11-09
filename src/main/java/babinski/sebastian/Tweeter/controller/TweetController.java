package babinski.sebastian.Tweeter.controller;

import babinski.sebastian.Tweeter.model.Tweet;
import babinski.sebastian.Tweeter.service.TweetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TweetController {

    private final TweetService tweetService;

    @PostMapping("/tweets")
    public Tweet addTweet(@RequestBody Tweet tweet) {
        return tweetService.addTweet(tweet);
    }

    @PutMapping("/tweets")
    public Tweet editTweet(@RequestBody Tweet tweet) {
        return tweetService.editTweet(tweet);
    }

    @DeleteMapping("/tweets/{id}")
    public void deleteTweet(@PathVariable long id) {
        tweetService.deleteTweet(id);
    }

    @GetMapping("/tweets")
    public List<Tweet> getTweets() {
        return  tweetService.getAllTweets();
    }

    @GetMapping("/tweets/{id}")
    public Tweet getSingleTweet(@PathVariable long id) {
        return tweetService.getSingleTweet(id);
    }
}
