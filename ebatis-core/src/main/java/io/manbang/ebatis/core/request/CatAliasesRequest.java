package io.manbang.ebatis.core.request;

import org.elasticsearch.client.Request;

public class CatAliasesRequest extends CatRequest {
    @Override
    protected String getSubEndpoint() {
        return "/aliases";
    }

    @Override
    protected void customize(Request request) {
    }
}
