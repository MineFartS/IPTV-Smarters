package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.UiElement;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class dw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bfg f21678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final du f21679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f21680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dv f21682e;

    static {
        bfh bfhVar = new bfh();
        bfhVar.b(UiElement.class, com.google.ads.interactivemedia.v3.impl.data.bl.GSON_TYPE_ADAPTER);
        bfhVar.b(CompanionAdSlot.class, new dt());
        bfhVar.c(new arl());
        f21678a = bfhVar.a();
    }

    public dw(du duVar, dv dvVar, String str) {
        this(duVar, dvVar, str, null);
    }

    public dw(du duVar, dv dvVar, String str, Object obj) {
        this.f21679b = duVar;
        this.f21682e = dvVar;
        this.f21681d = str;
        this.f21680c = obj;
    }

    public static dw c(String str) throws MalformedURLException {
        Uri uri = Uri.parse(str);
        String strSubstring = uri.getPath().substring(1);
        if (uri.getQueryParameter("sid") == null) {
            throw new MalformedURLException("Session id must be provided in message.");
        }
        du duVarA = du.a(strSubstring);
        dv dvVarA = dv.a(uri.getQueryParameter("type"));
        String queryParameter = uri.getQueryParameter("sid");
        bfg bfgVar = f21678a;
        String queryParameter2 = uri.getQueryParameter("data");
        Class cls = com.google.ads.interactivemedia.v3.impl.data.ba.class;
        Object objE = queryParameter2 == null ? null : bfgVar.e(new StringReader(queryParameter2), cls);
        if (Integer.TYPE == cls) {
            cls = Integer.class;
        } else if (Float.TYPE == cls) {
            cls = Float.class;
        } else if (Byte.TYPE == cls) {
            cls = Byte.class;
        } else if (Double.TYPE == cls) {
            cls = Double.class;
        } else if (Long.TYPE == cls) {
            cls = Long.class;
        } else if (Character.TYPE == cls) {
            cls = Character.class;
        } else if (Boolean.TYPE == cls) {
            cls = Boolean.class;
        } else if (Short.TYPE == cls) {
            cls = Short.class;
        } else if (Void.TYPE == cls) {
            cls = Void.class;
        }
        return new dw(duVarA, dvVarA, queryParameter, cls.cast(objE));
    }

    public final du a() {
        return this.f21679b;
    }

    public final dv b() {
        return this.f21682e;
    }

    public final Object d() {
        return this.f21680c;
    }

    public final String e() {
        return this.f21681d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dw)) {
            return false;
        }
        dw dwVar = (dw) obj;
        return this.f21679b == dwVar.f21679b && auv.w(this.f21680c, dwVar.f21680c) && auv.w(this.f21681d, dwVar.f21681d) && this.f21682e == dwVar.f21682e;
    }

    public final String f() {
        aub aubVar = new aub();
        aubVar.b("type", this.f21682e);
        aubVar.b("sid", this.f21681d);
        Object obj = this.f21680c;
        if (obj != null) {
            aubVar.b("data", obj);
        }
        return String.format("%s('%s', %s);", "javascript:adsense.mobileads.afmanotify.receiveMessage", this.f21679b, f21678a.f(aubVar.a()));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21679b, this.f21680c, this.f21681d, this.f21682e});
    }

    public final String toString() {
        return String.format("JavaScriptMessage [command=%s, type=%s, sid=%s, data=%s]", this.f21679b, this.f21682e, this.f21681d, this.f21680c);
    }
}
