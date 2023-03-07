package designPattern.creational.providerPattern.provider;

import designPattern.creational.providerPattern.media.SocialMedia;
import designPattern.creational.providerPattern.model.type.SocialMediaType;

import java.beans.beancontext.BeanContext;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// https://velog.io/@hellonewtry/%EC%8A%A4%ED%94%84%EB%A7%81-Provier-%EB%A5%BC-%EC%9D%B4%EC%9A%A9%ED%95%98%EC%97%AC-Enum-Type-%EC%97%90-%EB%A7%9E%EB%8A%94-%EC%84%9C%EB%B9%84%EC%8A%A4-%EA%B0%9D%EC%B2%B4-%EB%B0%98%ED%99%98%ED%95%98%EA%B8%B0
public class SocialMediaServiceProvider {
    private static Map<String, Class<? extends SocialMedia>> socialMediaMap = new HashMap<>();

    static {
        for (SocialMediaType value : SocialMediaType.values()){
            socialMediaMap.put(value.toString().toLowerCase(), value.getClazz());
        }
    }
    public static SocialMedia service(String socialMediaType){
        Class<? extends SocialMedia> serviceClass = socialMediaMap.get(socialMediaType.toLowerCase());
        if(serviceClass != null){
            //return serviceClass;
        }
        throw new IllegalArgumentException("No proper type for the given media type : "+socialMediaType);
    }


}
