package com.amplifyframework.core.model.query.predicate;

import a.i.q.d;
import com.amplifyframework.core.model.query.predicate.QueryOperator;
import java.lang.Comparable;

/* JADX INFO: loaded from: classes.dex */
public final class BetweenQueryOperator<T extends Comparable<T>> extends QueryOperator<T> {
    private final T end;
    private final T start;

    public BetweenQueryOperator(T t, T t2) {
        super(QueryOperator.Type.BETWEEN);
        this.start = t;
        this.end = t2;
    }

    public T end() {
        return this.end;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BetweenQueryOperator.class != obj.getClass()) {
            return false;
        }
        BetweenQueryOperator betweenQueryOperator = (BetweenQueryOperator) obj;
        return d.a(type(), betweenQueryOperator.type()) && d.a(start(), betweenQueryOperator.start()) && d.a(end(), betweenQueryOperator.end());
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(T t) {
        return t.compareTo(this.start) >= 0 && t.compareTo(this.end) <= 0;
    }

    public int hashCode() {
        return d.b(type(), start(), end());
    }

    public T start() {
        return this.start;
    }

    public String toString() {
        return "BetweenQueryOperator { type: " + type() + ", start: " + this.start + ", end: " + this.end + " }";
    }
}
