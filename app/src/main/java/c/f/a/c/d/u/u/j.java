package c.f.a.c.d.u.u;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import c.f.a.c.d.u.l;
import c.f.a.c.d.u.m;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class j extends a.l.d.d {
    public boolean r;
    public List<MediaTrack> s;
    public List<MediaTrack> t;
    public long[] u;
    public Dialog v;
    public i w;
    public MediaInfo x;
    public long[] y;

    @Deprecated
    public j() {
    }

    public static j K() {
        return new j();
    }

    public static int N(List<MediaTrack> list, long[] jArr, int i2) {
        if (jArr != null && list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                for (long j2 : jArr) {
                    if (j2 == list.get(i3).K()) {
                        return i3;
                    }
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ Dialog Q(j jVar, Dialog dialog) {
        jVar.v = null;
        return null;
    }

    public static ArrayList<MediaTrack> R(List<MediaTrack> list, int i2) {
        ArrayList<MediaTrack> arrayList = new ArrayList<>();
        if (list != null) {
            for (MediaTrack mediaTrack : list) {
                if (mediaTrack.O() == i2) {
                    arrayList.add(mediaTrack);
                }
            }
        }
        return arrayList;
    }

    public final void V(i0 i0Var, i0 i0Var2) {
        if (!this.r || !this.w.p()) {
            W();
            return;
        }
        ArrayList arrayList = new ArrayList();
        MediaTrack mediaTrackA = i0Var.a();
        if (mediaTrackA != null && mediaTrackA.K() != -1) {
            arrayList.add(Long.valueOf(mediaTrackA.K()));
        }
        MediaTrack mediaTrackA2 = i0Var2.a();
        if (mediaTrackA2 != null) {
            arrayList.add(Long.valueOf(mediaTrackA2.K()));
        }
        long[] jArr = this.u;
        if (jArr != null && jArr.length > 0) {
            HashSet hashSet = new HashSet();
            Iterator<MediaTrack> it = this.t.iterator();
            while (it.hasNext()) {
                hashSet.add(Long.valueOf(it.next().K()));
            }
            Iterator<MediaTrack> it2 = this.s.iterator();
            while (it2.hasNext()) {
                hashSet.add(Long.valueOf(it2.next().K()));
            }
            for (long j2 : this.u) {
                if (!hashSet.contains(Long.valueOf(j2))) {
                    arrayList.add(Long.valueOf(j2));
                }
            }
        }
        long[] jArr2 = new long[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jArr2[i2] = ((Long) arrayList.get(i2)).longValue();
        }
        Arrays.sort(jArr2);
        this.w.U(jArr2);
        W();
    }

    public final void W() {
        Dialog dialog = this.v;
        if (dialog != null) {
            dialog.cancel();
            this.v = null;
        }
    }

    @Override // a.l.d.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.r = true;
        this.t = new ArrayList();
        this.s = new ArrayList();
        this.u = new long[0];
        c.f.a.c.d.u.d dVarC = c.f.a.c.d.u.b.e(getContext()).c().c();
        if (dVarC == null || !dVarC.c()) {
            this.r = false;
            return;
        }
        i iVarP = dVarC.p();
        this.w = iVarP;
        if (iVarP == null || !iVarP.p() || this.w.j() == null) {
            this.r = false;
            return;
        }
        long[] jArr = this.y;
        if (jArr != null) {
            this.u = jArr;
        } else {
            c.f.a.c.d.q qVarL = this.w.l();
            if (qVarL != null) {
                this.u = qVarL.I();
            }
        }
        MediaInfo mediaInfoJ = this.x;
        if (mediaInfoJ == null) {
            mediaInfoJ = this.w.j();
        }
        if (mediaInfoJ == null) {
            this.r = false;
            return;
        }
        List<MediaTrack> listO = mediaInfoJ.O();
        if (listO == null) {
            this.r = false;
            return;
        }
        this.t = R(listO, 2);
        ArrayList<MediaTrack> arrayListR = R(listO, 1);
        this.s = arrayListR;
        if (arrayListR.isEmpty()) {
            return;
        }
        this.s.add(0, new MediaTrack.a(-1L, 1).c(getActivity().getString(c.f.a.c.d.u.n.z)).d(2).b(BuildConfig.FLAVOR).a());
    }

    @Override // a.l.d.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (u() != null && getRetainInstance()) {
            u().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // a.l.d.d
    public Dialog w(Bundle bundle) {
        int iN = N(this.s, this.u, 0);
        int iN2 = N(this.t, this.u, -1);
        i0 i0Var = new i0(getActivity(), this.s, iN);
        i0 i0Var2 = new i0(getActivity(), this.t, iN2);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View viewInflate = getActivity().getLayoutInflater().inflate(m.f11882c, (ViewGroup) null);
        int i2 = l.S;
        ListView listView = (ListView) viewInflate.findViewById(i2);
        int i3 = l.f11872h;
        ListView listView2 = (ListView) viewInflate.findViewById(i3);
        TabHost tabHost = (TabHost) viewInflate.findViewById(l.Q);
        tabHost.setup();
        if (i0Var.getCount() == 0) {
            listView.setVisibility(4);
        } else {
            listView.setAdapter((ListAdapter) i0Var);
            TabHost.TabSpec tabSpecNewTabSpec = tabHost.newTabSpec("textTab");
            tabSpecNewTabSpec.setContent(i2);
            tabSpecNewTabSpec.setIndicator(getActivity().getString(c.f.a.c.d.u.n.B));
            tabHost.addTab(tabSpecNewTabSpec);
        }
        if (i0Var2.getCount() <= 1) {
            listView2.setVisibility(4);
        } else {
            listView2.setAdapter((ListAdapter) i0Var2);
            TabHost.TabSpec tabSpecNewTabSpec2 = tabHost.newTabSpec("audioTab");
            tabSpecNewTabSpec2.setContent(i3);
            tabSpecNewTabSpec2.setIndicator(getActivity().getString(c.f.a.c.d.u.n.v));
            tabHost.addTab(tabSpecNewTabSpec2);
        }
        builder.setView(viewInflate).setPositiveButton(getActivity().getString(c.f.a.c.d.u.n.A), new j0(this, i0Var, i0Var2)).setNegativeButton(c.f.a.c.d.u.n.w, new h0(this));
        Dialog dialog = this.v;
        if (dialog != null) {
            dialog.cancel();
            this.v = null;
        }
        AlertDialog alertDialogCreate = builder.create();
        this.v = alertDialogCreate;
        return alertDialogCreate;
    }
}
