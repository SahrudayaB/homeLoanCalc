package com.adobe.aem.guides.homeLoanCalc.core;

package com.stratpoint.aem.labs.core.components;

        import com.adobe.cq.sightly.WCMUse;

public class BoxComponent extends WCMUse {
    private static final String COLOR = "color";
    private String color;

    @Override
    public void activate() throws Exception {
        color = getProperties().get(COLOR, String.class);
        if(color != null && !color.startsWith("rgba"))
            color = "#" + color;
    }

    public String getColor() {
        return color;
    }
}