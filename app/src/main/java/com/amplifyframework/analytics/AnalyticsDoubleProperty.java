package com.amplifyframework.analytics;

import a.i.q.d;

/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsDoubleProperty implements AnalyticsPropertyBehavior<Double> {
    private final Double value;

    private AnalyticsDoubleProperty(Double d2) {
        this.value = d2;
    }

    public static AnalyticsDoubleProperty from(Double d2) {
        d2.getClass();
        return new AnalyticsDoubleProperty(d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnalyticsDoubleProperty.class != obj.getClass()) {
            return false;
        }
        return d.a(getValue(), ((AnalyticsDoubleProperty) obj).getValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amplifyframework.analytics.AnalyticsPropertyBehavior
    public Double getValue() {
        return this.value;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return "AnalyticsDoubleProperty{value=" + this.value + '}';
    }
}
