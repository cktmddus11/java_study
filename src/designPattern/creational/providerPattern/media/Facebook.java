package designPattern.creational.providerPattern.media;


import java.util.logging.Level;
import java.util.logging.Logger;

public class Facebook implements SocialMedia{
    @Override
    public String post(String content) {
        Logger logger = Logger.getLogger("facebook" );
        logger.log(Level.INFO, "facebook post");

        return "Posted on Facebook : "+content;
    }
}
