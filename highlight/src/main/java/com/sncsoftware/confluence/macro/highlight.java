package com.sncsoftware.confluence.macro;

import com.atlassian.confluence.content.render.xhtml.ConversionContext;
import com.atlassian.confluence.macro.Macro;
import com.atlassian.confluence.macro.MacroExecutionException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class highlight implements Macro {

    private static final String PARAM_NAME_TEXT = "Text";
    private static final String PARAM_NAME_COLOR = "Color";
    private static final String REGEX_HEXCOLOR_PATTERN_NOHASH = "^([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
    private static final String REGEX_HEXCOLOR_PATTERN_HASH = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
    private static final String REGEX_ONLY_LETTERS = "^[A-Za-z]+$";

    public String execute(Map<String, String> params, String s, ConversionContext conversionContext) throws MacroExecutionException {        

        String colorName = params.get(PARAM_NAME_COLOR);

        if (colorName.matches(REGEX_HEXCOLOR_PATTERN_NOHASH)) {   
            return ("<span style=\"background-color: #" + params.get(PARAM_NAME_COLOR) + ";\">" + params.get(PARAM_NAME_TEXT) +"</span>"); 
        } else if (colorName.matches(REGEX_HEXCOLOR_PATTERN_HASH)) { 
            return ("<span style=\"background-color: " + params.get(PARAM_NAME_COLOR) + ";\">" + params.get(PARAM_NAME_TEXT) +"</span>"); 
        } else if (colorName.matches(REGEX_ONLY_LETTERS)) {
            return ("<span style=\"background-color: " + params.get(PARAM_NAME_COLOR) + ";\">" + params.get(PARAM_NAME_TEXT) +"</span>"); 
        }
        return ("ERROR: Your color text is incorrect, use name like red, or #FF0000, or FF0000, or #F00, or F00");
     }

    public BodyType getBodyType() { return BodyType.NONE; }

    public OutputType getOutputType() { return OutputType.BLOCK; }
}