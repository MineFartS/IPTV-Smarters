package c.f.a.d.x;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class g extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Calendar f15281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15283e;

    static {
        f15280b = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public g() {
        Calendar calendarK = s.k();
        this.f15281c = calendarK;
        this.f15282d = calendarK.getMaximum(7);
        this.f15283e = calendarK.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i2) {
        if (i2 >= this.f15282d) {
            return null;
        }
        return Integer.valueOf(b(i2));
    }

    public final int b(int i2) {
        int i3 = i2 + this.f15283e;
        int i4 = this.f15282d;
        return i3 > i4 ? i3 - i4 : i3;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f15282d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i2, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(c.f.a.d.h.f14839m, viewGroup, false);
        }
        this.f15281c.set(7, b(i2));
        textView.setText(this.f15281c.getDisplayName(7, f15280b, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(c.f.a.d.j.f14883n), this.f15281c.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
