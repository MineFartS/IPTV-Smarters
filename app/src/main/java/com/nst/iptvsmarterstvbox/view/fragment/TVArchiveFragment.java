package minefarts.iptvsmarters.view.fragment;

import a.b.k.b;
import a.i.r.j;
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
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.h.a.i.q.m;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.activity.NewDashboardActivity;
import minefarts.iptvsmarters.view.activity.SettingsActivity;
import minefarts.iptvsmarters.view.adapter.TVArchiveAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class TVArchiveFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView.p f29114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f29115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TVArchiveAdapter f29116d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Toolbar f29118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SearchView f29119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f29120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Unbinder f29121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f29122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.f f29123k;

    @BindView
    public RecyclerView myRecyclerView;

    @BindView
    public ProgressBar pbLoader;
    public ArrayList<c.h.a.i.q.i> q;
    public ArrayList<c.h.a.i.f> r;
    public ArrayList<c.h.a.i.f> s;
    public ArrayList<c.h.a.i.f> t;

    @BindView
    public TextView tvEgpRequired;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;
    public ArrayList<c.h.a.i.f> u;
    public SharedPreferences v;
    public SharedPreferences.Editor w;
    public SharedPreferences x;
    public SharedPreferences.Editor y;
    public PopupWindow z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f29117e = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.b f29124l = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.b f29125m = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.h.a.i.f f29126n = new c.h.a.i.f();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<?> f29127o = new ArrayList<>();
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
            c.h.a.h.n.e.O(TVArchiveFragment.this.f29120h);
        }
    }

    public class c implements SearchView.l {
        public c() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            TVArchiveFragment.this.tvNoRecordFound.setVisibility(8);
            if (TVArchiveFragment.this.f29116d == null || (textView = TVArchiveFragment.this.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            TVArchiveFragment.this.f29116d.i0(str, TVArchiveFragment.this.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(TVArchiveFragment.this.f29120h);
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TVArchiveFragment.this.z.dismiss();
        }
    }

    public class i implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f29136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f29137c;

        public i(RadioGroup radioGroup, View view) {
            this.f29136b = radioGroup;
            this.f29137c = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor editor;
            String str;
            RadioButton radioButton = (RadioButton) this.f29137c.findViewById(this.f29136b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(TVArchiveFragment.this.getResources().getString(R.string.sort_last_added))) {
                editor = TVArchiveFragment.this.y;
                str = "1";
            } else if (radioButton.getText().toString().equals(TVArchiveFragment.this.getResources().getString(R.string.sort_atoz))) {
                editor = TVArchiveFragment.this.y;
                str = "2";
            } else if (radioButton.getText().toString().equals(TVArchiveFragment.this.getResources().getString(R.string.sort_ztoa))) {
                editor = TVArchiveFragment.this.y;
                str = "3";
            } else {
                editor = TVArchiveFragment.this.y;
                str = "0";
            }
            editor.putString("sort", str);
            TVArchiveFragment.this.y.commit();
            TVArchiveFragment tVArchiveFragment = TVArchiveFragment.this;
            tVArchiveFragment.v = tVArchiveFragment.getActivity().getSharedPreferences("listgridview", 0);
            TVArchiveFragment tVArchiveFragment2 = TVArchiveFragment.this;
            tVArchiveFragment2.w = tVArchiveFragment2.v.edit();
            int i2 = TVArchiveFragment.this.v.getInt("livestream", 0);
            c.h.a.h.n.a.u = i2;
            if (i2 == 1) {
                TVArchiveFragment.this.B();
            } else {
                TVArchiveFragment.this.C();
            }
            TVArchiveFragment.this.z.dismiss();
        }
    }

    public static TVArchiveFragment E(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(BuildConfig.FLAVOR, str);
        TVArchiveFragment tVArchiveFragment = new TVArchiveFragment();
        tVArchiveFragment.setArguments(bundle);
        return tVArchiveFragment;
    }

    public final void B() {
        this.f29120h = getContext();
        this.f29123k = new c.h.a.i.q.f(this.f29120h);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f29120h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), c.h.a.h.n.e.y(this.f29120h) + 1);
        this.f29114b = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        SharedPreferences sharedPreferences = this.f29120h.getSharedPreferences("loginPrefs", 0);
        this.f29115c = sharedPreferences;
        sharedPreferences.getString("username", BuildConfig.FLAVOR);
        this.f29115c.getString("password", BuildConfig.FLAVOR);
        G();
    }

    public final void C() {
        this.f29120h = getContext();
        this.f29123k = new c.h.a.i.q.f(this.f29120h);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f29120h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f29114b = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        SharedPreferences sharedPreferences = this.f29120h.getSharedPreferences("loginPrefs", 0);
        this.f29115c = sharedPreferences;
        sharedPreferences.getString("username", BuildConfig.FLAVOR);
        this.f29115c.getString("password", BuildConfig.FLAVOR);
        G();
    }

    public final void F() {
        this.f29118f = (Toolbar) getActivity().findViewById(R.id.toolbar);
    }

    public final void G() {
        try {
            a();
            if (this.f29120h != null) {
                c.h.a.i.q.f fVar = new c.h.a.i.q.f(this.f29120h);
                this.q = new ArrayList<>();
                this.r = new ArrayList<>();
                this.s = new ArrayList<>();
                this.t = new ArrayList<>();
                this.u = new ArrayList<>();
                ArrayList<c.h.a.i.f> arrayListU0 = fVar.U0(this.f29122j);
                if (fVar.I1(m.z(this.f29120h)) <= 0 || arrayListU0 == null) {
                    this.t = arrayListU0;
                } else {
                    ArrayList<String> arrayListY = y();
                    this.p = arrayListY;
                    if (arrayListY != null) {
                        this.s = z(arrayListU0, arrayListY);
                    }
                    this.t = this.s;
                }
                ArrayList<c.h.a.i.f> arrayList = this.t;
                if (arrayList != null && this.myRecyclerView != null && arrayList.size() != 0) {
                    b();
                    TVArchiveAdapter tVArchiveAdapter = new TVArchiveAdapter(this.t, getContext());
                    this.f29116d = tVArchiveAdapter;
                    this.myRecyclerView.setAdapter(tVArchiveAdapter);
                    this.f29116d.w();
                    return;
                }
                b();
                TextView textView = this.tvNoStream;
                if (textView != null) {
                    textView.setText(getResources().getString(R.string.no_record_found));
                    this.tvNoStream.setVisibility(0);
                }
                this.tvEgpRequired.setVisibility(0);
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public final void H(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.sort_layout, (RelativeLayout) activity.findViewById(R.id.rl_password_prompt));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.z = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.z.setWidth(-1);
            this.z.setHeight(-1);
            this.z.setFocusable(true);
            this.z.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(R.id.bt_save_password);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.rg_radio);
            RadioButton radioButton = (RadioButton) viewInflate.findViewById(R.id.rb_normal);
            RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(R.id.rb_lastadded);
            RadioButton radioButton3 = (RadioButton) viewInflate.findViewById(R.id.rb_atoz);
            RadioButton radioButton4 = (RadioButton) viewInflate.findViewById(R.id.rb_ztoa);
            String string = this.x.getString("sort", BuildConfig.FLAVOR);
            if (string.equals("1")) {
                radioButton2.setChecked(true);
            } else if (string.equals("2")) {
                radioButton3.setChecked(true);
            } else if (string.equals("3")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new h());
            button.setOnClickListener(new i(radioGroup, viewInflate));
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
        this.f29122j = getArguments().getString(BuildConfig.FLAVOR);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f29120h == null || this.f29118f == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (this.f29120h.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f29120h.getResources().getDisplayMetrics());
        }
        for (int i2 = 0; i2 < this.f29118f.getChildCount(); i2++) {
            if (this.f29118f.getChildAt(i2) instanceof ActionMenuView) {
                ((Toolbar.e) this.f29118f.getChildAt(i2).getLayoutParams()).f135a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_live_streams, viewGroup, false);
        this.f29121i = ButterKnife.b(this, viewInflate);
        a.i.h.a.n(getActivity());
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("sort", 0);
        this.x = sharedPreferences;
        this.y = sharedPreferences.edit();
        if (this.x.getString("sort", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            this.y.putString("sort", "0");
            this.y.commit();
        }
        setHasOptionsMenu(true);
        F();
        SharedPreferences sharedPreferences2 = getActivity().getSharedPreferences("listgridview", 0);
        this.v = sharedPreferences2;
        this.w = sharedPreferences2.edit();
        int i2 = this.v.getInt("livestream", 0);
        c.h.a.h.n.a.u = i2;
        if (i2 == 1) {
            B();
        } else {
            C();
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29121i.a();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this.f29120h, (Class<?>) NewDashboardActivity.class));
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this.f29120h, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout1 && (context = this.f29120h) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new b()).g(getResources().getString(R.string.no), new a()).n();
        }
        if (itemId == R.id.action_search) {
            SearchView searchView = (SearchView) j.b(menuItem);
            this.f29119g = searchView;
            searchView.setQueryHint(getResources().getString(R.string.search_channel));
            this.f29119g.setIconifiedByDefault(false);
            this.f29119g.setOnQueryTextListener(new c());
            return true;
        }
        if (itemId == R.id.menu_load_channels_vod1) {
            b.a aVar = new b.a(this.f29120h);
            aVar.setTitle(this.f29120h.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f29120h.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(getResources().getString(R.string.yes), new d());
            aVar.g(getResources().getString(R.string.no), new e());
            aVar.n();
            return true;
        }
        if (itemId == R.id.menu_load_tv_guide1) {
            b.a aVar2 = new b.a(this.f29120h);
            aVar2.setTitle(this.f29120h.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.f29120h.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.f29120h.getResources().getString(R.string.yes), new f());
            aVar2.g(this.f29120h.getResources().getString(R.string.no), new g());
            aVar2.n();
            return true;
        }
        if (itemId == R.id.layout_view_grid) {
            this.w.putInt("livestream", 1);
            this.w.commit();
            B();
        }
        if (itemId == R.id.layout_view_linear) {
            this.w.putInt("livestream", 0);
            this.w.commit();
            C();
        }
        if (itemId == R.id.menu_sort) {
            H(getActivity());
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        this.f29118f.x(R.menu.menu_search_text_icon);
        menu.findItem(R.id.layout_view_grid);
    }

    public final ArrayList<String> y() {
        ArrayList<c.h.a.i.q.i> arrayListD1 = this.f29123k.d1(m.z(this.f29120h));
        this.q = arrayListD1;
        if (arrayListD1 != null) {
            for (c.h.a.i.q.i iVar : arrayListD1) {
                if (iVar.a().equals("1")) {
                    this.p.add(iVar.b());
                }
            }
        }
        return this.p;
    }

    public final ArrayList<c.h.a.i.f> z(ArrayList<c.h.a.i.f> arrayList, ArrayList<String> arrayList2) {
        ArrayList<c.h.a.i.f> arrayList3;
        if (arrayList == null) {
            return null;
        }
        for (c.h.a.i.f fVar : arrayList) {
            boolean z = false;
            if (arrayList2 != null) {
                Iterator<String> it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (fVar.g().equals(it.next())) {
                        z = true;
                        break;
                    }
                }
                if (!z && (arrayList3 = this.r) != null) {
                    arrayList3.add(fVar);
                }
            }
        }
        return this.r;
    }
}
