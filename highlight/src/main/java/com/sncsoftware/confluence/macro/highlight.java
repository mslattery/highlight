package com.sncsoftware.confluence.macro;

import com.atlassian.confluence.content.render.xhtml.ConversionContext;
import com.atlassian.confluence.macro.Macro;
import com.atlassian.confluence.macro.MacroExecutionException;

import java.util.Map;

/*@Scanned*/
public class highlight implements Macro {

    public String execute(Map<String, String> map, String s, ConversionContext conversionContext) throws MacroExecutionException {
        return ("<span style=\"background-color: " + map.get("Color") + ";\">" + map.get("Text") +"</span>");
    }

    public BodyType getBodyType() { return BodyType.NONE; }

    public OutputType getOutputType() { return OutputType.BLOCK; }
}