package c.h.a.k.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class u extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17652b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f17655e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f17657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.h.a.i.q.a f17658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.i.q.f f17659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f17660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f17661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f17662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.k.d.a.a f17663m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17664n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f17656f = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f17653c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f17654d = new ArrayList<>();

    public class b extends Filter {
        public b() {
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList<c.h.a.i.f> arrayList = u.this.f17653c;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                c.h.a.i.f fVar = arrayList.get(i2);
                if (fVar.getName().toLowerCase().contains(lowerCase) || fVar.P().contains(lowerCase)) {
                    arrayList2.add(fVar);
                }
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            TextView textView;
            int i2;
            try {
                u.this.f17654d = (ArrayList) filterResults.values;
                u.this.notifyDataSetChanged();
                if (u.this.f17654d.size() == 0) {
                    textView = u.this.f17661k;
                    i2 = 0;
                } else {
                    textView = u.this.f17661k;
                    i2 = 8;
                }
                textView.setVisibility(i2);
            } catch (Exception unused) {
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f17666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f17667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImageView f17668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f17669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f17670e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TextView f17671f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f17672g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ProgressBar f17673h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public TextView f17674i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public LinearLayout f17675j;
    }

    public u(Context context, ArrayList<c.h.a.i.f> arrayList) {
        this.f17662l = "mobile";
        this.f17657g = context;
        this.f17653c.clear();
        this.f17654d.clear();
        this.f17653c.addAll(arrayList);
        this.f17654d.addAll(arrayList);
        this.f17657g = context;
        this.f17655e = LayoutInflater.from(context);
        this.f17658h = new c.h.a.i.q.a(context);
        this.f17659i = new c.h.a.i.q.f(context);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(context);
        this.f17663m = aVar;
        this.f17664n = aVar.B();
        if (new c.h.a.k.d.a.a(context).A().equals(c.h.a.h.n.a.s0)) {
            this.f17662l = "tv";
        } else {
            this.f17662l = "mobile";
        }
    }

    public final void c() {
        this.f17652b = this.f17657g.getSharedPreferences("currentlyPlayingVideo", 0).getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
    }

    public final void d() {
        this.f17652b = this.f17657g.getSharedPreferences("currentlyPlayingVideo", 0).getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR);
    }

    public ArrayList<c.h.a.i.f> e() {
        return this.f17654d;
    }

    public void f(TextView textView) {
        this.f17661k = textView;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        try {
            return this.f17654d.size();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f17656f;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        return this.f17654d.get(i2);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0404 A[Catch: Exception -> 0x0458, TryCatch #2 {Exception -> 0x0458, blocks: (B:9:0x00ae, B:11:0x00b3, B:13:0x00c4, B:14:0x00e3, B:17:0x00f5, B:20:0x0110, B:22:0x011e, B:24:0x0146, B:26:0x0158, B:27:0x0168, B:35:0x01c9, B:37:0x01d7, B:48:0x01f4, B:50:0x0212, B:52:0x022a, B:54:0x0232, B:98:0x03f3, B:100:0x0404, B:102:0x0416, B:103:0x0440, B:105:0x0446, B:55:0x024c, B:56:0x0261, B:42:0x01e6, B:28:0x016c, B:29:0x017b, B:31:0x0197, B:33:0x01a9, B:34:0x01ba, B:57:0x0266, B:59:0x028e, B:61:0x02b6, B:63:0x02c8, B:64:0x02d8, B:73:0x033b, B:84:0x0358, B:86:0x0376, B:88:0x038e, B:90:0x0396, B:92:0x039c, B:96:0x03c3, B:93:0x03ae, B:95:0x03b2, B:97:0x03dc, B:78:0x034a, B:65:0x02dc, B:66:0x02eb, B:68:0x0307, B:70:0x0319, B:71:0x032a, B:12:0x00bb), top: B:114:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0440 A[Catch: Exception -> 0x0458, TryCatch #2 {Exception -> 0x0458, blocks: (B:9:0x00ae, B:11:0x00b3, B:13:0x00c4, B:14:0x00e3, B:17:0x00f5, B:20:0x0110, B:22:0x011e, B:24:0x0146, B:26:0x0158, B:27:0x0168, B:35:0x01c9, B:37:0x01d7, B:48:0x01f4, B:50:0x0212, B:52:0x022a, B:54:0x0232, B:98:0x03f3, B:100:0x0404, B:102:0x0416, B:103:0x0440, B:105:0x0446, B:55:0x024c, B:56:0x0261, B:42:0x01e6, B:28:0x016c, B:29:0x017b, B:31:0x0197, B:33:0x01a9, B:34:0x01ba, B:57:0x0266, B:59:0x028e, B:61:0x02b6, B:63:0x02c8, B:64:0x02d8, B:73:0x033b, B:84:0x0358, B:86:0x0376, B:88:0x038e, B:90:0x0396, B:92:0x039c, B:96:0x03c3, B:93:0x03ae, B:95:0x03b2, B:97:0x03dc, B:78:0x034a, B:65:0x02dc, B:66:0x02eb, B:68:0x0307, B:70:0x0319, B:71:0x032a, B:12:0x00bb), top: B:114:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0446 A[Catch: Exception -> 0x0458, TRY_LEAVE, TryCatch #2 {Exception -> 0x0458, blocks: (B:9:0x00ae, B:11:0x00b3, B:13:0x00c4, B:14:0x00e3, B:17:0x00f5, B:20:0x0110, B:22:0x011e, B:24:0x0146, B:26:0x0158, B:27:0x0168, B:35:0x01c9, B:37:0x01d7, B:48:0x01f4, B:50:0x0212, B:52:0x022a, B:54:0x0232, B:98:0x03f3, B:100:0x0404, B:102:0x0416, B:103:0x0440, B:105:0x0446, B:55:0x024c, B:56:0x0261, B:42:0x01e6, B:28:0x016c, B:29:0x017b, B:31:0x0197, B:33:0x01a9, B:34:0x01ba, B:57:0x0266, B:59:0x028e, B:61:0x02b6, B:63:0x02c8, B:64:0x02d8, B:73:0x033b, B:84:0x0358, B:86:0x0376, B:88:0x038e, B:90:0x0396, B:92:0x039c, B:96:0x03c3, B:93:0x03ae, B:95:0x03b2, B:97:0x03dc, B:78:0x034a, B:65:0x02dc, B:66:0x02eb, B:68:0x0307, B:70:0x0319, B:71:0x032a, B:12:0x00bb), top: B:114:0x00ae }] */
    @Override // android.widget.Adapter
    @android.annotation.SuppressLint({"InflateParams"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
            Method dump skipped, instruction units count: 1117
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.k.b.u.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
