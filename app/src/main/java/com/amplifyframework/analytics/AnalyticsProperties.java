package com.amplifyframework.analytics;

import a.i.q.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsProperties implements Iterable<Map.Entry<String, AnalyticsPropertyBehavior<?>>> {
    private final Map<String, AnalyticsPropertyBehavior<?>> properties;

    public static final class Builder {
        private final Map<String, AnalyticsPropertyBehavior<?>> properties = new HashMap();

        public <T, P extends AnalyticsPropertyBehavior<T>> Builder add(String str, P p) {
            str.getClass();
            p.getClass();
            this.properties.put(str, p);
            return this;
        }

        public Builder add(String str, Boolean bool) {
            str.getClass();
            bool.getClass();
            this.properties.put(str, AnalyticsBooleanProperty.from(bool));
            return this;
        }

        public Builder add(String str, Double d2) {
            str.getClass();
            d2.getClass();
            this.properties.put(str, AnalyticsDoubleProperty.from(d2));
            return this;
        }

        public Builder add(String str, Integer num) {
            str.getClass();
            num.getClass();
            this.properties.put(str, AnalyticsIntegerProperty.from(num));
            return this;
        }

        public Builder add(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.properties.put(str, AnalyticsStringProperty.from(str2));
            return this;
        }

        public AnalyticsProperties build() {
            return new AnalyticsProperties(this.properties);
        }
    }

    private AnalyticsProperties(Map<String, AnalyticsPropertyBehavior<?>> map) {
        this.properties = map;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnalyticsProperties.class != obj.getClass()) {
            return false;
        }
        return d.a(this.properties, ((AnalyticsProperties) obj).properties);
    }

    public AnalyticsPropertyBehavior<?> get(String str) {
        if (this.properties.get(str) != null) {
            return this.properties.get(str);
        }
        throw new NoSuchElementException("AnalyticsPropertyBehavior not found " + str);
    }

    public int hashCode() {
        return this.properties.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<String, AnalyticsPropertyBehavior<?>>> iterator() {
        return this.properties.entrySet().iterator();
    }

    public int size() {
        return this.properties.size();
    }

    public String toString() {
        return "AnalyticsProperties{properties=" + this.properties + '}';
    }
}
