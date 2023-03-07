package designPattern.creational.providerPattern.media;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Instagram implements SocialMedia{
    @Override
    public String post(String content) {
        Logger logger = Logger.getLogger("instagram" );
        logger.log(Level.INFO, "instagram post");

        return "Posted on Instagram : "+content;
    }
}
