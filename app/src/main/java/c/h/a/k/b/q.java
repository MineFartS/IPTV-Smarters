package c.h.a.k.b;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.fragment.ParentalControlCategoriesFragment;
import minefarts.iptvsmarters.view.fragment.ParentalControlM3UFragment;
import minefarts.iptvsmarters.view.fragment.ParentalControlRadioCategoriesFragment;
import minefarts.iptvsmarters.view.fragment.ParentalControlSeriesCatFragment;
import minefarts.iptvsmarters.view.fragment.ParentalControlSettingFragment;
import minefarts.iptvsmarters.view.fragment.ParentalControlVODCatFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class q extends a.l.d.w {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String[] f17577j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17578k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f17579l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Context f17580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<Integer> f17581n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17582o;

    public q(a.l.d.n nVar, int i2, Context context, ArrayList<Integer> arrayList, String str) {
        super(nVar);
        this.f17577j = new String[5];
        this.f17578k = 4;
        this.f17581n = new ArrayList<>();
        this.f17582o = false;
        this.f17578k = i2;
        this.f17580m = context;
        this.f17579l = str;
        this.f17581n = arrayList;
        if (str.equals("m3u")) {
            String[] strArr = this.f17577j;
            strArr[0] = "ALL";
            strArr[1] = this.f17580m.getResources().getString(R.string.update_password_heading);
        } else {
            this.f17577j[0] = this.f17580m.getResources().getString(R.string.categories);
            this.f17577j[1] = this.f17580m.getResources().getString(R.string.vod_categories);
            this.f17577j[2] = this.f17580m.getResources().getString(R.string.series_categories);
            this.f17577j[3] = this.f17580m.getResources().getString(R.string.radio_categories);
            this.f17577j[4] = this.f17580m.getResources().getString(R.string.update_password_heading);
        }
    }

    @Override // a.e0.a.a
    public int c() {
        return this.f17578k;
    }

    @Override // a.l.d.w
    public Fragment p(int i2) {
        if (this.f17579l.equals("m3u")) {
            if (i2 == 0) {
                return new ParentalControlM3UFragment();
            }
            if (i2 != 1) {
                return null;
            }
            return new ParentalControlSettingFragment();
        }
        if (i2 == 0) {
            return new ParentalControlCategoriesFragment();
        }
        if (i2 == 1) {
            return new ParentalControlVODCatFragment();
        }
        if (i2 == 2) {
            return new ParentalControlSeriesCatFragment();
        }
        if (i2 == 3) {
            return new ParentalControlRadioCategoriesFragment();
        }
        if (i2 != 4) {
            return null;
        }
        return new ParentalControlSettingFragment();
    }

    public View q(int i2) {
        View viewInflate = LayoutInflater.from(this.f17580m).inflate(R.layout.tablayout_invoices, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.tv_tab_service_name)).setText(this.f17577j[i2]);
        return viewInflate;
    }

    public void r(View view, Typeface typeface, int i2) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.tv_tab_service_name);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#ffffff"));
        }
    }

    public void s(View view, Typeface typeface) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.tv_tab_service_name);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#ffffff"));
        }
    }

    public void t(View view, Typeface typeface, int i2) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.tv_tab_service_name);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#ffffff"));
        }
    }

    public void u(View view, Typeface typeface) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.tv_tab_service_name);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#ffffff"));
        }
    }

    public void v(View view, Typeface typeface) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.tv_tab_service_name);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#000000"));
        }
    }

    public void w(View view, Typeface typeface) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.tv_tab_service_name);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#000000"));
        }
    }

    public void x(View view, Typeface typeface) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.tv_tab_service_name);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#000000"));
        }
    }

    public void y(View view, Typeface typeface) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.tv_tab_service_name);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#000000"));
        }
    }
}
