package com.dotdashline.tools.cliparser.token;

import java.util.List;

import com.dotdashline.tools.cliparser.meta.ParamMeta;

/**
 * This class associates the metadata with the token.
 *
 * @author Raymond Tsang 
 * @author Steven Liang
 *
 * @since 1.0
 *
 */
public class ParamToken {

    private ParamMeta meta;

    private List<String> tokens;

    public ParamToken(ParamMeta meta, List<String> tokens) {
        this.meta = meta;
        this.tokens = tokens;
    }
    
    public ParamMeta getMeta() {
        return meta;
    }

    public List<String> getTokens() {
        return tokens;
    }
}