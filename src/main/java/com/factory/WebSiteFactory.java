package main.java.com.factory;

public class WebSiteFactory {
    public static Website getWebsite(WebsiteType siteType){
        switch (siteType){
            case BLOG: {
                return  new Blog();
            }
            case SHOP: {
                return  new Shop();
            }
            default:{
                return null;
            }
        }
    }
}
