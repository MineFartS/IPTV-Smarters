package c.f.a.b;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f9790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f9791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f9792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.f.a.b.t2.p f9793d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9795f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f9797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9798i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f9796g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9794e = 0;

    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f9799a;

        public a(Handler handler) {
            this.f9799a = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void b(int i2) {
            s0.this.h(i2);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i2) {
            this.f9799a.post(new Runnable() { // from class: c.f.a.b.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6509b.b(i2);
                }
            });
        }
    }

    public interface b {
        void u(float f2);

        void w(int i2);
    }

    public s0(Context context, Handler handler, b bVar) {
        this.f9790a = (AudioManager) c.f.a.b.j3.g.e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f9792c = bVar;
        this.f9791b = new a(handler);
    }

    public static int e(c.f.a.b.t2.p pVar) {
        if (pVar == null) {
            return 0;
        }
        switch (pVar.f10158e) {
            case 0:
                c.f.a.b.j3.z.i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (pVar.f10156c == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                c.f.a.b.j3.z.i("AudioFocusManager", "Unidentified audio usage: " + pVar.f10158e);
                return 0;
            case 16:
                return c.f.a.b.j3.x0.f9296a >= 19 ? 4 : 2;
        }
    }

    public final void a() {
        this.f9790a.abandonAudioFocus(this.f9791b);
    }

    public final void b() {
        if (this.f9794e == 0) {
            return;
        }
        if (c.f.a.b.j3.x0.f9296a >= 26) {
            c();
        } else {
            a();
        }
        n(0);
    }

    public final void c() {
        AudioFocusRequest audioFocusRequest = this.f9797h;
        if (audioFocusRequest != null) {
            this.f9790a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    public final void f(int i2) {
        b bVar = this.f9792c;
        if (bVar != null) {
            bVar.w(i2);
        }
    }

    public float g() {
        return this.f9796g;
    }

    public final void h(int i2) {
        int i3;
        if (i2 == -3 || i2 == -2) {
            if (i2 == -2 || q()) {
                f(0);
                i3 = 2;
            } else {
                i3 = 3;
            }
            n(i3);
            return;
        }
        if (i2 == -1) {
            f(-1);
            b();
        } else if (i2 == 1) {
            n(1);
            f(1);
        } else {
            c.f.a.b.j3.z.i("AudioFocusManager", "Unknown focus change type: " + i2);
        }
    }

    public void i() {
        this.f9792c = null;
        b();
    }

    public final int j() {
        if (this.f9794e == 1) {
            return 1;
        }
        if ((c.f.a.b.j3.x0.f9296a >= 26 ? l() : k()) == 1) {
            n(1);
            return 1;
        }
        n(0);
        return -1;
    }

    public final int k() {
        return this.f9790a.requestAudioFocus(this.f9791b, c.f.a.b.j3.x0.e0(((c.f.a.b.t2.p) c.f.a.b.j3.g.e(this.f9793d)).f10158e), this.f9795f);
    }

    public final int l() {
        AudioFocusRequest audioFocusRequest = this.f9797h;
        if (audioFocusRequest == null || this.f9798i) {
            this.f9797h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f9795f) : new AudioFocusRequest.Builder(this.f9797h)).setAudioAttributes(((c.f.a.b.t2.p) c.f.a.b.j3.g.e(this.f9793d)).a()).setWillPauseWhenDucked(q()).setOnAudioFocusChangeListener(this.f9791b).build();
            this.f9798i = false;
        }
        return this.f9790a.requestAudioFocus(this.f9797h);
    }

    public void m(c.f.a.b.t2.p pVar) {
        if (c.f.a.b.j3.x0.b(this.f9793d, pVar)) {
            return;
        }
        this.f9793d = pVar;
        int iE = e(pVar);
        this.f9795f = iE;
        boolean z = true;
        if (iE != 1 && iE != 0) {
            z = false;
        }
        c.f.a.b.j3.g.b(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public final void n(int i2) {
        if (this.f9794e == i2) {
            return;
        }
        this.f9794e = i2;
        float f2 = i2 == 3 ? 0.2f : 1.0f;
        if (this.f9796g == f2) {
            return;
        }
        this.f9796g = f2;
        b bVar = this.f9792c;
        if (bVar != null) {
            bVar.u(f2);
        }
    }

    public final boolean o(int i2) {
        return i2 == 1 || this.f9795f != 1;
    }

    public int p(boolean z, int i2) {
        if (o(i2)) {
            b();
            return z ? 1 : -1;
        }
        if (z) {
            return j();
        }
        return -1;
    }

    public final boolean q() {
        c.f.a.b.t2.p pVar = this.f9793d;
        return pVar != null && pVar.f10156c == 1;
    }
}
