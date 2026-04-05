package com.amplifyframework.core.model.query.predicate;

import a.i.q.d;
import com.amplifyframework.core.model.query.predicate.QueryOperator;
import java.lang.Comparable;

/* JADX INFO: loaded from: classes.dex */
public final class LessOrEqualQueryOperator<T extends Comparable<T>> extends QueryOperator<T> {
    private final T value;

    public LessOrEqualQueryOperator(T t) {
        super(QueryOperator.Type.LESS_OR_EQUAL);
        this.value = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LessOrEqualQueryOperator.class != obj.getClass()) {
            return false;
        }
        LessOrEqualQueryOperator lessOrEqualQueryOperator = (LessOrEqualQueryOperator) obj;
        return d.a(type(), lessOrEqualQueryOperator.type()) && d.a(value(), lessOrEqualQueryOperator.value());
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(T t) {
        return t.compareTo(this.value) <= 0;
    }

    public int hashCode() {
        return d.b(type(), value());
    }

    public String toString() {
        return "LessOrEqualQueryOperator { type: " + type() + ", value: " + value() + " }";
    }

    public T value() {
        return this.value;
    }
}
