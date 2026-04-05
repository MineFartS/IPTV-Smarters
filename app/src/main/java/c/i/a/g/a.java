package c.i.a.g;

import android.R;
import android.animation.Animator;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import c.i.a.f.e;
import c.i.a.f.g;
import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayerView;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class a implements c.i.a.g.b, g, e, View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final YouTubePlayerView f18103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.i.a.f.c f18104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.i.a.g.c.b f18105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f18106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f18107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f18108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f18109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f18110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f18111j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f18112k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ProgressBar f18113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f18114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f18115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f18116o;
    public ImageView p;
    public ImageView q;
    public ImageView r;
    public SeekBar s;
    public View.OnClickListener t;
    public View.OnClickListener u;
    public boolean v = false;
    public boolean w = true;
    public boolean x = false;
    public boolean y = true;
    public boolean z = true;
    public boolean A = true;
    public final Handler B = new Handler(Looper.getMainLooper());
    public final Runnable C = new RunnableC0243a();
    public boolean D = false;
    public int E = -1;

    /* JADX INFO: renamed from: c.i.a.g.a$a, reason: collision with other inner class name */
    public class RunnableC0243a implements Runnable {
        public RunnableC0243a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.t(0.0f);
        }
    }

    public class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f18118b;

        public b(float f2) {
            this.f18118b = f2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f18118b == 0.0f) {
                a.this.f18107f.setVisibility(8);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f18118b == 1.0f) {
                a.this.f18107f.setVisibility(0);
            }
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f18120b;

        public c(String str) {
            this.f18120b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f18107f.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.youtube.com/watch?v=" + this.f18120b + "#t=" + a.this.s.getProgress())));
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f18111j.setText(BuildConfig.FLAVOR);
        }
    }

    public a(YouTubePlayerView youTubePlayerView, c.i.a.f.c cVar) {
        this.f18103b = youTubePlayerView;
        this.f18104c = cVar;
        u(View.inflate(youTubePlayerView.getContext(), c.i.a.d.f18059a, youTubePlayerView));
        this.f18105d = new c.i.a.g.c.c.a(youTubePlayerView.getContext());
    }

    public final void A() {
        t(this.w ? 0.0f : 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(int r4) {
        /*
            r3 = this;
            r0 = -1
            r1 = 1
            if (r4 == r0) goto L13
            r0 = 0
            if (r4 == 0) goto L10
            if (r4 == r1) goto Ld
            r2 = 2
            if (r4 == r2) goto L10
            goto L16
        Ld:
            r3.v = r1
            goto L16
        L10:
            r3.v = r0
            goto L16
        L13:
            r3.y()
        L16:
            boolean r4 = r3.v
            r4 = r4 ^ r1
            r3.C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.i.a.g.a.B(int):void");
    }

    public final void C(boolean z) {
        this.f18115n.setImageResource(z ? c.i.a.b.f18042c : c.i.a.b.f18043d);
    }

    @Override // c.i.a.f.g
    public void a(int i2) {
        this.E = -1;
        B(i2);
        if (i2 == 1 || i2 == 2 || i2 == 5) {
            this.f18106e.setBackgroundColor(a.i.i.b.d(this.f18103b.getContext(), R.color.transparent));
            this.f18113l.setVisibility(8);
            if (this.z) {
                this.f18115n.setVisibility(0);
            }
            this.x = true;
            boolean z = i2 == 1;
            C(z);
            if (z) {
                z();
                return;
            } else {
                this.B.removeCallbacks(this.C);
                return;
            }
        }
        C(false);
        t(1.0f);
        if (i2 == 3) {
            this.f18106e.setBackgroundColor(a.i.i.b.d(this.f18103b.getContext(), R.color.transparent));
            if (this.z) {
                this.f18115n.setVisibility(4);
            }
            this.q.setVisibility(8);
            this.r.setVisibility(8);
            this.x = false;
        }
        if (i2 == -1) {
            this.x = false;
            this.f18113l.setVisibility(8);
            if (this.z) {
                this.f18115n.setVisibility(0);
            }
        }
    }

    @Override // c.i.a.g.b
    public void b(boolean z) {
        this.p.setVisibility(z ? 0 : 8);
    }

    @Override // c.i.a.f.g
    public void c(String str) {
    }

    @Override // c.i.a.f.g
    public void d(String str) {
    }

    @Override // c.i.a.g.b
    public void e(boolean z) {
        this.f18116o.setVisibility(z ? 0 : 8);
    }

    @Override // c.i.a.f.g
    public void f(float f2) {
        if (!this.A) {
            this.s.setSecondaryProgress(0);
        } else {
            this.s.setSecondaryProgress((int) (f2 * r0.getMax()));
        }
    }

    @Override // c.i.a.f.g
    public void g(String str) {
        this.f18116o.setOnClickListener(new c(str));
    }

    @Override // c.i.a.f.g
    public void h() {
    }

    @Override // c.i.a.f.e
    public void i() {
        this.p.setImageResource(c.i.a.b.f18040a);
    }

    @Override // c.i.a.g.b
    public void j(boolean z) {
        this.f18109h.setVisibility(z ? 0 : 8);
    }

    @Override // c.i.a.f.g
    public void k(float f2) {
        this.f18111j.setText(c.i.a.h.c.a(f2));
        this.s.setMax((int) f2);
    }

    @Override // c.i.a.f.g
    public void l(float f2) {
        if (this.D) {
            return;
        }
        if (this.E <= 0 || c.i.a.h.c.a(f2).equals(c.i.a.h.c.a(this.E))) {
            this.E = -1;
            this.s.setProgress((int) f2);
        }
    }

    @Override // c.i.a.f.g
    public void m() {
    }

    @Override // c.i.a.f.e
    public void n() {
        this.p.setImageResource(c.i.a.b.f18041b);
    }

    @Override // c.i.a.g.b
    public void o(boolean z) {
        this.f18115n.setVisibility(z ? 0 : 8);
        this.z = z;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f18106e) {
            A();
            return;
        }
        if (view == this.f18115n) {
            x();
        } else if (view == this.p) {
            v();
        } else if (view == this.f18114m) {
            w();
        }
    }

    @Override // c.i.a.f.g
    public void onError(int i2) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        this.f18110i.setText(c.i.a.h.c.a(i2));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        this.D = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        if (this.v) {
            this.E = seekBar.getProgress();
        }
        this.f18104c.c(seekBar.getProgress());
        this.D = false;
    }

    public final void t(float f2) {
        if (this.x && this.y) {
            this.w = f2 != 0.0f;
            if (f2 == 1.0f && this.v) {
                z();
            } else {
                this.B.removeCallbacks(this.C);
            }
            this.f18107f.animate().alpha(f2).setDuration(300L).setListener(new b(f2)).start();
        }
    }

    public final void u(View view) {
        this.f18106e = view.findViewById(c.i.a.c.f18051h);
        this.f18107f = view.findViewById(c.i.a.c.f18044a);
        this.f18108g = (LinearLayout) view.findViewById(c.i.a.c.f18047d);
        this.f18109h = (TextView) view.findViewById(c.i.a.c.p);
        this.f18110i = (TextView) view.findViewById(c.i.a.c.f18057n);
        this.f18111j = (TextView) view.findViewById(c.i.a.c.f18058o);
        this.f18112k = (TextView) view.findViewById(c.i.a.c.f18049f);
        this.f18113l = (ProgressBar) view.findViewById(c.i.a.c.f18053j);
        this.f18114m = (ImageView) view.findViewById(c.i.a.c.f18050g);
        this.f18115n = (ImageView) view.findViewById(c.i.a.c.f18052i);
        this.f18116o = (ImageView) view.findViewById(c.i.a.c.q);
        this.p = (ImageView) view.findViewById(c.i.a.c.f18048e);
        this.q = (ImageView) view.findViewById(c.i.a.c.f18045b);
        this.r = (ImageView) view.findViewById(c.i.a.c.f18046c);
        SeekBar seekBar = (SeekBar) view.findViewById(c.i.a.c.f18055l);
        this.s = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        this.f18106e.setOnClickListener(this);
        this.f18115n.setOnClickListener(this);
        this.f18114m.setOnClickListener(this);
        this.p.setOnClickListener(this);
    }

    public final void v() {
        View.OnClickListener onClickListener = this.t;
        if (onClickListener == null) {
            this.f18103b.n();
        } else {
            onClickListener.onClick(this.p);
        }
    }

    public final void w() {
        View.OnClickListener onClickListener = this.u;
        if (onClickListener == null) {
            this.f18105d.a(this.f18114m);
        } else {
            onClickListener.onClick(this.f18114m);
        }
    }

    public final void x() {
        if (this.v) {
            this.f18104c.pause();
        } else {
            this.f18104c.play();
        }
    }

    public final void y() {
        this.s.setProgress(0);
        this.s.setMax(0);
        this.f18111j.post(new d());
    }

    public final void z() {
        this.B.postDelayed(this.C, 3000L);
    }
}
