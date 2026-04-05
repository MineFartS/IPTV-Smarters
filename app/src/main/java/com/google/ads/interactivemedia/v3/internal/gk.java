package com.google.ads.interactivemedia.v3.internal;

import android.os.Build;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes.dex */
public final class gk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Boolean f21850b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final hc f21851e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConditionVariable f21848c = new ConditionVariable();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile apz f21847a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile Random f21849d = null;

    public gk(hc hcVar) {
        this.f21851e = hcVar;
        hcVar.i().execute(new gj(this));
    }

    public static final int d() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : f().nextInt();
        } catch (RuntimeException unused) {
            return f().nextInt();
        }
    }

    private static Random f() {
        if (f21849d == null) {
            synchronized (gk.class) {
                if (f21849d == null) {
                    f21849d = new Random();
                }
            }
        }
        return f21849d;
    }

    public final void c(int i2, int i3, long j2, String str, Exception exc) {
        try {
            f21848c.block();
            if (!this.f21850b.booleanValue() || f21847a == null) {
                return;
            }
            a aVarA = d.a();
            aVarA.a(this.f21851e.f21893a.getPackageName());
            aVarA.d(j2);
            if (str != null) {
                aVarA.b(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                aVarA.e(stringWriter.toString());
                aVarA.c(exc.getClass().getName());
            }
            apy apyVarA = f21847a.a(aVarA.ac().ai());
            apyVarA.b(i2);
            if (i3 != -1) {
                apyVarA.c(i3);
            }
            apyVarA.a();
        } catch (Exception unused) {
        }
    }

    public final void e(int i2, long j2, String str) {
        c(i2, -1, j2, str, null);
    }
}
