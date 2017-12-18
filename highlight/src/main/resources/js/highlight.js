var updateMacro = function(macroNode, param) {
    var $macroDiv = AJS.$(macroNode);
    AJS.Rte.getEditor().selection.select($macroDiv[0]);
    AJS.Rte.BookmarkManager.storeBookmark();

    var macroRenderRequest = {
        contentId: Confluence.Editor.getContentId(),
        macro: {
            name: "highlight",
            params: {"Color": param},
            defaultParameterValue: "",
            body : ""
        }
    };

    tinymce.confluence.MacroUtils.insertMacro(macroRenderRequest);
};

AJS.Confluence.PropertyPanel.Macro.registerButtonHandler("Yellow", function(e, macroNode) {
    updateMacro(macroNode, "yellow");
});
AJS.Confluence.PropertyPanel.Macro.registerButtonHandler("Blue", function(e, macroNode) {
    updateMacro(macroNode, "blue");
});
AJS.Confluence.PropertyPanel.Macro.registerButtonHandler("Green", function(e, macroNode) {
    updateMacro(macroNode, "green");
});
AJS.Confluence.PropertyPanel.Macro.registerButtonHandler("Red", function(e, macroNode) {
    updateMacro(macroNode, "red");
});