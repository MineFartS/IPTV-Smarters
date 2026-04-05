package c.h.a.k.c;

import a.l.d.n;
import a.l.d.s;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import c.f.a.b.e3.a1;
import c.f.a.b.g3.f;
import c.f.a.b.g3.j;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import com.google.android.material.tabs.TabLayout;
import com.nst.iptvsmarterstvbox.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends a.l.d.d {
    public final SparseArray<b> r = new SparseArray<>();
    public final ArrayList<Integer> s = new ArrayList<>();
    public int t;
    public DialogInterface.OnClickListener u;
    public DialogInterface.OnDismissListener v;

    public final class a extends s {
        @SuppressLint({"WrongConstant"})
        public a(n nVar) {
            super(nVar, 1);
        }

        @Override // a.e0.a.a
        public int c() {
            return l.this.r.size();
        }

        @Override // a.e0.a.a
        public CharSequence e(int i2) {
            return l.W(l.this.getResources(), ((Integer) l.this.s.get(i2)).intValue());
        }

        @Override // a.l.d.s
        public Fragment p(int i2) {
            return (Fragment) l.this.r.valueAt(i2);
        }
    }

    public static final class b extends Fragment implements TrackSelectionView.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j.a f17807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f17809d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f17810e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f17811f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<f.C0135f> f17812g;

        public b() {
            setRetainInstance(true);
        }

        @Override // com.google.android.exoplayer2.ui.TrackSelectionView.d
        public void h(boolean z, List<f.C0135f> list) {
            this.f17811f = z;
            this.f17812g = list;
        }

        public void l(j.a aVar, int i2, boolean z, f.C0135f c0135f, boolean z2, boolean z3) {
            this.f17807b = aVar;
            this.f17808c = i2;
            this.f17811f = z;
            this.f17812g = c0135f == null ? Collections.emptyList() : Collections.singletonList(c0135f);
            this.f17809d = z2;
            this.f17810e = z3;
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View viewInflate = layoutInflater.inflate(R.layout.exo_track_selection_dialog, viewGroup, false);
            TrackSelectionView trackSelectionView = (TrackSelectionView) viewInflate.findViewById(R.id.exo_track_selection_view);
            trackSelectionView.setShowDisableOption(true);
            trackSelectionView.setAllowMultipleOverrides(this.f17810e);
            trackSelectionView.setAllowAdaptiveSelections(this.f17809d);
            trackSelectionView.d(this.f17807b, this.f17808c, this.f17811f, this.f17812g, null, this);
            return viewInflate;
        }
    }

    public l() {
        setRetainInstance(true);
    }

    public static l Q(int i2, j.a aVar, f.d dVar, boolean z, boolean z2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener) {
        l lVar = new l();
        lVar.Z(i2, aVar, dVar, z, z2, onClickListener, onDismissListener);
        return lVar;
    }

    public static l R(final c.f.a.b.g3.f fVar, DialogInterface.OnDismissListener onDismissListener) {
        final j.a aVar = (j.a) c.f.a.b.j3.g.e(fVar.g());
        final l lVar = new l();
        final f.d dVarS = fVar.s();
        lVar.Z(R.string.track_selection_title, aVar, dVarS, true, false, new DialogInterface.OnClickListener() { // from class: c.h.a.k.c.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                l.d0(dVarS, aVar, lVar, fVar, dialogInterface, i2);
            }
        }, onDismissListener);
        return lVar;
    }

    public static String W(Resources resources, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = R.string.exo_track_selection_title_audio;
        } else if (i2 == 2) {
            i3 = R.string.exo_track_selection_title_video;
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException();
            }
            i3 = R.string.exo_track_selection_title_text;
        }
        return resources.getString(i3);
    }

    public static boolean c0(int i2) {
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public static /* synthetic */ void d0(f.d dVar, j.a aVar, l lVar, c.f.a.b.g3.f fVar, DialogInterface dialogInterface, int i2) {
        f.e eVarH = dVar.h();
        for (int i3 = 0; i3 < aVar.c(); i3++) {
            eVarH.Q(i3).W(i3, lVar.S(i3));
            List<f.C0135f> listV = lVar.V(i3);
            if (!listV.isEmpty()) {
                eVarH.X(i3, aVar.g(i3), listV.get(0));
            }
        }
        fVar.K(eVarH);
    }

    public static boolean h0(j.a aVar, int i2) {
        if (aVar.g(i2).f6903c == 0) {
            return false;
        }
        return c0(aVar.f(i2));
    }

    public static boolean i0(c.f.a.b.g3.f fVar) {
        j.a aVarG = fVar.g();
        return aVarG != null && l0(aVarG);
    }

    public static boolean l0(j.a aVar) {
        for (int i2 = 0; i2 < aVar.c(); i2++) {
            if (h0(aVar, i2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda$onCreateView$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void e0(View view) {
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda$onCreateView$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void g0(View view) {
        this.u.onClick(u(), -1);
        q();
    }

    public boolean S(int i2) {
        b bVar = this.r.get(i2);
        return bVar != null && bVar.f17811f;
    }

    public List<f.C0135f> V(int i2) {
        b bVar = this.r.get(i2);
        return bVar == null ? Collections.emptyList() : bVar.f17812g;
    }

    public final void Z(int i2, j.a aVar, f.d dVar, boolean z, boolean z2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener) {
        this.t = i2;
        this.u = onClickListener;
        this.v = onDismissListener;
        for (int i3 = 0; i3 < aVar.c(); i3++) {
            if (h0(aVar, i3)) {
                int iF = aVar.f(i3);
                a1 a1VarG = aVar.g(i3);
                b bVar = new b();
                bVar.l(aVar, i3, dVar.k(i3), dVar.l(i3, a1VarG), z, z2);
                this.r.put(i3, bVar);
                this.s.add(Integer.valueOf(iF));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.track_selection_dialog, viewGroup, false);
        TabLayout tabLayout = (TabLayout) viewInflate.findViewById(R.id.track_selection_dialog_tab_layout);
        ViewPager viewPager = (ViewPager) viewInflate.findViewById(R.id.track_selection_dialog_view_pager);
        Button button = (Button) viewInflate.findViewById(R.id.track_selection_dialog_cancel_button);
        Button button2 = (Button) viewInflate.findViewById(R.id.track_selection_dialog_ok_button);
        viewPager.setAdapter(new a(getChildFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setVisibility(this.r.size() <= 1 ? 8 : 0);
        button.setOnClickListener(new View.OnClickListener() { // from class: c.h.a.k.c.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17765b.e0(view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: c.h.a.k.c.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17770b.g0(view);
            }
        });
        return viewInflate;
    }

    @Override // a.l.d.d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.v.onDismiss(dialogInterface);
    }

    @Override // a.l.d.d
    public Dialog w(Bundle bundle) {
        a.b.k.g gVar = new a.b.k.g(getActivity(), R.style.TrackSelectionDialogThemeOverlay);
        gVar.setTitle(this.t);
        return gVar;
    }
}
