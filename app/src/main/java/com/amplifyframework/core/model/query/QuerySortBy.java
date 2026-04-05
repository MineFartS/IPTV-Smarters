package com.amplifyframework.core.model.query;

import a.i.q.d;
import com.amplifyframework.util.Wrap;

/* JADX INFO: loaded from: classes.dex */
public final class QuerySortBy {
    private final String field;
    private final String modelName;
    private final QuerySortOrder sortOrder;

    public QuerySortBy(String str, QuerySortOrder querySortOrder) {
        this(null, str, querySortOrder);
    }

    public QuerySortBy(String str, String str2, QuerySortOrder querySortOrder) {
        this.modelName = str;
        str2.getClass();
        this.field = str2;
        querySortOrder.getClass();
        this.sortOrder = querySortOrder;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QuerySortBy.class != obj.getClass()) {
            return false;
        }
        QuerySortBy querySortBy = (QuerySortBy) obj;
        return d.a(this.modelName, querySortBy.modelName) && d.a(this.field, querySortBy.field) && d.a(this.sortOrder, querySortBy.sortOrder);
    }

    public String getField() {
        return this.field;
    }

    public String getModelName() {
        return this.modelName;
    }

    public QuerySortOrder getSortOrder() {
        return this.sortOrder;
    }

    public int hashCode() {
        return d.b(this.modelName, this.field, this.sortOrder);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("QuerySortBy{model=");
        String str = this.modelName;
        sb.append(str == null ? null : Wrap.inSingleQuotes(str));
        sb.append(", field=");
        sb.append(Wrap.inSingleQuotes(this.field));
        sb.append(", sortOrder=");
        sb.append(this.sortOrder);
        sb.append('}');
        return sb.toString();
    }
}
