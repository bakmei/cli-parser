package com.dotdashline.tools.cliparser.token;

import java.util.List;


import com.dotdashline.tools.cliparser.meta.OptionMeta;
/**
 * This class associates the metadata with the token.
 *
 * @author Raymond Tsang 
 * @author Steven Liang
 *
 * @since 1.0
 *
 */
public class OptionToken {

    private OptionMeta meta;

    private List<String> tokens;

    public OptionToken(OptionMeta meta, List<String> tokens) {
        this.meta = meta;
        this.tokens = tokens;
    }

    public OptionMeta getMeta() {
        return meta;
    }

    public List<String> getTokens() {
        return tokens;
    }
}
