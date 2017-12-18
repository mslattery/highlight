package com.sncsoftware.confluence.macro;

import com.atlassian.confluence.content.render.xhtml.ConversionContext;
import com.atlassian.confluence.macro.Macro;
import com.atlassian.confluence.macro.MacroExecutionException;

import java.util.Map;

public class highlight implements Macro {

    private static final String PARAM_NAME_TEXT = "Text";
    private static final String PARAM_NAME_COLOR = "Color";
    private static final String PARAM_NAME_CUSTOM_COLOR = "Custom Color";

    public String execute(Map<String, String> params, String s, ConversionContext conversionContext) throws MacroExecutionException {

 		if (params.containsKey(PARAM_NAME_CUSTOM_COLOR))
 		{
 			return ("<span style=\"background-color: " + params.get(PARAM_NAME_CUSTOM_COLOR) + ";\">" + params.get(PARAM_NAME_TEXT) +"</span>");
 		}
    	return ("<span style=\"background-color: " + params.get(PARAM_NAME_COLOR) + ";\">" + params.get(PARAM_NAME_TEXT) +"</span>");
     }

    public BodyType getBodyType() { return BodyType.NONE; }

    public OutputType getOutputType() { return OutputType.BLOCK; }
}