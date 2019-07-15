package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        final boolean isINIEORMac = (platform.toUpperCase().indexOf("MAC") > -1) &&
                (browser.toUpperCase().indexOf("IE") > -1);
        if (isINIEORMac) {
            return "IE on Mac?";
        }
        return "banner";
    }
}
