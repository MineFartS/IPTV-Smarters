package minefarts.iptvsmarters.view.fragment;

import a.n.m.d;
import a.n.q.c0;
import a.n.q.h0;
import a.n.q.m0;
import a.n.q.p0;
import a.n.q.v;
import a.n.q.y;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import c.h.a.i.q.f;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.callback.SeriesDBModel;
import minefarts.iptvsmarters.model.pojo.XMLTVProgrammePojo;
import minefarts.iptvsmarters.view.activity.SearchActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import org.joda.time.LocalDateTime;

/* JADX INFO: loaded from: classes2.dex */
public class SearchFragment extends a.n.m.d implements d.i {
    public a.n.q.a C;
    public String D;
    public f F;
    public Context G;
    public final Handler B = new Handler();
    public boolean E = false;
    public boolean H = false;
    public ArrayList<String> I = new ArrayList<>();
    public final int J = 1;

    @SuppressLint({"StaticFieldLeak"})
    public class b extends AsyncTask<String, Void, ArrayList<XMLTVProgrammePojo>> {
        public b() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<XMLTVProgrammePojo> doInBackground(String... strArr) {
            return SearchFragment.this.e0();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[Catch: Exception -> 0x0099, TryCatch #0 {Exception -> 0x0099, blocks: (B:4:0x0005, B:6:0x000b, B:8:0x0041, B:10:0x004f, B:12:0x005d, B:14:0x007f, B:16:0x0087, B:13:0x0069), top: B:19:0x0005 }] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onPostExecute(java.util.ArrayList<minefarts.iptvsmarters.model.pojo.XMLTVProgrammePojo> r3) {
            /*
                r2 = this;
                super.onPostExecute(r3)
                if (r3 == 0) goto L69
                int r0 = r3.size()     // Catch: java.lang.Exception -> L99
                if (r0 <= 0) goto L69
                minefarts.iptvsmarters.view.fragment.SearchFragment r0 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L99
                r1 = 1
                minefarts.iptvsmarters.view.fragment.SearchFragment.V(r0, r1)     // Catch: java.lang.Exception -> L99
                minefarts.iptvsmarters.view.fragment.SearchFragment r0 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L99
                a.l.d.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> L99
                minefarts.iptvsmarters.view.activity.SearchActivity r0 = (minefarts.iptvsmarters.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> L99
                r0.u0()     // Catch: java.lang.Exception -> L99
                minefarts.iptvsmarters.view.fragment.SearchFragment r0 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L99
                a.l.d.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> L99
                minefarts.iptvsmarters.view.activity.SearchActivity r0 = (minefarts.iptvsmarters.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> L99
                r1 = 0
                r0.M0(r3, r1)     // Catch: java.lang.Exception -> L99
                minefarts.iptvsmarters.view.fragment.SearchFragment r3 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L99
                a.l.d.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                minefarts.iptvsmarters.view.activity.SearchActivity r3 = (minefarts.iptvsmarters.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L99
                r3.W0()     // Catch: java.lang.Exception -> L99
                minefarts.iptvsmarters.view.fragment.SearchFragment r3 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L99
                a.l.d.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                minefarts.iptvsmarters.view.activity.SearchActivity r3 = (minefarts.iptvsmarters.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L99
                boolean r3 = r3.n0()     // Catch: java.lang.Exception -> L99
                if (r3 != 0) goto L7f
                minefarts.iptvsmarters.view.fragment.SearchFragment r3 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L99
                a.l.d.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                minefarts.iptvsmarters.view.activity.SearchActivity r3 = (minefarts.iptvsmarters.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L99
                boolean r3 = r3.o0()     // Catch: java.lang.Exception -> L99
                if (r3 != 0) goto L7f
                minefarts.iptvsmarters.view.fragment.SearchFragment r3 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L99
                a.l.d.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                minefarts.iptvsmarters.view.activity.SearchActivity r3 = (minefarts.iptvsmarters.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L99
                boolean r3 = r3.p0()     // Catch: java.lang.Exception -> L99
                if (r3 != 0) goto L7f
                minefarts.iptvsmarters.view.fragment.SearchFragment r3 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L99
                a.l.d.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                minefarts.iptvsmarters.view.activity.SearchActivity r3 = (minefarts.iptvsmarters.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L99
                r3.V0()     // Catch: java.lang.Exception -> L99
                goto L7f
            L69:
                minefarts.iptvsmarters.view.fragment.SearchFragment r3 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L99
                a.l.d.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                minefarts.iptvsmarters.view.activity.SearchActivity r3 = (minefarts.iptvsmarters.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L99
                r3.w0()     // Catch: java.lang.Exception -> L99
                minefarts.iptvsmarters.view.fragment.SearchFragment r3 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L99
                a.l.d.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                minefarts.iptvsmarters.view.activity.SearchActivity r3 = (minefarts.iptvsmarters.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L99
                r3.v0()     // Catch: java.lang.Exception -> L99
            L7f:
                minefarts.iptvsmarters.view.fragment.SearchFragment r3 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L99
                boolean r3 = minefarts.iptvsmarters.view.fragment.SearchFragment.S(r3)     // Catch: java.lang.Exception -> L99
                if (r3 != 0) goto L99
                minefarts.iptvsmarters.view.fragment.SearchFragment r3 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L99
                minefarts.iptvsmarters.view.fragment.SearchFragment.d0(r3)     // Catch: java.lang.Exception -> L99
                minefarts.iptvsmarters.view.fragment.SearchFragment r3 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L99
                a.l.d.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                minefarts.iptvsmarters.view.activity.SearchActivity r3 = (minefarts.iptvsmarters.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L99
                java.lang.String r0 = "No Record Found"
                r3.U0(r0)     // Catch: java.lang.Exception -> L99
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.fragment.SearchFragment.b.onPostExecute(java.util.ArrayList):void");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class c extends AsyncTask<String, Void, ArrayList<c.h.a.i.f>> {
        public c() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<c.h.a.i.f> doInBackground(String... strArr) {
            return SearchFragment.this.g0();
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0148 A[Catch: Exception -> 0x0170, TRY_LEAVE, TryCatch #0 {Exception -> 0x0170, blocks: (B:36:0x00d8, B:38:0x00de, B:39:0x0131, B:40:0x0142, B:41:0x0148), top: B:48:0x0005 }] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onPostExecute(java.util.ArrayList<c.h.a.i.f> r11) {
            /*
                Method dump skipped, instruction units count: 394
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.fragment.SearchFragment.c.onPostExecute(java.util.ArrayList):void");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class d extends AsyncTask<String, Void, ArrayList<SeriesDBModel>> {
        public d() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<SeriesDBModel> doInBackground(String... strArr) {
            return SearchFragment.this.h0();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0049 A[Catch: Exception -> 0x005f, TRY_LEAVE, TryCatch #0 {Exception -> 0x005f, blocks: (B:4:0x0006, B:6:0x000c, B:7:0x0049), top: B:12:0x0006 }] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onPostExecute(java.util.ArrayList<minefarts.iptvsmarters.model.callback.SeriesDBModel> r5) {
            /*
                r4 = this;
                super.onPostExecute(r5)
                r0 = 1
                if (r5 == 0) goto L49
                int r1 = r5.size()     // Catch: java.lang.Exception -> L5f
                if (r1 <= 0) goto L49
                minefarts.iptvsmarters.view.fragment.SearchFragment r1 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L5f
                minefarts.iptvsmarters.view.fragment.SearchFragment.V(r1, r0)     // Catch: java.lang.Exception -> L5f
                minefarts.iptvsmarters.view.fragment.SearchFragment r1 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L5f
                a.l.d.e r1 = r1.getActivity()     // Catch: java.lang.Exception -> L5f
                minefarts.iptvsmarters.view.activity.SearchActivity r1 = (minefarts.iptvsmarters.view.activity.SearchActivity) r1     // Catch: java.lang.Exception -> L5f
                r1.u0()     // Catch: java.lang.Exception -> L5f
                minefarts.iptvsmarters.view.fragment.SearchFragment r1 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L5f
                a.l.d.e r1 = r1.getActivity()     // Catch: java.lang.Exception -> L5f
                minefarts.iptvsmarters.view.activity.SearchActivity r1 = (minefarts.iptvsmarters.view.activity.SearchActivity) r1     // Catch: java.lang.Exception -> L5f
                r1.v0()     // Catch: java.lang.Exception -> L5f
                minefarts.iptvsmarters.view.fragment.SearchFragment r1 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L5f
                a.l.d.e r1 = r1.getActivity()     // Catch: java.lang.Exception -> L5f
                minefarts.iptvsmarters.view.activity.SearchActivity r1 = (minefarts.iptvsmarters.view.activity.SearchActivity) r1     // Catch: java.lang.Exception -> L5f
                r1.P0(r5)     // Catch: java.lang.Exception -> L5f
                minefarts.iptvsmarters.view.fragment.SearchFragment r5 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L5f
                a.l.d.e r5 = r5.getActivity()     // Catch: java.lang.Exception -> L5f
                minefarts.iptvsmarters.view.activity.SearchActivity r5 = (minefarts.iptvsmarters.view.activity.SearchActivity) r5     // Catch: java.lang.Exception -> L5f
                r5.Y0()     // Catch: java.lang.Exception -> L5f
                minefarts.iptvsmarters.view.fragment.SearchFragment r5 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L5f
                a.l.d.e r5 = r5.getActivity()     // Catch: java.lang.Exception -> L5f
                minefarts.iptvsmarters.view.activity.SearchActivity r5 = (minefarts.iptvsmarters.view.activity.SearchActivity) r5     // Catch: java.lang.Exception -> L5f
                r5.X0()     // Catch: java.lang.Exception -> L5f
                goto L5f
            L49:
                minefarts.iptvsmarters.view.fragment.SearchFragment r5 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L5f
                a.l.d.e r5 = r5.getActivity()     // Catch: java.lang.Exception -> L5f
                minefarts.iptvsmarters.view.activity.SearchActivity r5 = (minefarts.iptvsmarters.view.activity.SearchActivity) r5     // Catch: java.lang.Exception -> L5f
                r5.y0()     // Catch: java.lang.Exception -> L5f
                minefarts.iptvsmarters.view.fragment.SearchFragment r5 = minefarts.iptvsmarters.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L5f
                a.l.d.e r5 = r5.getActivity()     // Catch: java.lang.Exception -> L5f
                minefarts.iptvsmarters.view.activity.SearchActivity r5 = (minefarts.iptvsmarters.view.activity.SearchActivity) r5     // Catch: java.lang.Exception -> L5f
                r5.x0()     // Catch: java.lang.Exception -> L5f
            L5f:
                minefarts.iptvsmarters.view.fragment.SearchFragment$c r5 = new minefarts.iptvsmarters.view.fragment.SearchFragment$c
                minefarts.iptvsmarters.view.fragment.SearchFragment r1 = minefarts.iptvsmarters.view.fragment.SearchFragment.this
                r5.<init>()
                java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
                java.lang.String[] r0 = new java.lang.String[r0]
                r2 = 0
                minefarts.iptvsmarters.view.fragment.SearchFragment r3 = minefarts.iptvsmarters.view.fragment.SearchFragment.this
                java.lang.String r3 = minefarts.iptvsmarters.view.fragment.SearchFragment.W(r3)
                r0[r2] = r3
                android.os.AsyncTask r5 = r5.executeOnExecutor(r1, r0)
                c.h.a.h.n.e.f17066h = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.fragment.SearchFragment.d.onPostExecute(java.util.ArrayList):void");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public final class e implements c0 {
        public e() {
        }

        @Override // a.n.q.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.a aVar, Object obj, p0.b bVar, m0 m0Var) {
        }
    }

    public final ArrayList<XMLTVProgrammePojo> e0() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(new c.h.a.k.d.a.a(this.G).C()));
            return this.F.x1(this.D, simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.G))));
        } catch (Exception unused) {
            return null;
        }
    }

    public final ArrayList<c.h.a.i.f> g0() {
        return this.F.L1(this.D);
    }

    public final ArrayList<SeriesDBModel> h0() {
        return this.F.M1(this.D);
    }

    public final boolean i0(String str) {
        a.l.d.e activity = getActivity();
        this.G = activity;
        return activity.getPackageManager().checkPermission(str, this.G.getPackageName()) == 0;
    }

    @Override // a.n.m.d.i
    public y k() {
        return this.C;
    }

    public boolean l0() {
        return this.C.i() > 0 && this.E;
    }

    public final void m0() {
        ((SearchActivity) getActivity()).r0();
        ((SearchActivity) getActivity()).t0();
        ((SearchActivity) getActivity()).y0();
        ((SearchActivity) getActivity()).w0();
        ((SearchActivity) getActivity()).q0();
        ((SearchActivity) getActivity()).s0();
        ((SearchActivity) getActivity()).x0();
        ((SearchActivity) getActivity()).v0();
    }

    public final void n0(String str) {
        AsyncTask asyncTask = c.h.a.h.n.e.f17066h;
        if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            c.h.a.h.n.e.f17066h.cancel(true);
        }
        this.H = false;
        if (TextUtils.isEmpty(str) || str.equals("nil")) {
            m0();
            ((SearchActivity) getActivity()).U0("Search any Channel, Movies and Series");
        } else {
            this.D = str;
            c.h.a.h.n.e.f17066h = new d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 16) {
            return;
        }
        if (i3 == -1) {
            C(intent, true);
        } else {
            if (l0()) {
                return;
            }
            Log.v("SearchFragment", "Voice search canceled");
            getView().findViewById(R.id.lb_search_bar_speech_orb).requestFocus();
        }
    }

    @Override // a.n.m.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.C = new a.n.q.a(new v());
        this.G = getActivity();
        this.F = new f(this.G);
        a.i.i.d.b(this.G, "android.permission.RECORD_AUDIO");
        a.i.h.a.q(getActivity(), new String[]{"android.permission.RECORD_AUDIO"}, 1);
        G(this);
        B(new e());
        Log.d("SearchFragment", "User is initiating a search. Do we have RECORD_AUDIO permission? " + i0("android.permission.RECORD_AUDIO"));
        Log.d("SearchFragment", !i0("android.permission.RECORD_AUDIO") ? "Does not have RECORD_AUDIO, using SpeechRecognitionCallback" : "We DO have RECORD_AUDIO");
    }

    @Override // a.n.m.d, androidx.fragment.app.Fragment
    public void onPause() {
        this.B.removeCallbacksAndMessages(null);
        super.onPause();
    }

    @Override // a.n.m.d.i
    public boolean onQueryTextChange(String str) {
        Log.i("SearchFragment", String.format("Search text changed: %s", str));
        if (!str.equals(this.D)) {
            n0(str);
        }
        return true;
    }

    @Override // a.n.m.d.i
    public boolean onQueryTextSubmit(String str) {
        Log.i("SearchFragment", String.format("Search text submitted: %s", str));
        if (!str.equals(this.D)) {
            n0(str);
        }
        return true;
    }
}
