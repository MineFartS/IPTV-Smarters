package c.e.b.a.a;

import c.e.b.a.a.g.f;
import c.e.b.a.a.h.g;
import c.e.b.a.a.h.h;
import c.e.b.a.a.h.i;
import c.e.b.a.a.h.j;
import c.e.b.a.a.h.k;
import c.e.b.a.a.h.l;
import c.e.b.a.a.h.m;
import c.e.b.a.a.h.n;
import c.e.b.a.a.h.o;

/* JADX INFO: loaded from: classes.dex */
public class d {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5977a;

        static {
            int[] iArr = new int[e.values().length];
            f5977a = iArr;
            try {
                iArr[e.ROTATING_PLANE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5977a[e.DOUBLE_BOUNCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5977a[e.WAVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5977a[e.WANDERING_CUBES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5977a[e.PULSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5977a[e.CHASING_DOTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5977a[e.THREE_BOUNCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5977a[e.CIRCLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5977a[e.CUBE_GRID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5977a[e.FADING_CIRCLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5977a[e.FOLDING_CUBE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5977a[e.ROTATING_CIRCLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f5977a[e.MULTIPLE_PULSE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f5977a[e.PULSE_RING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f5977a[e.MULTIPLE_PULSE_RING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static f a(e eVar) {
        switch (a.f5977a[eVar.ordinal()]) {
            case 1:
                return new l();
            case 2:
                return new c.e.b.a.a.h.d();
            case 3:
                return new o();
            case 4:
                return new n();
            case 5:
                return new i();
            case 6:
                return new c.e.b.a.a.h.a();
            case 7:
                return new m();
            case 8:
                return new c.e.b.a.a.h.b();
            case 9:
                return new c.e.b.a.a.h.c();
            case 10:
                return new c.e.b.a.a.h.e();
            case 11:
                return new c.e.b.a.a.h.f();
            case 12:
                return new k();
            case 13:
                return new g();
            case 14:
                return new j();
            case 15:
                return new h();
            default:
                return null;
        }
    }
}
