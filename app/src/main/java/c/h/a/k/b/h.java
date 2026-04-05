package c.h.a.k.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class h extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<String> f17471b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<String> f17473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f17474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f17475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.h.a.i.q.a f17476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f17477h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17480k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17481l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17482m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17483n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17484o = 0;
    public int p = 0;
    public int q = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<Integer> f17478i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<Integer> f17479j = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f17472c = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f17485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f17486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f17487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f17488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f17489e;
    }

    public h(Context context, List<String> list) {
        this.f17473d = null;
        this.f17473d = list;
        this.f17471b = list;
        this.f17475f = context;
        this.f17474e = LayoutInflater.from(context);
        this.f17476g = new c.h.a.i.q.a(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f17473d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        return this.f17473d.get(i2);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2 A[Catch: Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:13:0x008a, B:15:0x00b8, B:16:0x00bc, B:23:0x00dc, B:25:0x00e2, B:27:0x00ec, B:28:0x00f2, B:29:0x00f6, B:30:0x00ff, B:17:0x00c0, B:19:0x00c6, B:20:0x00d1, B:22:0x00d7), top: B:35:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff A[Catch: Exception -> 0x010f, TRY_LEAVE, TryCatch #0 {Exception -> 0x010f, blocks: (B:13:0x008a, B:15:0x00b8, B:16:0x00bc, B:23:0x00dc, B:25:0x00e2, B:27:0x00ec, B:28:0x00f2, B:29:0x00f6, B:30:0x00ff, B:17:0x00c0, B:19:0x00c6, B:20:0x00d1, B:22:0x00d7), top: B:35:0x008a }] */
    @Override // android.widget.Adapter
    @android.annotation.SuppressLint({"InflateParams"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.k.b.h.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
