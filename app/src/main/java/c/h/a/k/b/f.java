package c.h.a.k.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class f extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<String> f17442b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<String> f17444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f17445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f17446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.h.a.i.q.a f17447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f17448h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public File f17451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public File f17452l;
    public String s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17453m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17454n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17455o = 0;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int t = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<Integer> f17449i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<Integer> f17450j = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f17443c = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f17456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f17457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f17458c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f17459d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f17460e;
    }

    public f(Context context, List<String> list) {
        this.f17444d = null;
        this.f17444d = list;
        this.f17442b = list;
        this.f17446f = context;
        this.f17445e = LayoutInflater.from(context);
        this.f17447g = new c.h.a.i.q.a(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f17444d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        return this.f17444d.get(i2);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x048b A[Catch: all -> 0x05cc, Exception -> 0x05cf, TryCatch #1 {Exception -> 0x05cf, blocks: (B:55:0x0215, B:58:0x0228, B:59:0x022c, B:140:0x046e, B:142:0x048b, B:143:0x04d6, B:145:0x04e6, B:146:0x04f9, B:147:0x04fe, B:149:0x050c, B:151:0x051c, B:153:0x052a, B:155:0x0532, B:156:0x0546, B:158:0x054e, B:159:0x0561, B:161:0x056d, B:163:0x0575, B:165:0x0583, B:166:0x05a2, B:167:0x05b7, B:61:0x0237, B:63:0x0245, B:64:0x024a, B:66:0x025b, B:67:0x0263, B:70:0x0283, B:72:0x0291, B:74:0x029f, B:76:0x02ad, B:78:0x02bb, B:80:0x02c9, B:82:0x02d7, B:84:0x02e5, B:86:0x02f7, B:88:0x0307, B:89:0x030e, B:91:0x0315, B:93:0x0323, B:94:0x032b, B:96:0x033b, B:99:0x034d, B:101:0x035d, B:104:0x036f, B:106:0x037d, B:108:0x038b, B:110:0x0399, B:112:0x03a7, B:114:0x03b5, B:116:0x03c3, B:119:0x03d3, B:121:0x03db, B:123:0x03e9, B:125:0x03f7, B:127:0x0405, B:129:0x0413, B:131:0x0421, B:133:0x042f, B:135:0x043d, B:136:0x0446, B:137:0x044f, B:138:0x045a, B:139:0x0465), top: B:180:0x0215, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04d6 A[Catch: all -> 0x05cc, Exception -> 0x05cf, TryCatch #1 {Exception -> 0x05cf, blocks: (B:55:0x0215, B:58:0x0228, B:59:0x022c, B:140:0x046e, B:142:0x048b, B:143:0x04d6, B:145:0x04e6, B:146:0x04f9, B:147:0x04fe, B:149:0x050c, B:151:0x051c, B:153:0x052a, B:155:0x0532, B:156:0x0546, B:158:0x054e, B:159:0x0561, B:161:0x056d, B:163:0x0575, B:165:0x0583, B:166:0x05a2, B:167:0x05b7, B:61:0x0237, B:63:0x0245, B:64:0x024a, B:66:0x025b, B:67:0x0263, B:70:0x0283, B:72:0x0291, B:74:0x029f, B:76:0x02ad, B:78:0x02bb, B:80:0x02c9, B:82:0x02d7, B:84:0x02e5, B:86:0x02f7, B:88:0x0307, B:89:0x030e, B:91:0x0315, B:93:0x0323, B:94:0x032b, B:96:0x033b, B:99:0x034d, B:101:0x035d, B:104:0x036f, B:106:0x037d, B:108:0x038b, B:110:0x0399, B:112:0x03a7, B:114:0x03b5, B:116:0x03c3, B:119:0x03d3, B:121:0x03db, B:123:0x03e9, B:125:0x03f7, B:127:0x0405, B:129:0x0413, B:131:0x0421, B:133:0x042f, B:135:0x043d, B:136:0x0446, B:137:0x044f, B:138:0x045a, B:139:0x0465), top: B:180:0x0215, outer: #4 }] */
    @Override // android.widget.Adapter
    @android.annotation.SuppressLint({"InflateParams"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r23, android.view.View r24, android.view.ViewGroup r25) {
        /*
            Method dump skipped, instruction units count: 1497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.k.b.f.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
