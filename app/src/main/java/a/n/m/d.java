package a.n.m;

import a.l.d.n;
import a.n.q.c0;
import a.n.q.d0;
import a.n.q.h0;
import a.n.q.m0;
import a.n.q.p0;
import a.n.q.w0;
import a.n.q.y;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.speech.SpeechRecognizer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.leanback.widget.SearchBar;
import androidx.leanback.widget.VerticalGridView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class d extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f2695b = d.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f2697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f2698e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a.n.m.c f2704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SearchBar f2705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f2706m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d0 f2708o;
    public c0 p;
    public y q;
    public w0 r;
    public String s;
    public Drawable t;
    public h u;
    public SpeechRecognizer v;
    public int w;
    public boolean y;
    public boolean z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y.b f2699f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f2700g = new Handler();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f2701h = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Runnable f2702i = new c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Runnable f2703j = new RunnableC0057d();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f2707n = null;
    public boolean x = true;
    public SearchBar.l A = new e();

    public class a extends y.b {
        public a() {
        }

        @Override // a.n.q.y.b
        public void a() {
            d dVar = d.this;
            dVar.f2700g.removeCallbacks(dVar.f2701h);
            d dVar2 = d.this;
            dVar2.f2700g.post(dVar2.f2701h);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.n.m.c cVar = d.this.f2704k;
            if (cVar != null) {
                y yVarN = cVar.n();
                d dVar = d.this;
                if (yVarN != dVar.q && (dVar.f2704k.n() != null || d.this.q.i() != 0)) {
                    d dVar2 = d.this;
                    dVar2.f2704k.y(dVar2.q);
                    d.this.f2704k.B(0);
                }
            }
            d.this.Q();
            d dVar3 = d.this;
            int i2 = dVar3.w | 1;
            dVar3.w = i2;
            if ((i2 & 2) != 0) {
                dVar3.N();
            }
            d.this.P();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y yVar;
            d dVar = d.this;
            if (dVar.f2704k == null) {
                return;
            }
            y yVarK = dVar.f2706m.k();
            d dVar2 = d.this;
            y yVar2 = dVar2.q;
            if (yVarK != yVar2) {
                boolean z = yVar2 == null;
                dVar2.v();
                d dVar3 = d.this;
                dVar3.q = yVarK;
                if (yVarK != null) {
                    yVarK.g(dVar3.f2699f);
                }
                if (!z || ((yVar = d.this.q) != null && yVar.i() != 0)) {
                    d dVar4 = d.this;
                    dVar4.f2704k.y(dVar4.q);
                }
                d.this.n();
            }
            d.this.P();
            d dVar5 = d.this;
            if (!dVar5.x) {
                dVar5.N();
                return;
            }
            dVar5.f2700g.removeCallbacks(dVar5.f2703j);
            d dVar6 = d.this;
            dVar6.f2700g.postDelayed(dVar6.f2703j, 300L);
        }
    }

    /* JADX INFO: renamed from: a.n.m.d$d, reason: collision with other inner class name */
    public class RunnableC0057d implements Runnable {
        public RunnableC0057d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.x = false;
            dVar.f2705l.i();
        }
    }

    public class e implements SearchBar.l {
        public e() {
        }

        @Override // androidx.leanback.widget.SearchBar.l
        public void a() {
            d.this.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 0);
        }
    }

    public class f implements SearchBar.k {
        public f() {
        }

        @Override // androidx.leanback.widget.SearchBar.k
        public void a(String str) {
            d dVar = d.this;
            if (dVar.f2706m != null) {
                dVar.y(str);
            } else {
                dVar.f2707n = str;
            }
        }

        @Override // androidx.leanback.widget.SearchBar.k
        public void b(String str) {
            d.this.K(str);
        }

        @Override // androidx.leanback.widget.SearchBar.k
        public void c(String str) {
            d.this.r();
        }
    }

    public class g implements d0 {
        public g() {
        }

        @Override // a.n.q.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.a aVar, Object obj, p0.b bVar, m0 m0Var) {
            d.this.Q();
            d0 d0Var = d.this.f2708o;
            if (d0Var != null) {
                d0Var.a(aVar, obj, bVar, m0Var);
            }
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2717b;

        public h(String str, boolean z) {
            this.f2716a = str;
            this.f2717b = z;
        }
    }

    public interface i {
        y k();

        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    static {
        String canonicalName = d.class.getCanonicalName();
        f2696c = canonicalName;
        f2697d = canonicalName + ".query";
        f2698e = canonicalName + ".title";
    }

    public void B(c0 c0Var) {
        if (c0Var != this.p) {
            this.p = c0Var;
            a.n.m.c cVar = this.f2704k;
            if (cVar != null) {
                cVar.K(c0Var);
            }
        }
    }

    public void C(Intent intent, boolean z) {
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
        if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
            return;
        }
        F(stringArrayListExtra.get(0), z);
    }

    public final void E(String str) {
        this.f2705l.setSearchQuery(str);
    }

    public void F(String str, boolean z) {
        if (str == null) {
            return;
        }
        this.u = new h(str, z);
        l();
        if (this.x) {
            this.x = false;
            this.f2700g.removeCallbacks(this.f2703j);
        }
    }

    public void G(i iVar) {
        if (this.f2706m != iVar) {
            this.f2706m = iVar;
            q();
        }
    }

    public void H(String str) {
        this.s = str;
        SearchBar searchBar = this.f2705l;
        if (searchBar != null) {
            searchBar.setTitle(str);
        }
    }

    public void J() {
        if (this.y) {
            this.z = true;
        } else {
            this.f2705l.i();
        }
    }

    public void K(String str) {
        r();
        i iVar = this.f2706m;
        if (iVar != null) {
            iVar.onQueryTextSubmit(str);
        }
    }

    public void N() {
        a.n.m.c cVar;
        y yVar = this.q;
        if (yVar == null || yVar.i() <= 0 || (cVar = this.f2704k) == null || cVar.n() != this.q) {
            this.f2705l.requestFocus();
        } else {
            o();
        }
    }

    public void P() {
        y yVar;
        a.n.m.c cVar;
        if (this.f2705l == null || (yVar = this.q) == null) {
            return;
        }
        this.f2705l.setNextFocusDownId((yVar.i() == 0 || (cVar = this.f2704k) == null || cVar.u() == null) ? 0 : this.f2704k.u().getId());
    }

    public void Q() {
        y yVar;
        a.n.m.c cVar = this.f2704k;
        this.f2705l.setVisibility(((cVar != null ? cVar.r() : -1) <= 0 || (yVar = this.q) == null || yVar.i() == 0) ? 0 : 8);
    }

    public final void l() {
        SearchBar searchBar;
        h hVar = this.u;
        if (hVar == null || (searchBar = this.f2705l) == null) {
            return;
        }
        searchBar.setSearchQuery(hVar.f2716a);
        h hVar2 = this.u;
        if (hVar2.f2717b) {
            K(hVar2.f2716a);
        }
        this.u = null;
    }

    public void n() {
        String str = this.f2707n;
        if (str == null || this.q == null) {
            return;
        }
        this.f2707n = null;
        y(str);
    }

    public final void o() {
        a.n.m.c cVar = this.f2704k;
        if (cVar == null || cVar.u() == null || this.q.i() == 0 || !this.f2704k.u().requestFocus()) {
            return;
        }
        this.w &= -2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        if (this.x) {
            this.x = bundle == null;
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(a.n.h.f2640k, viewGroup, false);
        SearchBar searchBar = (SearchBar) ((FrameLayout) viewInflate.findViewById(a.n.f.s)).findViewById(a.n.f.f2624o);
        this.f2705l = searchBar;
        searchBar.setSearchBarListener(new f());
        this.f2705l.setSpeechRecognitionCallback(this.r);
        this.f2705l.setPermissionListener(this.A);
        l();
        u(getArguments());
        Drawable drawable = this.t;
        if (drawable != null) {
            z(drawable);
        }
        String str = this.s;
        if (str != null) {
            H(str);
        }
        n childFragmentManager = getChildFragmentManager();
        int i2 = a.n.f.f2622m;
        if (childFragmentManager.h0(i2) == null) {
            this.f2704k = new a.n.m.c();
            getChildFragmentManager().m().r(i2, this.f2704k).j();
        } else {
            this.f2704k = (a.n.m.c) getChildFragmentManager().h0(i2);
        }
        this.f2704k.N(new g());
        this.f2704k.K(this.p);
        this.f2704k.J(true);
        if (this.f2706m != null) {
            q();
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        v();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        w();
        this.y = true;
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (i2 == 0 && strArr.length > 0 && strArr[0].equals("android.permission.RECORD_AUDIO") && iArr[0] == 0) {
            J();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.y = false;
        if (this.r == null && this.v == null) {
            SpeechRecognizer speechRecognizerCreateSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(getContext());
            this.v = speechRecognizerCreateSpeechRecognizer;
            this.f2705l.setSpeechRecognizer(speechRecognizerCreateSpeechRecognizer);
        }
        if (!this.z) {
            this.f2705l.j();
        } else {
            this.z = false;
            this.f2705l.i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        VerticalGridView verticalGridViewU = this.f2704k.u();
        int dimensionPixelSize = getResources().getDimensionPixelSize(a.n.c.v);
        verticalGridViewU.setItemAlignmentOffset(0);
        verticalGridViewU.setItemAlignmentOffsetPercent(-1.0f);
        verticalGridViewU.setWindowAlignmentOffset(dimensionPixelSize);
        verticalGridViewU.setWindowAlignmentOffsetPercent(-1.0f);
        verticalGridViewU.setWindowAlignment(0);
        verticalGridViewU.setFocusable(false);
        verticalGridViewU.setFocusableInTouchMode(false);
    }

    public final void q() {
        this.f2700g.removeCallbacks(this.f2702i);
        this.f2700g.post(this.f2702i);
    }

    public void r() {
        this.w |= 2;
        o();
    }

    public final void u(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String str = f2697d;
        if (bundle.containsKey(str)) {
            E(bundle.getString(str));
        }
        String str2 = f2698e;
        if (bundle.containsKey(str2)) {
            H(bundle.getString(str2));
        }
    }

    public void v() {
        y yVar = this.q;
        if (yVar != null) {
            yVar.j(this.f2699f);
            this.q = null;
        }
    }

    public final void w() {
        if (this.v != null) {
            this.f2705l.setSpeechRecognizer(null);
            this.v.destroy();
            this.v = null;
        }
    }

    public void y(String str) {
        if (this.f2706m.onQueryTextChange(str)) {
            this.w &= -3;
        }
    }

    public void z(Drawable drawable) {
        this.t = drawable;
        SearchBar searchBar = this.f2705l;
        if (searchBar != null) {
            searchBar.setBadgeDrawable(drawable);
        }
    }
}
