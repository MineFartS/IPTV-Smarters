package com.amplifyframework.core.model.query.predicate;

import a.i.q.d;
import com.amplifyframework.core.model.query.predicate.QueryOperator;
import java.lang.Comparable;

/* JADX INFO: loaded from: classes.dex */
public final class LessThanQueryOperator<T extends Comparable<T>> extends QueryOperator<T> {
    private final T value;

    public LessThanQueryOperator(T t) {
        super(QueryOperator.Type.LESS_THAN);
        this.value = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LessThanQueryOperator.class != obj.getClass()) {
            return false;
        }
        LessThanQueryOperator lessThanQueryOperator = (LessThanQueryOperator) obj;
        return d.a(type(), lessThanQueryOperator.type()) && d.a(value(), lessThanQueryOperator.value());
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(T t) {
        return t.compareTo(this.value) < 0;
    }

    public int hashCode() {
        return d.b(type(), value());
    }

    public String toString() {
        return "LessThanQueryOperator { type: " + type() + ", value: " + value() + " }";
    }

    public T value() {
        return this.value;
    }
}
