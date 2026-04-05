package com.nst.iptvsmarterstvbox.view.fragment;

import a.b.k.b;
import a.y.e.c;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.h.a.h.n.e;
import com.nst.iptvsmarterstvbox.model.callback.LiveStreamsCallback;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.SettingsActivity;
import com.nst.iptvsmarterstvbox.view.adapter.SubTVArchiveAdapter;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class SubTVArchiveFragment extends Fragment implements c.h.a.k.f.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView.p f29098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SubTVArchiveAdapter f29099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<LiveStreamsCallback> f29100d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Toolbar f29101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f29102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Unbinder f29103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f29104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f29105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f29106j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f29107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f29108l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f29109m;

    @BindView
    public RecyclerView myRecyclerView;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f29110n;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

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
            e.O(SubTVArchiveFragment.this.f29102f);
        }
    }

    public static SubTVArchiveFragment n(String str, ArrayList<XMLTVProgrammePojo> arrayList, String str2, String str3, String str4, String str5, String str6, String str7) {
        Bundle bundle = new Bundle();
        bundle.putString("ACTIVE_LIVE_STREAM_CATEGORY_ID", str);
        bundle.putString("ACTIVE_LIVE_STREAM_ID", str2);
        bundle.putString("ACTIVE_LIVE_STREAM_NUM", str3);
        bundle.putString("ACTIVE_LIVE_STREAM_NAME", str4);
        bundle.putString("ACTIVE_LIVE_STREAM_ICON", str5);
        bundle.putString("ACTIVE_LIVE_STREAM_CHANNEL_ID", str6);
        bundle.putString("ACTIVE_LIVE_STREAM_CHANNEL_DURATION", str7);
        bundle.putSerializable("LIVE_STREAMS_EPG", arrayList);
        SubTVArchiveFragment subTVArchiveFragment = new SubTVArchiveFragment();
        subTVArchiveFragment.setArguments(bundle);
        return subTVArchiveFragment;
    }

    public final void l(int i2) {
        Context context = getContext();
        this.f29102f = context;
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || context == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f29098b = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.v1(i2);
        this.myRecyclerView.setItemAnimator(new c());
    }

    public void o() {
        String str;
        this.f29104h = getArguments().getString("ACTIVE_LIVE_STREAM_CATEGORY_ID");
        this.f29105i = getArguments().getString("ACTIVE_LIVE_STREAM_ID");
        this.f29106j = getArguments().getString("ACTIVE_LIVE_STREAM_NUM");
        this.f29107k = getArguments().getString("ACTIVE_LIVE_STREAM_NAME");
        this.f29108l = getArguments().getString("ACTIVE_LIVE_STREAM_ICON");
        this.f29109m = getArguments().getString("ACTIVE_LIVE_STREAM_CHANNEL_ID");
        this.f29110n = getArguments().getString("ACTIVE_LIVE_STREAM_CHANNEL_DURATION");
        Serializable serializable = getArguments().getSerializable("LIVE_STREAMS_EPG");
        if (this.f29104h == null || serializable == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) serializable;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String strJ = ((XMLTVProgrammePojo) arrayList.get(i2)).j();
            String[] strArrSplit = strJ.split("\\s+");
            Long.parseLong(((XMLTVProgrammePojo) arrayList.get(i2)).k());
            Long.parseLong(((XMLTVProgrammePojo) arrayList.get(i2)).c());
            ((XMLTVProgrammePojo) arrayList.get(i2)).l();
            strJ.split("\\s+");
            ((XMLTVProgrammePojo) arrayList.get(i2)).m();
            ((XMLTVProgrammePojo) arrayList.get(i2)).b();
            try {
                str = new SimpleDateFormat("dd MMM yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(strArrSplit[0]));
            } catch (ParseException e2) {
                e2.printStackTrace();
                str = BuildConfig.FLAVOR;
            }
            if (str != null && str.equals(this.f29104h)) {
                arrayList2.add(arrayList.get(i2));
            }
        }
        SubTVArchiveAdapter subTVArchiveAdapter = new SubTVArchiveAdapter(arrayList2, 0, false, this.f29104h, this.f29105i, this.f29106j, this.f29107k, this.f29108l, this.f29109m, this.f29110n, getContext());
        this.f29099c = subTVArchiveAdapter;
        this.myRecyclerView.setAdapter(subTVArchiveAdapter);
        l(1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f29102f == null || this.f29101e == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (this.f29102f.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f29102f.getResources().getDisplayMetrics());
        }
        for (int i2 = 0; i2 < this.f29101e.getChildCount(); i2++) {
            if (this.f29101e.getChildAt(i2) instanceof ActionMenuView) {
                ((Toolbar.e) this.f29101e.getChildAt(i2).getLayoutParams()).f135a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(com.nst.iptvsmarterstvbox.R.layout.fragment_epg, viewGroup, false);
        this.f29103g = ButterKnife.b(this, viewInflate);
        a.i.h.a.n(getActivity());
        setHasOptionsMenu(true);
        q();
        o();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29103g.a();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == com.nst.iptvsmarterstvbox.R.id.nav_home) {
            startActivity(new Intent(this.f29102f, (Class<?>) NewDashboardActivity.class));
        }
        if (itemId == com.nst.iptvsmarterstvbox.R.id.nav_settings) {
            startActivity(new Intent(this.f29102f, (Class<?>) SettingsActivity.class));
        }
        if (itemId != com.nst.iptvsmarterstvbox.R.id.action_logout1 || (context = this.f29102f) == null) {
            return false;
        }
        new b.a(context, com.nst.iptvsmarterstvbox.R.style.AlertDialogCustom).setTitle(getResources().getString(com.nst.iptvsmarterstvbox.R.string.logout_title)).f(getResources().getString(com.nst.iptvsmarterstvbox.R.string.logout_message)).j(getResources().getString(com.nst.iptvsmarterstvbox.R.string.yes), new b()).g(getResources().getString(com.nst.iptvsmarterstvbox.R.string.no), new a()).n();
        return false;
    }

    public final void q() {
        this.f29101e = (Toolbar) getActivity().findViewById(com.nst.iptvsmarterstvbox.R.id.toolbar);
    }
}
