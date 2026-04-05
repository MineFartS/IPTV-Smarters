package com.amplifyframework.analytics;

import a.i.q.d;

/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsIntegerProperty implements AnalyticsPropertyBehavior<Integer> {
    private final Integer value;

    private AnalyticsIntegerProperty(Integer num) {
        this.value = num;
    }

    public static AnalyticsIntegerProperty from(Integer num) {
        num.getClass();
        return new AnalyticsIntegerProperty(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnalyticsIntegerProperty.class != obj.getClass()) {
            return false;
        }
        return d.a(getValue(), ((AnalyticsIntegerProperty) obj).getValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amplifyframework.analytics.AnalyticsPropertyBehavior
    public Integer getValue() {
        return this.value;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return "AnalyticsIntegerProperty{value=" + this.value + '}';
    }
}
