package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class hj extends ig {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ih<fs> f21922h = new ih<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f21923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f21924j;

    public hj(hc hcVar, k kVar, int i2, Context context, f fVar) {
        super(hcVar, "1EA+kmHznPumSxbhAp5gNBZCuE/8gd/8nXHr3+4N+BC7/aHUweFYbF77Za3km6PL", "n+EIVanZgVE5bWZK/bmUeAKMrsDwbmyGU+LX/MkMxZ0=", kVar, i2, 27);
        this.f21923i = context;
        this.f21924j = fVar;
    }

    public static String c(f fVar) {
        if (fVar == null || !fVar.g() || hf.f(fVar.e().d())) {
            return null;
        }
        return fVar.e().d();
    }

    private final String d() {
        try {
            if (this.f21953a.j() != null) {
                this.f21953a.j().get();
            }
            u uVarC = this.f21953a.c();
            if (uVarC == null || !uVarC.ad()) {
                return null;
            }
            return uVarC.f();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    private final boolean e() {
        return this.f21953a.l();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ig
    public final void a() {
        Boolean boolValueOf;
        i iVar;
        String strD;
        fs fsVar;
        AtomicReference<fs> atomicReferenceA = f21922h.a(this.f21923i.getPackageName());
        synchronized (atomicReferenceA) {
            fs fsVar2 = atomicReferenceA.get();
            if (fsVar2 == null || hf.f(fsVar2.f21806a) || fsVar2.f21806a.equals("E") || fsVar2.f21806a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (hf.f(c(this.f21924j))) {
                    f fVar = this.f21924j;
                    if (hf.f(c(fVar))) {
                        boolValueOf = Boolean.valueOf(fVar != null && fVar.f() && fVar.d().d() == i.ENUM_SIGNAL_SOURCE_GASS);
                    } else {
                        boolValueOf = Boolean.FALSE;
                    }
                    iVar = (boolValueOf.booleanValue() && e()) ? i.ENUM_SIGNAL_SOURCE_GASS : i.ENUM_SIGNAL_SOURCE_ADSHIELD;
                } else {
                    iVar = i.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
                }
                Boolean boolValueOf2 = Boolean.valueOf(iVar == i.ENUM_SIGNAL_SOURCE_ADSHIELD);
                Boolean boolF = aoo.f20299b.f();
                String strB = aoo.f20298a.f().booleanValue() ? b() : null;
                if (boolF.booleanValue() && e() && hf.f(strB)) {
                    strB = d();
                }
                fs fsVar3 = new fs((String) this.f21957e.invoke(null, this.f21923i, boolValueOf2, strB));
                if (hf.f(fsVar3.f21806a) || fsVar3.f21806a.equals("E")) {
                    int iOrdinal = iVar.ordinal();
                    if (iOrdinal == 3) {
                        strD = d();
                        if (!hf.f(strD)) {
                            fsVar3.f21806a = strD;
                        }
                    } else if (iOrdinal == 4) {
                        strD = this.f21924j.e().d();
                        fsVar3.f21806a = strD;
                    }
                }
                atomicReferenceA.set(fsVar3);
            }
            fsVar = atomicReferenceA.get();
        }
        synchronized (this.f21956d) {
            if (fsVar != null) {
                this.f21956d.s(fsVar.f21806a);
                this.f21956d.V(fsVar.f21807b);
                this.f21956d.W(fsVar.f21808c);
                this.f21956d.e(fsVar.f21809d);
                this.f21956d.r(fsVar.f21810e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String b() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrH = hf.h(aoo.f20300c.f());
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrH)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(hf.h(aoo.f20301d.f()))));
            }
            Context context = this.f21923i;
            String packageName = context.getPackageName();
            this.f21953a.i();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final awq awqVarP = awq.p();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.ads.interactivemedia.v3.internal.ii
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    awq awqVar = awqVarP;
                    if (list == null) {
                        awqVar.j(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ApkChecksum apkChecksum = (ApkChecksum) list.get(i2);
                            if (apkChecksum.getType() == 8) {
                                awqVar.j(hf.b(apkChecksum.getValue()));
                                return;
                            }
                        }
                        awqVar.j(null);
                    } catch (Throwable unused) {
                        awqVar.j(null);
                    }
                }
            });
            return (String) awqVarP.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
