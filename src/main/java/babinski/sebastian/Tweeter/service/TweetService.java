package babinski.sebastian.Tweeter.service;

import babinski.sebastian.Tweeter.model.Tweet;
import babinski.sebastian.Tweeter.repository.TweetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TweetService {

    private final TweetRepository tweetRepository;

    public Tweet addTweet(Tweet tweet) {
        return tweetRepository.save(tweet);
    }

    public void deleteTweet(long id) {
        tweetRepository.deleteById(id);
    }

    public Tweet editTweet(Tweet tweet) {
        Tweet tweetEdited = tweetRepository.findById(tweet.getId())
                .orElseThrow();
        tweetEdited.setTitle(tweet.getTitle());
        tweetEdited.setContent(tweet.getContent());
        return tweetEdited;
    }

    public Tweet getSingleTweet(long id) {
        return tweetRepository.findById(id)
                .orElseThrow();
    }

}
