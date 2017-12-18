package com.sncsoftware.confluence.macro;

import com.atlassian.confluence.content.render.xhtml.ConversionContext;
import com.atlassian.confluence.macro.Macro;
import com.atlassian.confluence.macro.MacroExecutionException;

import java.util.Map;

/*@Scanned*/
public class highlight implements Macro {

    private static final String PARAM_NAME = "Custom Color";

    public String execute(Map<String, String> params, String s, ConversionContext conversionContext) throws MacroExecutionException {

 		if (params.containsKey(PARAM_NAME))
 		{
 			return ("<span style=\"background-color: " + params.get(PARAM_NAME) + ";\">" + params.get("Text") +"</span>");
 		}
    	return ("<span style=\"background-color: " + params.get("Color") + ";\">" + params.get("Text") +"</span>");
     }

    public BodyType getBodyType() { return BodyType.NONE; }

    public OutputType getOutputType() { return OutputType.BLOCK; }
}