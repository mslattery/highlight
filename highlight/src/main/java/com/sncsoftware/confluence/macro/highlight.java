package com.sncsoftware.confluence.macro;

import com.atlassian.confluence.content.render.xhtml.ConversionContext;
import com.atlassian.confluence.macro.Macro;
import com.atlassian.confluence.macro.MacroExecutionException;
import com.atlassian.confluence.macro.ResourceAware;
import com.atlassian.confluence.setup.settings.SettingsManager;

import java.util.Map;

/*@Scanned*/
public class highlight implements Macro, ResourceAware {

	private final SettingsManager settingsManager;
    public highlight(SettingsManager settingsManager)
    {
        this.settingsManager = settingsManager;
    }

    public String execute(Map<String, String> map, String s, ConversionContext conversionContext) throws MacroExecutionException {
        return ("<span style=\"background-color: " + map.get("Color") + ";\">" + map.get("Text") +"</span>");
    }

    public BodyType getBodyType() { return BodyType.NONE; }

    public OutputType getOutputType() { return OutputType.BLOCK; }

  	public String getResourcePath() { return null; }
    public void setResourcePath(String s) {}
}