package com.nst.iptvsmarterstvbox.view.fragment;

import a.n.q.v;
import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.i.q.f;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.callback.SeriesDBModel;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import org.joda.time.LocalDateTime;

/* JADX INFO: loaded from: classes2.dex */
public class SearchFragmentLowerSDK extends Fragment implements Filterable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.n.q.a f29062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f29063d;

    @BindView
    public EditText et_search;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f29066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f29067h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f29061b = new Handler();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29064e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f29065f = new e(this, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29068i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<String> f29069j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f29070k = 1;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            SearchFragmentLowerSDK.this.f29065f.filter(charSequence.toString());
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class b extends AsyncTask<String, Void, ArrayList<XMLTVProgrammePojo>> {
        public b() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<XMLTVProgrammePojo> doInBackground(String... strArr) {
            return SearchFragmentLowerSDK.this.j();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[Catch: Exception -> 0x0099, TryCatch #0 {Exception -> 0x0099, blocks: (B:4:0x0005, B:6:0x000b, B:8:0x0041, B:10:0x004f, B:12:0x005d, B:14:0x007f, B:16:0x0087, B:13:0x0069), top: B:19:0x0005 }] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onPostExecute(java.util.ArrayList<com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo> r3) {
            /*
                r2 = this;
                super.onPostExecute(r3)
                if (r3 == 0) goto L69
                int r0 = r3.size()     // Catch: java.lang.Exception -> L99
                if (r0 <= 0) goto L69
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r0 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                r1 = 1
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.e(r0, r1)     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r0 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r0 = r0.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r0 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r0     // Catch: java.lang.Exception -> L99
                r0.i()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r0 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r0 = r0.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r0 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r0     // Catch: java.lang.Exception -> L99
                r1 = 0
                r0.z(r3, r1)     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L99
                r3.J()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L99
                boolean r3 = r3.b()     // Catch: java.lang.Exception -> L99
                if (r3 != 0) goto L7f
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L99
                boolean r3 = r3.c()     // Catch: java.lang.Exception -> L99
                if (r3 != 0) goto L7f
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L99
                boolean r3 = r3.d()     // Catch: java.lang.Exception -> L99
                if (r3 != 0) goto L7f
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L99
                r3.I()     // Catch: java.lang.Exception -> L99
                goto L7f
            L69:
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L99
                r3.k()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L99
                r3.j()     // Catch: java.lang.Exception -> L99
            L7f:
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                boolean r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.d(r3)     // Catch: java.lang.Exception -> L99
                if (r3 != 0) goto L99
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.i(r3)     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L99
                java.lang.String r0 = "No Record Found"
                r3.H(r0)     // Catch: java.lang.Exception -> L99
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.b.onPostExecute(java.util.ArrayList):void");
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
            return SearchFragmentLowerSDK.this.k();
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
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.c.onPostExecute(java.util.ArrayList):void");
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
            return SearchFragmentLowerSDK.this.l();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0049 A[Catch: Exception -> 0x0060, TRY_LEAVE, TryCatch #0 {Exception -> 0x0060, blocks: (B:4:0x0006, B:6:0x000c, B:7:0x0049), top: B:14:0x0006 }] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onPostExecute(java.util.ArrayList<com.nst.iptvsmarterstvbox.model.callback.SeriesDBModel> r5) {
            /*
                r4 = this;
                super.onPostExecute(r5)
                r0 = 1
                if (r5 == 0) goto L49
                int r1 = r5.size()     // Catch: java.lang.Exception -> L60
                if (r1 <= 0) goto L49
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r1 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L60
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.e(r1, r0)     // Catch: java.lang.Exception -> L60
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r1 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L60
                android.app.Activity r1 = r1.getActivity()     // Catch: java.lang.Exception -> L60
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r1 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r1     // Catch: java.lang.Exception -> L60
                r1.i()     // Catch: java.lang.Exception -> L60
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r1 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L60
                android.app.Activity r1 = r1.getActivity()     // Catch: java.lang.Exception -> L60
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r1 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r1     // Catch: java.lang.Exception -> L60
                r1.j()     // Catch: java.lang.Exception -> L60
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r1 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L60
                android.app.Activity r1 = r1.getActivity()     // Catch: java.lang.Exception -> L60
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r1 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r1     // Catch: java.lang.Exception -> L60
                r1.C(r5)     // Catch: java.lang.Exception -> L60
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r5 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L60
                android.app.Activity r5 = r5.getActivity()     // Catch: java.lang.Exception -> L60
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r5 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r5     // Catch: java.lang.Exception -> L60
                r5.L()     // Catch: java.lang.Exception -> L60
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r5 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L60
                android.app.Activity r5 = r5.getActivity()     // Catch: java.lang.Exception -> L60
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r5 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r5     // Catch: java.lang.Exception -> L60
                r5.K()     // Catch: java.lang.Exception -> L60
                goto L7b
            L49:
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r5 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L60
                android.app.Activity r5 = r5.getActivity()     // Catch: java.lang.Exception -> L60
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r5 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r5     // Catch: java.lang.Exception -> L60
                r5.m()     // Catch: java.lang.Exception -> L60
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r5 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L60
                android.app.Activity r5 = r5.getActivity()     // Catch: java.lang.Exception -> L60
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r5 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r5     // Catch: java.lang.Exception -> L60
                r5.l()     // Catch: java.lang.Exception -> L60
                goto L7b
            L60:
                r5 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onPostExecute: "
                r1.append(r2)
                java.lang.String r5 = r5.getMessage()
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                java.lang.String r1 = "SearchFragmentLowerSDK"
                android.util.Log.e(r1, r5)
            L7b:
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK$c r5 = new com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK$c
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r1 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this
                r5.<init>()
                java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
                java.lang.String[] r0 = new java.lang.String[r0]
                r2 = 0
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this
                java.lang.String r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.f(r3)
                r0[r2] = r3
                android.os.AsyncTask r5 = r5.executeOnExecutor(r1, r0)
                c.h.a.h.n.e.f17066h = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.d.onPostExecute(java.util.ArrayList):void");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public class e extends Filter {
        public e() {
        }

        public /* synthetic */ e(SearchFragmentLowerSDK searchFragmentLowerSDK, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            SearchFragmentLowerSDK.this.n(charSequence.toString().toLowerCase());
            return new Filter.FilterResults();
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        }
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f29065f;
    }

    public final ArrayList<XMLTVProgrammePojo> j() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(new c.h.a.k.d.a.a(this.f29067h).C()));
        return this.f29066g.x1(this.f29063d, simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f29067h))));
    }

    public final ArrayList<c.h.a.i.f> k() {
        return this.f29066g.L1(this.f29063d);
    }

    public final ArrayList<SeriesDBModel> l() {
        return this.f29066g.M1(this.f29063d);
    }

    public final void m() {
        ((SearchActivityLowerSDK) getActivity()).f();
        ((SearchActivityLowerSDK) getActivity()).h();
        ((SearchActivityLowerSDK) getActivity()).m();
        ((SearchActivityLowerSDK) getActivity()).k();
        ((SearchActivityLowerSDK) getActivity()).e();
        ((SearchActivityLowerSDK) getActivity()).g();
        ((SearchActivityLowerSDK) getActivity()).l();
        ((SearchActivityLowerSDK) getActivity()).j();
    }

    public final void n(String str) {
        AsyncTask asyncTask = c.h.a.h.n.e.f17066h;
        if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            c.h.a.h.n.e.f17066h.cancel(true);
        }
        this.f29068i = false;
        if (!TextUtils.isEmpty(str) && !str.equals("nil")) {
            this.f29063d = str;
            c.h.a.h.n.e.f17066h = new d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            Log.e("SearchFragmentLowerSDK", "loadQuery: hide all tabs");
            m();
            ((SearchActivityLowerSDK) getActivity()).H("Search any Channel, Movies and Series");
        }
    }

    public final void o() {
        EditText editText = this.et_search;
        if (editText != null) {
            editText.addTextChangedListener(new a());
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29062c = new a.n.q.a(new v());
        this.f29067h = getActivity();
        this.f29066g = new f(this.f29067h);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(false);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_search_field, viewGroup, false);
        ButterKnife.b(this, viewInflate);
        o();
        return viewInflate;
    }
}
