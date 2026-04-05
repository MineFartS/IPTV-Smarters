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
import com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class t extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f17630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f17631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f17632e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f17634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.h.a.i.q.a f17635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.i.q.f f17636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f17637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f17638k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.k.d.a.a f17640m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17641n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f17633f = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17639l = false;

    public class b extends Filter {
        public b() {
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList<c.h.a.i.f> arrayList = t.this.f17630c;
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
            try {
                t.this.f17631d = (ArrayList) filterResults.values;
                t.this.notifyDataSetChanged();
                if (t.this.f17631d == null || t.this.f17631d.size() != 0) {
                    if (!t.this.f17638k.equals("mobile")) {
                        ((NSTIJKPlayerSkyTvActivity) t.this.f17634g).y2();
                    }
                } else if (!t.this.f17638k.equals("mobile")) {
                    ((NSTIJKPlayerSkyTvActivity) t.this.f17634g).J2();
                }
            } catch (Exception unused) {
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f17643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f17644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImageView f17645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f17646d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f17647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f17648f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ProgressBar f17649g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public TextView f17650h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public LinearLayout f17651i;
    }

    public t(Context context, ArrayList<c.h.a.i.f> arrayList) {
        this.f17631d = null;
        this.f17638k = "mobile";
        ArrayList<c.h.a.i.f> arrayList2 = new ArrayList<>();
        this.f17631d = arrayList2;
        arrayList2.addAll(arrayList);
        ArrayList<c.h.a.i.f> arrayList3 = new ArrayList<>();
        this.f17630c = arrayList3;
        arrayList3.addAll(arrayList);
        this.f17634g = context;
        this.f17632e = LayoutInflater.from(context);
        this.f17635h = new c.h.a.i.q.a(context);
        this.f17636i = new c.h.a.i.q.f(context);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(context);
        this.f17640m = aVar;
        this.f17641n = aVar.B();
        if (new c.h.a.k.d.a.a(context).A().equals(c.h.a.h.n.a.s0)) {
            this.f17638k = "tv";
        } else {
            this.f17638k = "mobile";
        }
    }

    public final void e() {
        this.f17629b = this.f17634g.getSharedPreferences("currentlyPlayingVideo", 0).getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
    }

    public final void f() {
        this.f17629b = this.f17634g.getSharedPreferences("currentlyPlayingVideo", 0).getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR);
    }

    public ArrayList<c.h.a.i.f> g() {
        return this.f17631d;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<c.h.a.i.f> arrayList = this.f17631d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f17633f;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        try {
            return this.f17631d.get(i2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x03a6 A[Catch: Exception -> 0x03fb, TryCatch #1 {Exception -> 0x03fb, blocks: (B:9:0x00a1, B:11:0x00a5, B:13:0x00b6, B:14:0x00d5, B:17:0x00e7, B:20:0x0101, B:22:0x010f, B:24:0x0137, B:26:0x0149, B:27:0x0159, B:35:0x01ba, B:37:0x01c8, B:48:0x01e5, B:50:0x01f0, B:52:0x0208, B:54:0x0210, B:92:0x0395, B:94:0x03a6, B:96:0x03b8, B:97:0x03e2, B:99:0x03e8, B:55:0x0223, B:56:0x0238, B:42:0x01d7, B:28:0x015d, B:29:0x016c, B:31:0x0188, B:33:0x019a, B:34:0x01ab, B:57:0x023d, B:59:0x026f, B:61:0x0297, B:63:0x02a9, B:64:0x02b9, B:73:0x031c, B:84:0x0339, B:86:0x0344, B:88:0x035c, B:90:0x0364, B:91:0x037e, B:78:0x032b, B:65:0x02bd, B:66:0x02cc, B:68:0x02e8, B:70:0x02fa, B:71:0x030b, B:12:0x00ad), top: B:106:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03e2 A[Catch: Exception -> 0x03fb, TryCatch #1 {Exception -> 0x03fb, blocks: (B:9:0x00a1, B:11:0x00a5, B:13:0x00b6, B:14:0x00d5, B:17:0x00e7, B:20:0x0101, B:22:0x010f, B:24:0x0137, B:26:0x0149, B:27:0x0159, B:35:0x01ba, B:37:0x01c8, B:48:0x01e5, B:50:0x01f0, B:52:0x0208, B:54:0x0210, B:92:0x0395, B:94:0x03a6, B:96:0x03b8, B:97:0x03e2, B:99:0x03e8, B:55:0x0223, B:56:0x0238, B:42:0x01d7, B:28:0x015d, B:29:0x016c, B:31:0x0188, B:33:0x019a, B:34:0x01ab, B:57:0x023d, B:59:0x026f, B:61:0x0297, B:63:0x02a9, B:64:0x02b9, B:73:0x031c, B:84:0x0339, B:86:0x0344, B:88:0x035c, B:90:0x0364, B:91:0x037e, B:78:0x032b, B:65:0x02bd, B:66:0x02cc, B:68:0x02e8, B:70:0x02fa, B:71:0x030b, B:12:0x00ad), top: B:106:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03e8 A[Catch: Exception -> 0x03fb, TRY_LEAVE, TryCatch #1 {Exception -> 0x03fb, blocks: (B:9:0x00a1, B:11:0x00a5, B:13:0x00b6, B:14:0x00d5, B:17:0x00e7, B:20:0x0101, B:22:0x010f, B:24:0x0137, B:26:0x0149, B:27:0x0159, B:35:0x01ba, B:37:0x01c8, B:48:0x01e5, B:50:0x01f0, B:52:0x0208, B:54:0x0210, B:92:0x0395, B:94:0x03a6, B:96:0x03b8, B:97:0x03e2, B:99:0x03e8, B:55:0x0223, B:56:0x0238, B:42:0x01d7, B:28:0x015d, B:29:0x016c, B:31:0x0188, B:33:0x019a, B:34:0x01ab, B:57:0x023d, B:59:0x026f, B:61:0x0297, B:63:0x02a9, B:64:0x02b9, B:73:0x031c, B:84:0x0339, B:86:0x0344, B:88:0x035c, B:90:0x0364, B:91:0x037e, B:78:0x032b, B:65:0x02bd, B:66:0x02cc, B:68:0x02e8, B:70:0x02fa, B:71:0x030b, B:12:0x00ad), top: B:106:0x00a1 }] */
    @Override // android.widget.Adapter
    @android.annotation.SuppressLint({"InflateParams"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
            Method dump skipped, instruction units count: 1024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.k.b.t.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
