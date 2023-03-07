package designPattern.creational.providerPattern.controller;

import designPattern.creational.providerPattern.media.SocialMedia;
import designPattern.creational.providerPattern.provider.SocialMediaServiceProvider;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SocialMediaController {
    public String post( String type,  String content){
        Logger logger = Logger.getLogger("instagram" );
        logger.log(Level.INFO, "The content of the post : "+content);

        SocialMedia service = SocialMediaServiceProvider.service(type);
        return service.post(content);
    }
}
