package c.f.a.c.d.u.u;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import c.f.a.c.d.u.l;
import c.f.a.c.d.u.m;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends ArrayAdapter<MediaTrack> implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12026c;

    public i0(Context context, List<MediaTrack> list, int i2) {
        super(context, m.f11883d, list == null ? new ArrayList<>() : list);
        this.f12026c = -1;
        this.f12025b = context;
        this.f12026c = i2;
    }

    public final MediaTrack a() {
        int i2 = this.f12026c;
        if (i2 < 0 || i2 >= getCount()) {
            return null;
        }
        return getItem(this.f12026c);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        k0 k0Var;
        String string;
        if (view == null) {
            view = ((LayoutInflater) this.f12025b.getSystemService("layout_inflater")).inflate(m.f11883d, viewGroup, false);
            k0Var = new k0(this, (TextView) view.findViewById(l.R), (RadioButton) view.findViewById(l.L));
            view.setTag(k0Var);
        } else {
            k0Var = (k0) view.getTag();
        }
        if (k0Var == null) {
            return null;
        }
        k0Var.f12061b.setTag(Integer.valueOf(i2));
        k0Var.f12061b.setChecked(this.f12026c == i2);
        view.setOnClickListener(this);
        MediaTrack item = getItem(i2);
        String name = item.getName();
        if (!TextUtils.isEmpty(name)) {
            string = name;
        } else if (item.N() == 2) {
            string = this.f12025b.getString(c.f.a.c.d.u.n.x);
        } else {
            if (!TextUtils.isEmpty(item.L())) {
                String displayLanguage = e.b(item).getDisplayLanguage();
                if (!TextUtils.isEmpty(displayLanguage)) {
                    string = displayLanguage;
                }
            }
            name = this.f12025b.getString(c.f.a.c.d.u.n.y, Integer.valueOf(i2 + 1));
            string = name;
        }
        k0Var.f12060a.setText(string);
        return view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f12026c = ((Integer) ((k0) view.getTag()).f12061b.getTag()).intValue();
        notifyDataSetChanged();
    }
}
