package storm;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.*;
public class App {
	public static void main(String[] args) {
		ConfigurationBuilder _configurationBuilder = new ConfigurationBuilder();
		_configurationBuilder.setOAuthConsumerKey("TEnZgNww2JUoPyKAbRKuCuA8d");
		_configurationBuilder.setOAuthConsumerSecret("4FxPZgoSCsqhePuBZCmjeiZS6moaTov5JGLZgrWKK507PYMoIj");
		_configurationBuilder.setOAuthAccessToken("84170561-k9OzEHbmzpnYhDpFFFDUFYBcgZ3UhlsHdUPJ2euQE");
		_configurationBuilder.setOAuthAccessTokenSecret("y2hcKqMnbSBt4oWzdTbAGP6Pf5Q4GLMc2zyrN0FZdwohN");
		
		
		StatusListener listener = new StatusListener() {
			public void onStatus(Status status) {
				System.out.println(status.getText());
			}
			public void onStallWarning(StallWarning w) {
				
			}
			public void onScrubGeo(long a, long b) {
				
			}
			public void onTrackLimitationNotice(int a) {
				
			}
			public void onDeletionNotice(StatusDeletionNotice s) {
				
			}
			public void onException(Exception e) {
				
			}
		};
		TwitterStream twitterStream = new TwitterStreamFactory(_configurationBuilder.build()).getInstance();
		twitterStream.addListener(listener);
		twitterStream.sample();
		
	}
}