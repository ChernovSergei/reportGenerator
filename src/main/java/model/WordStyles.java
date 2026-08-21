package model;

import java.util.List;

public class WordStyles {
    private String styleName;
    private int textStyleId;
    private int paragraphStyleId;

    public void WordStyles(String styleName,
                           Integer textStyleId,
                           Integer paragraphStyleId) {
        this.styleName = styleName;
        this.textStyleId = textStyleId;
        this.paragraphStyleId = paragraphStyleId;
    }
}
