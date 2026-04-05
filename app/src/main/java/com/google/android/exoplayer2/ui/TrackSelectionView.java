package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import c.f.a.b.e3.a1;
import c.f.a.b.e3.z0;
import c.f.a.b.g3.f;
import c.f.a.b.g3.j;
import c.f.a.b.h3.f1;
import c.f.a.b.h3.j0;
import c.f.a.b.h3.u0;
import c.f.a.b.h3.w0;
import c.f.a.b.j3.g;
import c.f.a.b.k1;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayoutInflater f24062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckedTextView f24063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CheckedTextView f24064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f24065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray<f.C0135f> f24066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24067h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f24068i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f1 f24069j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CheckedTextView[][] f24070k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j.a f24071l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24072m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a1 f24073n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24074o;
    public Comparator<c> p;
    public d q;

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.onClick(view);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k1 f24078c;

        public c(int i2, int i3, k1 k1Var) {
            this.f24076a = i2;
            this.f24077b = i3;
            this.f24078c = k1Var;
        }
    }

    public interface d {
        void h(boolean z, List<f.C0135f> list);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setOrientation(1);
        this.f24066g = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f24061b = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f24062c = layoutInflaterFrom;
        b bVar = new b();
        this.f24065f = bVar;
        this.f24069j = new j0(getResources());
        this.f24073n = a1.f6902b;
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f24063d = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(w0.B);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(u0.f8772a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f24064e = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(w0.A);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    public static int[] b(int[] iArr, int i2) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArrCopyOf.length - 1] = i2;
        return iArrCopyOf;
    }

    public static int[] c(int[] iArr, int i2) {
        int[] iArr2 = new int[iArr.length - 1];
        int i3 = 0;
        for (int i4 : iArr) {
            if (i4 != i2) {
                iArr2[i3] = i4;
                i3++;
            }
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClick(View view) {
        if (view == this.f24063d) {
            g();
        } else if (view == this.f24064e) {
            f();
        } else {
            h(view);
        }
        k();
        d dVar = this.q;
        if (dVar != null) {
            dVar.h(getIsDisabled(), getOverrides());
        }
    }

    public void d(j.a aVar, int i2, boolean z, List<f.C0135f> list, final Comparator<k1> comparator, d dVar) {
        this.f24071l = aVar;
        this.f24072m = i2;
        this.f24074o = z;
        this.p = comparator == null ? null : new Comparator() { // from class: c.f.a.b.h3.d0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return comparator.compare(((TrackSelectionView.c) obj).f24078c, ((TrackSelectionView.c) obj2).f24078c);
            }
        };
        this.q = dVar;
        int size = this.f24068i ? list.size() : Math.min(list.size(), 1);
        for (int i3 = 0; i3 < size; i3++) {
            f.C0135f c0135f = list.get(i3);
            this.f24066g.put(c0135f.f8455b, c0135f);
        }
        l();
    }

    public final void f() {
        this.f24074o = false;
        this.f24066g.clear();
    }

    public final void g() {
        this.f24074o = true;
        this.f24066g.clear();
    }

    public boolean getIsDisabled() {
        return this.f24074o;
    }

    public List<f.C0135f> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f24066g.size());
        for (int i2 = 0; i2 < this.f24066g.size(); i2++) {
            arrayList.add(this.f24066g.valueAt(i2));
        }
        return arrayList;
    }

    public final void h(View view) {
        SparseArray<f.C0135f> sparseArray;
        f.C0135f c0135f;
        SparseArray<f.C0135f> sparseArray2;
        f.C0135f c0135f2;
        this.f24074o = false;
        c cVar = (c) g.e(view.getTag());
        int i2 = cVar.f24076a;
        int i3 = cVar.f24077b;
        f.C0135f c0135f3 = this.f24066g.get(i2);
        g.e(this.f24071l);
        if (c0135f3 != null) {
            int i4 = c0135f3.f8457d;
            int[] iArr = c0135f3.f8456c;
            boolean zIsChecked = ((CheckedTextView) view).isChecked();
            boolean zI = i(i2);
            boolean z = zI || j();
            if (zIsChecked && z) {
                if (i4 == 1) {
                    this.f24066g.remove(i2);
                    return;
                } else {
                    int[] iArrC = c(iArr, i3);
                    sparseArray2 = this.f24066g;
                    c0135f2 = new f.C0135f(i2, iArrC);
                }
            } else {
                if (zIsChecked) {
                    return;
                }
                if (zI) {
                    int[] iArrB = b(iArr, i3);
                    sparseArray2 = this.f24066g;
                    c0135f2 = new f.C0135f(i2, iArrB);
                } else {
                    sparseArray = this.f24066g;
                    c0135f = new f.C0135f(i2, i3);
                }
            }
            sparseArray2.put(i2, c0135f2);
            return;
        }
        if (!this.f24068i && this.f24066g.size() > 0) {
            this.f24066g.clear();
        }
        sparseArray = this.f24066g;
        c0135f = new f.C0135f(i2, i3);
        sparseArray.put(i2, c0135f);
    }

    @RequiresNonNull({"mappedTrackInfo"})
    public final boolean i(int i2) {
        return this.f24067h && this.f24073n.b(i2).f8056b > 1 && this.f24071l.a(this.f24072m, i2, false) != 0;
    }

    public final boolean j() {
        return this.f24068i && this.f24073n.f6903c > 1;
    }

    public final void k() {
        this.f24063d.setChecked(this.f24074o);
        this.f24064e.setChecked(!this.f24074o && this.f24066g.size() == 0);
        for (int i2 = 0; i2 < this.f24070k.length; i2++) {
            f.C0135f c0135f = this.f24066g.get(i2);
            int i3 = 0;
            while (true) {
                CheckedTextView[][] checkedTextViewArr = this.f24070k;
                if (i3 < checkedTextViewArr[i2].length) {
                    if (c0135f != null) {
                        this.f24070k[i2][i3].setChecked(c0135f.b(((c) g.e(checkedTextViewArr[i2][i3].getTag())).f24077b));
                    } else {
                        checkedTextViewArr[i2][i3].setChecked(false);
                    }
                    i3++;
                }
            }
        }
    }

    public final void l() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f24071l == null) {
            this.f24063d.setEnabled(false);
            this.f24064e.setEnabled(false);
            return;
        }
        this.f24063d.setEnabled(true);
        this.f24064e.setEnabled(true);
        a1 a1VarG = this.f24071l.g(this.f24072m);
        this.f24073n = a1VarG;
        this.f24070k = new CheckedTextView[a1VarG.f6903c][];
        boolean zJ = j();
        int i2 = 0;
        while (true) {
            a1 a1Var = this.f24073n;
            if (i2 >= a1Var.f6903c) {
                k();
                return;
            }
            z0 z0VarB = a1Var.b(i2);
            boolean zI = i(i2);
            CheckedTextView[][] checkedTextViewArr = this.f24070k;
            int i3 = z0VarB.f8056b;
            checkedTextViewArr[i2] = new CheckedTextView[i3];
            c[] cVarArr = new c[i3];
            for (int i4 = 0; i4 < z0VarB.f8056b; i4++) {
                cVarArr[i4] = new c(i2, i4, z0VarB.b(i4));
            }
            Comparator<c> comparator = this.p;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i5 = 0; i5 < i3; i5++) {
                if (i5 == 0) {
                    addView(this.f24062c.inflate(u0.f8772a, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f24062c.inflate((zI || zJ) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f24061b);
                checkedTextView.setText(this.f24069j.a(cVarArr[i5].f24078c));
                checkedTextView.setTag(cVarArr[i5]);
                if (this.f24071l.h(this.f24072m, i2, i5) == 4) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f24065f);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f24070k[i2][i5] = checkedTextView;
                addView(checkedTextView);
            }
            i2++;
        }
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f24067h != z) {
            this.f24067h = z;
            l();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f24068i != z) {
            this.f24068i = z;
            if (!z && this.f24066g.size() > 1) {
                for (int size = this.f24066g.size() - 1; size > 0; size--) {
                    this.f24066g.remove(size);
                }
            }
            l();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f24063d.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(f1 f1Var) {
        this.f24069j = (f1) g.e(f1Var);
        l();
    }
}
