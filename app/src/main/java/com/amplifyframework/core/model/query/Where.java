package com.amplifyframework.core.model.query;

import com.amplifyframework.core.model.PrimaryKey;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Where {
    private Where() {
    }

    public static QueryOptions id(String str) {
        QueryField queryFieldField = QueryField.field(PrimaryKey.fieldName());
        str.getClass();
        return matches(queryFieldField.eq(str)).paginated(Page.firstResult());
    }

    public static QueryOptions matches(QueryPredicate queryPredicate) {
        queryPredicate.getClass();
        return new QueryOptions(queryPredicate, null, null);
    }

    public static QueryOptions matchesAll() {
        return new QueryOptions();
    }

    public static QueryOptions paginated(QueryPaginationInput queryPaginationInput) {
        queryPaginationInput.getClass();
        return new QueryOptions(null, queryPaginationInput, null);
    }

    public static QueryOptions sorted(QuerySortBy... querySortByArr) {
        querySortByArr.getClass();
        return new QueryOptions(null, null, Arrays.asList(querySortByArr));
    }
}
