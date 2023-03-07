package designPattern.creational.providerPattern.model.type;

import designPattern.creational.providerPattern.media.Facebook;
import designPattern.creational.providerPattern.media.Instagram;
import designPattern.creational.providerPattern.media.SocialMedia;

public enum SocialMediaType {
    FACEBOOK(Facebook.class),
    INSTAGRAM(Instagram.class),
    ;


    private final Class<? extends SocialMedia> clazz;

    public Class<? extends SocialMedia> getClazz() {
        return clazz;
    }

    SocialMediaType(Class<? extends SocialMedia> clazz) {
        this.clazz = clazz;
    }
}
