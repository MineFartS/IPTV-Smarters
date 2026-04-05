package com.amplifyframework.hub;

import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.hub.HubEventFilters;

/* JADX INFO: loaded from: classes.dex */
public final class HubEventFilters {
    private HubEventFilters() {
        throw new UnsupportedOperationException("No instances of the HubEventFilters utility, please.");
    }

    public static HubEventFilter all(final HubEventFilter... hubEventFilterArr) {
        return new HubEventFilter() { // from class: c.b.d.g
            @Override // com.amplifyframework.hub.HubEventFilter
            public final boolean filter(HubEvent hubEvent) {
                return HubEventFilters.lambda$all$1(hubEventFilterArr, hubEvent);
            }
        };
    }

    public static HubEventFilter always() {
        return new HubEventFilter() { // from class: c.b.d.c
            @Override // com.amplifyframework.hub.HubEventFilter
            public final boolean filter(HubEvent hubEvent) {
                return HubEventFilters.lambda$always$0(hubEvent);
            }
        };
    }

    public static HubEventFilter and(final HubEventFilter hubEventFilter, final HubEventFilter hubEventFilter2) {
        hubEventFilter.getClass();
        hubEventFilter2.getClass();
        return new HubEventFilter() { // from class: c.b.d.d
            @Override // com.amplifyframework.hub.HubEventFilter
            public final boolean filter(HubEvent hubEvent) {
                return HubEventFilters.lambda$and$3(hubEventFilter, hubEventFilter2, hubEvent);
            }
        };
    }

    public static HubEventFilter any(final HubEventFilter... hubEventFilterArr) {
        return new HubEventFilter() { // from class: c.b.d.f
            @Override // com.amplifyframework.hub.HubEventFilter
            public final boolean filter(HubEvent hubEvent) {
                return HubEventFilters.lambda$any$2(hubEventFilterArr, hubEvent);
            }
        };
    }

    public static /* synthetic */ boolean lambda$all$1(HubEventFilter[] hubEventFilterArr, HubEvent hubEvent) {
        boolean zFilter = true;
        for (HubEventFilter hubEventFilter : hubEventFilterArr) {
            if (hubEventFilter != null) {
                zFilter &= hubEventFilter.filter(hubEvent);
            }
        }
        return zFilter;
    }

    public static /* synthetic */ boolean lambda$always$0(HubEvent hubEvent) {
        return true;
    }

    public static /* synthetic */ boolean lambda$and$3(HubEventFilter hubEventFilter, HubEventFilter hubEventFilter2, HubEvent hubEvent) {
        return hubEventFilter.filter(hubEvent) && hubEventFilter2.filter(hubEvent);
    }

    public static /* synthetic */ boolean lambda$any$2(HubEventFilter[] hubEventFilterArr, HubEvent hubEvent) {
        boolean zFilter = false;
        for (HubEventFilter hubEventFilter : hubEventFilterArr) {
            if (hubEventFilter != null) {
                zFilter |= hubEventFilter.filter(hubEvent);
            }
        }
        return zFilter;
    }

    public static /* synthetic */ boolean lambda$or$4(HubEventFilter hubEventFilter, HubEventFilter hubEventFilter2, HubEvent hubEvent) {
        return hubEventFilter.filter(hubEvent) || hubEventFilter2.filter(hubEvent);
    }

    public static HubEventFilter or(final HubEventFilter hubEventFilter, final HubEventFilter hubEventFilter2) {
        hubEventFilter.getClass();
        hubEventFilter2.getClass();
        return new HubEventFilter() { // from class: c.b.d.e
            @Override // com.amplifyframework.hub.HubEventFilter
            public final boolean filter(HubEvent hubEvent) {
                return HubEventFilters.lambda$or$4(hubEventFilter, hubEventFilter2, hubEvent);
            }
        };
    }
}
