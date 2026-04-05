package com.google.android.gms.cast.framework.media.internal;

import androidx.annotation.Keep;
import c.f.a.c.d.u.j;
import c.f.a.c.d.u.k;
import c.f.a.c.d.u.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ResourceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, Integer> f24189a;

    static {
        HashMap map = new HashMap();
        map.put("smallIconDrawableResId", Integer.valueOf(k.f11862m));
        map.put("stopLiveStreamDrawableResId", Integer.valueOf(k.f11863n));
        map.put("pauseDrawableResId", Integer.valueOf(k.f11855f));
        map.put("playDrawableResId", Integer.valueOf(k.f11856g));
        map.put("skipNextDrawableResId", Integer.valueOf(k.f11860k));
        map.put("skipPrevDrawableResId", Integer.valueOf(k.f11861l));
        map.put("forwardDrawableResId", Integer.valueOf(k.f11852c));
        map.put("forward10DrawableResId", Integer.valueOf(k.f11853d));
        map.put("forward30DrawableResId", Integer.valueOf(k.f11854e));
        map.put("rewindDrawableResId", Integer.valueOf(k.f11857h));
        map.put("rewind10DrawableResId", Integer.valueOf(k.f11858i));
        map.put("rewind30DrawableResId", Integer.valueOf(k.f11859j));
        map.put("disconnectDrawableResId", Integer.valueOf(k.f11851b));
        map.put("notificationImageSizeDimenResId", Integer.valueOf(j.f11844c));
        map.put("castingToDeviceStringResId", Integer.valueOf(n.f11885b));
        map.put("stopLiveStreamStringResId", Integer.valueOf(n.u));
        map.put("pauseStringResId", Integer.valueOf(n.f11896m));
        map.put("playStringResId", Integer.valueOf(n.f11897n));
        map.put("skipNextStringResId", Integer.valueOf(n.r));
        map.put("skipPrevStringResId", Integer.valueOf(n.s));
        map.put("forwardStringResId", Integer.valueOf(n.f11891h));
        map.put("forward10StringResId", Integer.valueOf(n.f11892i));
        map.put("forward30StringResId", Integer.valueOf(n.f11893j));
        map.put("rewindStringResId", Integer.valueOf(n.f11898o));
        map.put("rewind10StringResId", Integer.valueOf(n.p));
        map.put("rewind30StringResId", Integer.valueOf(n.q));
        map.put("disconnectStringResId", Integer.valueOf(n.f11888e));
        f24189a = Collections.unmodifiableMap(map);
    }

    @Keep
    public static Integer findResourceByName(String str) {
        if (str == null) {
            return null;
        }
        return f24189a.get(str);
    }
}
