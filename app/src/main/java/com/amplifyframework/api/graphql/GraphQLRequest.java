package com.amplifyframework.api.graphql;

import a.i.q.d;
import android.text.TextUtils;
import com.amplifyframework.util.Wrap;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class GraphQLRequest<R> {
    private final Type responseType;
    private final VariablesSerializer variablesSerializer;

    public interface VariablesSerializer {
        String serialize(Map<String, Object> map);
    }

    public GraphQLRequest(Type type, VariablesSerializer variablesSerializer) {
        this.responseType = type;
        this.variablesSerializer = variablesSerializer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GraphQLRequest graphQLRequest = (GraphQLRequest) obj;
        return d.a(this.responseType, graphQLRequest.responseType) && d.a(this.variablesSerializer, graphQLRequest.variablesSerializer);
    }

    public String getContent() {
        return Wrap.inBraces(TextUtils.join(", ", Arrays.asList(Wrap.inDoubleQuotes("query") + ": " + Wrap.inDoubleQuotes(getQuery().replace("\"", "\\\"").replace("\n", "\\n")), Wrap.inDoubleQuotes("variables") + ": " + (getVariables().isEmpty() ? null : this.variablesSerializer.serialize(getVariables())))));
    }

    public abstract String getQuery();

    public Type getResponseType() {
        return this.responseType;
    }

    public abstract Map<String, Object> getVariables();

    public VariablesSerializer getVariablesSerializer() {
        return this.variablesSerializer;
    }

    public int hashCode() {
        int iHashCode = this.responseType.hashCode() * 31;
        VariablesSerializer variablesSerializer = this.variablesSerializer;
        return iHashCode + (variablesSerializer != null ? variablesSerializer.hashCode() : 0);
    }

    public String toString() {
        return "GraphQLRequest{, responseType='" + this.responseType + "', variablesSerializer='" + this.variablesSerializer + "'}";
    }
}
