package com.amplifyframework.core.model.query.predicate;

import a.i.q.d;
import com.amplifyframework.core.model.query.predicate.QueryPredicateGroup;
import com.amplifyframework.util.FieldFinder;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class QueryPredicateOperation<T> implements QueryPredicate {
    private final String field;
    private final String modelName;
    private final QueryOperator<T> operator;

    public QueryPredicateOperation(String str, QueryOperator<T> queryOperator) {
        this(null, str, queryOperator);
    }

    public QueryPredicateOperation(String str, String str2, QueryOperator<T> queryOperator) {
        this.modelName = str;
        str2.getClass();
        this.field = str2;
        queryOperator.getClass();
        this.operator = queryOperator;
    }

    public static QueryPredicateGroup not(QueryPredicateOperation<?> queryPredicateOperation) {
        return new QueryPredicateGroup(QueryPredicateGroup.Type.NOT, Collections.singletonList(queryPredicateOperation));
    }

    @Override // com.amplifyframework.core.model.query.predicate.QueryPredicate
    public QueryPredicateGroup and(QueryPredicate queryPredicate) {
        return new QueryPredicateGroup(QueryPredicateGroup.Type.AND, Arrays.asList(this, queryPredicate));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QueryPredicateOperation.class != obj.getClass()) {
            return false;
        }
        QueryPredicateOperation queryPredicateOperation = (QueryPredicateOperation) obj;
        return d.a(modelName(), queryPredicateOperation.modelName()) && d.a(field(), queryPredicateOperation.field()) && d.a(operator(), queryPredicateOperation.operator());
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(Object obj) {
        try {
            return this.operator.evaluate((T) FieldFinder.extractFieldValue(obj, this.field));
        } catch (ClassCastException e2) {
            throw new IllegalArgumentException(this.field + " field inside provided object cannot be evaluated by the operator type: " + this.operator.type().name(), e2);
        } catch (Exception unused) {
            return false;
        }
    }

    public String field() {
        return this.field;
    }

    public int hashCode() {
        return d.b(modelName(), field(), operator());
    }

    public String modelName() {
        return this.modelName;
    }

    public QueryOperator<T> operator() {
        return this.operator;
    }

    @Override // com.amplifyframework.core.model.query.predicate.QueryPredicate
    public QueryPredicateGroup or(QueryPredicate queryPredicate) {
        return new QueryPredicateGroup(QueryPredicateGroup.Type.OR, Arrays.asList(this, queryPredicate));
    }

    public String toString() {
        return "QueryPredicateOperation { model: " + modelName() + ", field: " + field() + ", operator: " + operator() + " }";
    }
}
