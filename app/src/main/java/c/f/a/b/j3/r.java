package c.f.a.b.j3;

import android.os.SystemClock;
import android.text.TextUtils;
import c.f.a.b.a2;
import c.f.a.b.e3.a1;
import c.f.a.b.e3.z0;
import c.f.a.b.g3.j;
import c.f.a.b.k1;
import c.f.a.b.p1;
import c.f.a.b.p2;
import c.f.a.b.q1;
import c.f.a.b.s2.i1;
import c.f.a.b.s2.j1;
import c.f.a.b.x1;
import c.f.a.b.z1;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class r implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NumberFormat f9267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.g3.j f9268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2.c f9270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2.b f9271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9272f;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f9267a = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public r(c.f.a.b.g3.j jVar) {
        this(jVar, "EventLogger");
    }

    public r(c.f.a.b.g3.j jVar, String str) {
        this.f9268b = jVar;
        this.f9269c = str;
        this.f9270d = new p2.c();
        this.f9271e = new p2.b();
        this.f9272f = SystemClock.elapsedRealtime();
    }

    public static String A0(long j2) {
        return j2 == -9223372036854775807L ? "?" : f9267a.format(j2 / 1000.0f);
    }

    public static String B0(int i2) {
        return i2 != 0 ? i2 != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED";
    }

    public static String C0(c.f.a.b.g3.k kVar, z0 z0Var, int i2) {
        return D0((kVar == null || kVar.a() != z0Var || kVar.s(i2) == -1) ? false : true);
    }

    public static String D0(boolean z) {
        return z ? "[X]" : "[ ]";
    }

    public static String r0(int i2, int i3) {
        if (i2 < 2) {
            return "N/A";
        }
        if (i3 == 0) {
            return "NO";
        }
        if (i3 == 8) {
            return "YES_NOT_SEAMLESS";
        }
        if (i3 == 16) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static String s0(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "?" : "INTERNAL" : "REMOVE" : "SKIP" : "SEEK_ADJUSTMENT" : "SEEK" : "AUTO_TRANSITION";
    }

    public static String v0(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT";
    }

    public static String w0(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST";
    }

    public static String x0(int i2) {
        return i2 != 0 ? i2 != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE";
    }

    public static String y0(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? "?" : "ALL" : "ONE" : "OFF";
    }

    public static String z0(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    @Override // c.f.a.b.s2.j1
    public void A(j1.a aVar, c.f.a.b.b3.a aVar2) {
        G0("metadata [" + u0(aVar));
        L0(aVar2, "  ");
        G0("]");
    }

    @Override // c.f.a.b.s2.j1
    public void B(j1.a aVar, int i2) {
        F0(aVar, "repeatMode", y0(i2));
    }

    @Override // c.f.a.b.s2.j1
    public void C(j1.a aVar, c.f.a.b.t2.p pVar) {
        F0(aVar, "audioAttributes", pVar.f10156c + "," + pVar.f10157d + "," + pVar.f10158e + "," + pVar.f10159f);
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void D(j1.a aVar) {
        i1.o(this, aVar);
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void E(a2 a2Var, j1.b bVar) {
        i1.l(this, a2Var, bVar);
    }

    public final void E0(j1.a aVar, String str) {
        G0(t0(aVar, str, null, null));
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void F(j1.a aVar, boolean z, int i2) {
        i1.p(this, aVar, z, i2);
    }

    public final void F0(j1.a aVar, String str, String str2) {
        G0(t0(aVar, str, str2, null));
    }

    @Override // c.f.a.b.s2.j1
    public void G(j1.a aVar, c.f.a.b.k3.e0 e0Var) {
        F0(aVar, "videoSize", e0Var.f9371c + ", " + e0Var.f9372d);
    }

    public void G0(String str) {
        z.b(this.f9269c, str);
    }

    @Override // c.f.a.b.s2.j1
    public void H(j1.a aVar, int i2) {
        F0(aVar, "state", z0(i2));
    }

    public final void H0(j1.a aVar, String str, String str2, Throwable th) {
        J0(t0(aVar, str, str2, th));
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void I(j1.a aVar, k1 k1Var) {
        i1.c(this, aVar, k1Var);
    }

    public final void I0(j1.a aVar, String str, Throwable th) {
        J0(t0(aVar, str, null, th));
    }

    @Override // c.f.a.b.s2.j1
    public void J(j1.a aVar) {
        E0(aVar, "drmKeysLoaded");
    }

    public void J0(String str) {
        z.d(this.f9269c, str);
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void K(j1.a aVar, k1 k1Var) {
        i1.x(this, aVar, k1Var);
    }

    public final void K0(j1.a aVar, String str, Exception exc) {
        H0(aVar, "internalError", str, exc);
    }

    @Override // c.f.a.b.s2.j1
    public void L(j1.a aVar, c.f.a.b.e3.a0 a0Var, c.f.a.b.e3.d0 d0Var) {
    }

    public final void L0(c.f.a.b.b3.a aVar, String str) {
        for (int i2 = 0; i2 < aVar.e(); i2++) {
            G0(str + aVar.d(i2));
        }
    }

    @Override // c.f.a.b.s2.j1
    public void M(j1.a aVar, a1 a1Var, c.f.a.b.g3.l lVar) {
        String str;
        c.f.a.b.g3.j jVar = this.f9268b;
        j.a aVarG = jVar != null ? jVar.g() : null;
        if (aVarG == null) {
            F0(aVar, "tracks", "[]");
            return;
        }
        G0("tracks [" + u0(aVar));
        int iC = aVarG.c();
        int i2 = 0;
        while (true) {
            String str2 = "  ]";
            String str3 = " [";
            if (i2 >= iC) {
                break;
            }
            a1 a1VarG = aVarG.g(i2);
            c.f.a.b.g3.k kVarA = lVar.a(i2);
            int i3 = iC;
            if (a1VarG.f6903c == 0) {
                str = "  " + aVarG.d(i2) + " []";
            } else {
                G0("  " + aVarG.d(i2) + " [");
                int i4 = 0;
                while (i4 < a1VarG.f6903c) {
                    z0 z0VarB = a1VarG.b(i4);
                    a1 a1Var2 = a1VarG;
                    String str4 = str2;
                    G0("    Group:" + i4 + ", adaptive_supported=" + r0(z0VarB.f8056b, aVarG.a(i2, i4, false)) + str3);
                    int i5 = 0;
                    while (i5 < z0VarB.f8056b) {
                        G0("      " + C0(kVarA, z0VarB, i5) + " Track:" + i5 + ", " + k1.f(z0VarB.b(i5)) + ", supported=" + c.f.a.b.w0.c(aVarG.h(i2, i4, i5)));
                        i5++;
                        str3 = str3;
                    }
                    G0("    ]");
                    i4++;
                    a1VarG = a1Var2;
                    str2 = str4;
                }
                String str5 = str2;
                if (kVarA != null) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= kVarA.length()) {
                            break;
                        }
                        c.f.a.b.b3.a aVar2 = kVarA.g(i6).f9336k;
                        if (aVar2 != null) {
                            G0("    Metadata [");
                            L0(aVar2, "      ");
                            G0("    ]");
                            break;
                        }
                        i6++;
                    }
                }
                str = str5;
            }
            G0(str);
            i2++;
            iC = i3;
        }
        String str6 = " [";
        a1 a1VarJ = aVarG.j();
        if (a1VarJ.f6903c > 0) {
            G0("  Unmapped [");
            int i7 = 0;
            while (i7 < a1VarJ.f6903c) {
                StringBuilder sb = new StringBuilder();
                sb.append("    Group:");
                sb.append(i7);
                String str7 = str6;
                sb.append(str7);
                G0(sb.toString());
                z0 z0VarB2 = a1VarJ.b(i7);
                for (int i8 = 0; i8 < z0VarB2.f8056b; i8++) {
                    G0("      " + D0(false) + " Track:" + i8 + ", " + k1.f(z0VarB2.b(i8)) + ", supported=" + c.f.a.b.w0.c(0));
                }
                G0("    ]");
                i7++;
                str6 = str7;
            }
            G0("  ]");
        }
        G0("]");
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void N(j1.a aVar, long j2) {
        i1.d(this, aVar, j2);
    }

    @Override // c.f.a.b.s2.j1
    public void O(j1.a aVar, int i2, int i3) {
        F0(aVar, "surfaceSize", i2 + ", " + i3);
    }

    @Override // c.f.a.b.s2.j1
    public void P(j1.a aVar, boolean z) {
        F0(aVar, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // c.f.a.b.s2.j1
    public void Q(j1.a aVar, boolean z) {
        F0(aVar, "isPlaying", Boolean.toString(z));
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void R(j1.a aVar, Exception exc) {
        i1.a(this, aVar, exc);
    }

    @Override // c.f.a.b.s2.j1
    public void S(j1.a aVar, c.f.a.b.e3.d0 d0Var) {
        F0(aVar, "downstreamFormat", k1.f(d0Var.f6989c));
    }

    @Override // c.f.a.b.s2.j1
    public void T(j1.a aVar, c.f.a.b.e3.a0 a0Var, c.f.a.b.e3.d0 d0Var) {
    }

    @Override // c.f.a.b.s2.j1
    public void U(j1.a aVar, c.f.a.b.e3.d0 d0Var) {
        F0(aVar, "upstreamDiscarded", k1.f(d0Var.f6989c));
    }

    @Override // c.f.a.b.s2.j1
    public void V(j1.a aVar, int i2, long j2) {
        F0(aVar, "droppedFrames", Integer.toString(i2));
    }

    @Override // c.f.a.b.s2.j1
    public void W(j1.a aVar, a2.f fVar, a2.f fVar2, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("reason=");
        sb.append(s0(i2));
        sb.append(", PositionInfo:old [");
        sb.append("window=");
        sb.append(fVar.f6404c);
        sb.append(", period=");
        sb.append(fVar.f6406e);
        sb.append(", pos=");
        sb.append(fVar.f6407f);
        if (fVar.f6409h != -1) {
            sb.append(", contentPos=");
            sb.append(fVar.f6408g);
            sb.append(", adGroup=");
            sb.append(fVar.f6409h);
            sb.append(", ad=");
            sb.append(fVar.f6410i);
        }
        sb.append("], PositionInfo:new [");
        sb.append("window=");
        sb.append(fVar2.f6404c);
        sb.append(", period=");
        sb.append(fVar2.f6406e);
        sb.append(", pos=");
        sb.append(fVar2.f6407f);
        if (fVar2.f6409h != -1) {
            sb.append(", contentPos=");
            sb.append(fVar2.f6408g);
            sb.append(", adGroup=");
            sb.append(fVar2.f6409h);
            sb.append(", ad=");
            sb.append(fVar2.f6410i);
        }
        sb.append("]");
        F0(aVar, "positionDiscontinuity", sb.toString());
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void X(j1.a aVar, Exception exc) {
        i1.e(this, aVar, exc);
    }

    @Override // c.f.a.b.s2.j1
    public void Y(j1.a aVar, boolean z) {
        F0(aVar, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // c.f.a.b.s2.j1
    public void Z(j1.a aVar, String str) {
        F0(aVar, "audioDecoderReleased", str);
    }

    @Override // c.f.a.b.s2.j1
    public void a(j1.a aVar, int i2, long j2, long j3) {
    }

    @Override // c.f.a.b.s2.j1
    public void a0(j1.a aVar, boolean z, int i2) {
        F0(aVar, "playWhenReady", z + ", " + w0(i2));
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void b(j1.a aVar, int i2, int i3, int i4, float f2) {
        i1.y(this, aVar, i2, i3, i4, f2);
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void b0(j1.a aVar, String str, long j2, long j3) {
        i1.v(this, aVar, str, j2, j3);
    }

    @Override // c.f.a.b.s2.j1
    public void c(j1.a aVar, String str) {
        F0(aVar, "videoDecoderReleased", str);
    }

    @Override // c.f.a.b.s2.j1
    public void c0(j1.a aVar, k1 k1Var, c.f.a.b.v2.g gVar) {
        F0(aVar, "videoInputFormat", k1.f(k1Var));
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void d(j1.a aVar, int i2, k1 k1Var) {
        i1.j(this, aVar, i2, k1Var);
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void d0(j1.a aVar, Exception exc) {
        i1.u(this, aVar, exc);
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void e(j1.a aVar, long j2, int i2) {
        i1.w(this, aVar, j2, i2);
    }

    @Override // c.f.a.b.s2.j1
    public void e0(j1.a aVar, int i2) {
        int i3 = aVar.f9894b.i();
        int iP = aVar.f9894b.p();
        G0("timeline [" + u0(aVar) + ", periodCount=" + i3 + ", windowCount=" + iP + ", reason=" + B0(i2));
        for (int i4 = 0; i4 < Math.min(i3, 3); i4++) {
            aVar.f9894b.f(i4, this.f9271e);
            G0("  period [" + A0(this.f9271e.j()) + "]");
        }
        if (i3 > 3) {
            G0("  ...");
        }
        for (int i5 = 0; i5 < Math.min(iP, 3); i5++) {
            aVar.f9894b.n(i5, this.f9270d);
            G0("  window [" + A0(this.f9270d.d()) + ", seekable=" + this.f9270d.f9720l + ", dynamic=" + this.f9270d.f9721m + "]");
        }
        if (iP > 3) {
            G0("  ...");
        }
        G0("]");
    }

    @Override // c.f.a.b.s2.j1
    public void f(j1.a aVar, int i2) {
        F0(aVar, "drmSessionAcquired", "state=" + i2);
    }

    @Override // c.f.a.b.s2.j1
    public void f0(j1.a aVar, String str, long j2) {
        F0(aVar, "videoDecoderInitialized", str);
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void g(j1.a aVar) {
        i1.r(this, aVar);
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void g0(j1.a aVar) {
        i1.s(this, aVar);
    }

    @Override // c.f.a.b.s2.j1
    public void h(j1.a aVar, c.f.a.b.e3.a0 a0Var, c.f.a.b.e3.d0 d0Var) {
    }

    @Override // c.f.a.b.s2.j1
    public void h0(j1.a aVar, p1 p1Var, int i2) {
        G0("mediaItem [" + u0(aVar) + ", reason=" + v0(i2) + "]");
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void i(j1.a aVar, int i2, String str, long j2) {
        i1.i(this, aVar, i2, str, j2);
    }

    @Override // c.f.a.b.s2.j1
    public void i0(j1.a aVar, k1 k1Var, c.f.a.b.v2.g gVar) {
        F0(aVar, "audioInputFormat", k1.f(k1Var));
    }

    @Override // c.f.a.b.s2.j1
    public void j(j1.a aVar, x1 x1Var) {
        I0(aVar, "playerFailed", x1Var);
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void j0(j1.a aVar, a2.b bVar) {
        i1.f(this, aVar, bVar);
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void k(j1.a aVar, int i2) {
        i1.q(this, aVar, i2);
    }

    @Override // c.f.a.b.s2.j1
    public void k0(j1.a aVar, Object obj, long j2) {
        F0(aVar, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // c.f.a.b.s2.j1
    public void l(j1.a aVar, Exception exc) {
        K0(aVar, "drmSessionManagerError", exc);
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void l0(j1.a aVar, int i2, c.f.a.b.v2.d dVar) {
        i1.g(this, aVar, i2, dVar);
    }

    @Override // c.f.a.b.s2.j1
    public void m(j1.a aVar) {
        E0(aVar, "drmSessionReleased");
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void m0(j1.a aVar, List list) {
        i1.t(this, aVar, list);
    }

    @Override // c.f.a.b.s2.j1
    public void n(j1.a aVar) {
        E0(aVar, "drmKeysRestored");
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void n0(j1.a aVar) {
        i1.k(this, aVar);
    }

    @Override // c.f.a.b.s2.j1
    public void o(j1.a aVar, int i2) {
        F0(aVar, "playbackSuppressionReason", x0(i2));
    }

    @Override // c.f.a.b.s2.j1
    public void o0(j1.a aVar, boolean z) {
        F0(aVar, "loading", Boolean.toString(z));
    }

    @Override // c.f.a.b.s2.j1
    public void p(j1.a aVar, z1 z1Var) {
        F0(aVar, "playbackParameters", z1Var.toString());
    }

    @Override // c.f.a.b.s2.j1
    public void p0(j1.a aVar, c.f.a.b.v2.d dVar) {
        E0(aVar, "videoDisabled");
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void q(j1.a aVar, boolean z) {
        i1.m(this, aVar, z);
    }

    @Override // c.f.a.b.s2.j1
    public void q0(j1.a aVar) {
        E0(aVar, "drmKeysRemoved");
    }

    @Override // c.f.a.b.s2.j1
    public void r(j1.a aVar, int i2, long j2, long j3) {
        H0(aVar, "audioTrackUnderrun", i2 + ", " + j2 + ", " + j3, null);
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void s(j1.a aVar, q1 q1Var) {
        i1.n(this, aVar, q1Var);
    }

    @Override // c.f.a.b.s2.j1
    public void t(j1.a aVar, c.f.a.b.v2.d dVar) {
        E0(aVar, "audioDisabled");
    }

    public final String t0(j1.a aVar, String str, String str2, Throwable th) {
        String str3 = str + " [" + u0(aVar);
        if (th instanceof x1) {
            str3 = str3 + ", errorCode=" + ((x1) th).a();
        }
        if (str2 != null) {
            str3 = str3 + ", " + str2;
        }
        String strF = z.f(th);
        if (!TextUtils.isEmpty(strF)) {
            str3 = str3 + "\n  " + strF.replace("\n", "\n  ") + '\n';
        }
        return str3 + "]";
    }

    @Override // c.f.a.b.s2.j1
    public void u(j1.a aVar, c.f.a.b.v2.d dVar) {
        E0(aVar, "audioEnabled");
    }

    public final String u0(j1.a aVar) {
        String str = "window=" + aVar.f9895c;
        if (aVar.f9896d != null) {
            str = str + ", period=" + aVar.f9894b.b(aVar.f9896d.f7476a);
            if (aVar.f9896d.b()) {
                str = (str + ", adGroup=" + aVar.f9896d.f7477b) + ", ad=" + aVar.f9896d.f7478c;
            }
        }
        return "eventTime=" + A0(aVar.f9893a - this.f9272f) + ", mediaPos=" + A0(aVar.f9897e) + ", " + str;
    }

    @Override // c.f.a.b.s2.j1
    public void v(j1.a aVar, c.f.a.b.e3.a0 a0Var, c.f.a.b.e3.d0 d0Var, IOException iOException, boolean z) {
        K0(aVar, "loadError", iOException);
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void w(j1.a aVar, int i2, c.f.a.b.v2.d dVar) {
        i1.h(this, aVar, i2, dVar);
    }

    @Override // c.f.a.b.s2.j1
    public void x(j1.a aVar, c.f.a.b.v2.d dVar) {
        E0(aVar, "videoEnabled");
    }

    @Override // c.f.a.b.s2.j1
    public /* synthetic */ void y(j1.a aVar, String str, long j2, long j3) {
        i1.b(this, aVar, str, j2, j3);
    }

    @Override // c.f.a.b.s2.j1
    public void z(j1.a aVar, String str, long j2) {
        F0(aVar, "audioDecoderInitialized", str);
    }
}
