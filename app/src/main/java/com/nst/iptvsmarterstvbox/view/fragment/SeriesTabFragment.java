package com.nst.iptvsmarterstvbox.view.fragment;

import a.b.k.b;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.h.a.h.n.e;
import c.h.a.i.q.f;
import c.h.a.i.q.i;
import c.h.a.i.q.m;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.callback.SeriesDBModel;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.SettingsActivity;
import com.nst.iptvsmarterstvbox.view.adapter.SeriesStreamsAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class SeriesTabFragment extends Fragment {
    public PopupWindow A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView.p f29077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f29078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SeriesStreamsAdapter f29079d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Toolbar f29081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f29082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.h.a.i.q.a f29083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Unbinder f29084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f29085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f29086k;

    @BindView
    public RecyclerView myRecyclerView;

    @BindView
    public ProgressBar pbLoader;
    public ArrayList<i> q;
    public ArrayList<c.h.a.i.f> r;
    public ArrayList<c.h.a.i.f> s;
    public ArrayList<SeriesDBModel> t;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;
    public ArrayList<c.h.a.i.f> u;
    public ArrayList<c.h.a.i.f> v;
    public SharedPreferences w;
    public SharedPreferences.Editor x;
    public SharedPreferences y;
    public SharedPreferences.Editor z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<SeriesDBModel> f29080e = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.b f29087l = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.b f29088m = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.h.a.i.f f29089n = new c.h.a.i.f();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<?> f29090o = new ArrayList<>();
    public ArrayList<String> p = new ArrayList<>();

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            e.O(SeriesTabFragment.this.f29082g);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesTabFragment.this.A.dismiss();
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f29094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f29095c;

        public d(RadioGroup radioGroup, View view) {
            this.f29094b = radioGroup;
            this.f29095c = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor editor;
            String str;
            RadioButton radioButton = (RadioButton) this.f29095c.findViewById(this.f29094b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(SeriesTabFragment.this.getResources().getString(R.string.sort_last_added))) {
                editor = SeriesTabFragment.this.z;
                str = "1";
            } else if (radioButton.getText().toString().equals(SeriesTabFragment.this.getResources().getString(R.string.sort_atoz))) {
                editor = SeriesTabFragment.this.z;
                str = "2";
            } else if (radioButton.getText().toString().equals(SeriesTabFragment.this.getResources().getString(R.string.sort_ztoa))) {
                editor = SeriesTabFragment.this.z;
                str = "3";
            } else {
                editor = SeriesTabFragment.this.z;
                str = "0";
            }
            editor.putString("sort", str);
            SeriesTabFragment.this.z.commit();
            SeriesTabFragment seriesTabFragment = SeriesTabFragment.this;
            seriesTabFragment.w = seriesTabFragment.getActivity().getSharedPreferences("listgridview", 0);
            SeriesTabFragment seriesTabFragment2 = SeriesTabFragment.this;
            seriesTabFragment2.x = seriesTabFragment2.w.edit();
            int i2 = SeriesTabFragment.this.w.getInt("livestream", 0);
            c.h.a.h.n.a.u = i2;
            if (i2 == 1) {
                SeriesTabFragment.this.y();
            } else {
                SeriesTabFragment.this.z();
            }
            SeriesTabFragment.this.A.dismiss();
        }
    }

    public final void B() {
        this.f29081f = (Toolbar) getActivity().findViewById(R.id.toolbar);
    }

    public final void C() {
        a();
        if (this.f29082g != null) {
            f fVar = new f(this.f29082g);
            this.q = new ArrayList<>();
            this.r = new ArrayList<>();
            this.s = new ArrayList<>();
            this.t = new ArrayList<>();
            this.u = new ArrayList<>();
            this.v = new ArrayList<>();
            ArrayList<SeriesDBModel> arrayListM1 = fVar.m1(this.f29085j);
            this.t = arrayListM1;
            if (arrayListM1 == null || this.myRecyclerView == null || arrayListM1.size() == 0) {
                b();
                return;
            }
            b();
            this.t = arrayListM1;
            SeriesStreamsAdapter seriesStreamsAdapter = new SeriesStreamsAdapter(arrayListM1, getContext());
            this.f29079d = seriesStreamsAdapter;
            this.myRecyclerView.setAdapter(seriesStreamsAdapter);
            this.f29079d.w();
        }
    }

    public final void E(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.sort_layout, (RelativeLayout) activity.findViewById(R.id.rl_password_prompt));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.A = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.A.setWidth(-1);
            this.A.setHeight(-1);
            this.A.setFocusable(true);
            this.A.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(R.id.bt_save_password);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.rg_radio);
            RadioButton radioButton = (RadioButton) viewInflate.findViewById(R.id.rb_normal);
            RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(R.id.rb_lastadded);
            RadioButton radioButton3 = (RadioButton) viewInflate.findViewById(R.id.rb_atoz);
            RadioButton radioButton4 = (RadioButton) viewInflate.findViewById(R.id.rb_ztoa);
            String string = this.y.getString("sort", BuildConfig.FLAVOR);
            radioButton2.setVisibility(8);
            if (string.equals("1")) {
                radioButton2.setChecked(true);
            } else if (string.equals("2")) {
                radioButton3.setChecked(true);
            } else if (string.equals("3")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new c());
            button.setOnClickListener(new d(radioGroup, viewInflate));
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    public void b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29085j = getArguments().getString(BuildConfig.FLAVOR);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f29082g == null || this.f29081f == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (this.f29082g.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f29082g.getResources().getDisplayMetrics());
        }
        for (int i2 = 0; i2 < this.f29081f.getChildCount(); i2++) {
            if (this.f29081f.getChildAt(i2) instanceof ActionMenuView) {
                ((Toolbar.e) this.f29081f.getChildAt(i2).getLayoutParams()).f135a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_live_streams, viewGroup, false);
        this.f29084i = ButterKnife.b(this, viewInflate);
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("sort_series", 0);
        this.y = sharedPreferences;
        this.z = sharedPreferences.edit();
        if (this.y.getString("sort", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            this.z.putString("sort", "0");
            this.z.commit();
        }
        a.i.h.a.n(getActivity());
        setHasOptionsMenu(true);
        B();
        SharedPreferences sharedPreferences2 = getActivity().getSharedPreferences("listgridview", 0);
        this.w = sharedPreferences2;
        this.x = sharedPreferences2.edit();
        int i2 = this.w.getInt("livestream", 0);
        c.h.a.h.n.a.u = i2;
        if (i2 == 1) {
            y();
        } else {
            z();
        }
        String str = this.f29085j;
        if (str != null && str.equals("-1")) {
            w();
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29084i.a();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this.f29082g, (Class<?>) NewDashboardActivity.class));
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this.f29082g, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout1 && (context = this.f29082g) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new b()).g(getResources().getString(R.string.no), new a()).n();
        }
        if (itemId == R.id.action_search || itemId == R.id.menu_load_channels_vod1 || itemId == R.id.menu_load_tv_guide1) {
            return true;
        }
        if (itemId == R.id.layout_view_grid) {
            this.x.putInt("livestream", 1);
            this.x.commit();
            y();
        }
        if (itemId == R.id.layout_view_linear) {
            this.x.putInt("livestream", 0);
            this.x.commit();
            z();
        }
        if (itemId == R.id.menu_sort) {
            E(getActivity());
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        menu.clear();
    }

    public void w() {
        ArrayList<SeriesDBModel> arrayList;
        ArrayList<SeriesDBModel> arrayList2;
        this.f29080e.clear();
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f29079d);
        }
        if (this.f29082g != null) {
            c.h.a.i.q.a aVar = new c.h.a.i.q.a(this.f29082g);
            this.f29083h = aVar;
            Iterator<c.h.a.i.b> it = aVar.p("series", m.z(this.f29082g)).iterator();
            while (it.hasNext()) {
                SeriesDBModel seriesDBModelO1 = this.f29086k.O1(String.valueOf(it.next().e()));
                if (seriesDBModelO1 != null) {
                    this.f29080e.add(seriesDBModelO1);
                }
            }
            if (this.myRecyclerView != null && (arrayList2 = this.f29080e) != null && arrayList2.size() != 0) {
                b();
                SeriesStreamsAdapter seriesStreamsAdapter = new SeriesStreamsAdapter(this.f29080e, getContext());
                this.f29079d = seriesStreamsAdapter;
                this.myRecyclerView.setAdapter(seriesStreamsAdapter);
                this.f29079d.w();
                this.tvNoStream.setVisibility(4);
            }
            if (this.tvNoStream == null || (arrayList = this.f29080e) == null || arrayList.size() != 0) {
                return;
            }
            b();
            RecyclerView recyclerView2 = this.myRecyclerView;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.f29079d);
            }
            this.tvNoStream.setVisibility(0);
        }
    }

    public final void y() {
        this.f29082g = getContext();
        this.f29086k = new f(this.f29082g);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f29082g == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), e.y(this.f29082g) + 1);
        this.f29077b = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        SharedPreferences sharedPreferences = this.f29082g.getSharedPreferences("loginPrefs", 0);
        this.f29078c = sharedPreferences;
        sharedPreferences.getString("username", BuildConfig.FLAVOR);
        this.f29078c.getString("password", BuildConfig.FLAVOR);
        C();
    }

    public final void z() {
        this.f29082g = getContext();
        this.f29086k = new f(this.f29082g);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f29082g == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f29077b = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        SharedPreferences sharedPreferences = this.f29082g.getSharedPreferences("loginPrefs", 0);
        this.f29078c = sharedPreferences;
        sharedPreferences.getString("username", BuildConfig.FLAVOR);
        this.f29078c.getString("password", BuildConfig.FLAVOR);
        C();
    }
}
