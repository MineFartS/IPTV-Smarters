package com.nst.iptvsmarterstvbox.view.activity;

import a.b.k.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.h.a.h.n.e;
import c.h.a.i.q.d;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import com.nst.iptvsmarterstvbox.view.adapter.AddedExternalPlayerAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class AddedExternalPlayerActivity extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f25297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f25298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<ExternalPlayerModelClass> f25299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.h.a.k.d.a.a f25300g;

    @BindView
    public LinearLayout ll_add_player;

    @BindView
    public LinearLayout ll_no_data_found;

    @BindView
    public LinearLayout ll_progressbar;

    @BindView
    public ImageView logo;

    @BindView
    public RecyclerView recyclerView;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.b(AddedExternalPlayerActivity.this.f25297d);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class b extends AsyncTask<Boolean, Void, Boolean> {
        public b() {
        }

        public /* synthetic */ b(AddedExternalPlayerActivity addedExternalPlayerActivity, a aVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Boolean... boolArr) {
            return AddedExternalPlayerActivity.this.C0();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            AddedExternalPlayerActivity.this.ll_progressbar.setVisibility(8);
            if (!bool.booleanValue()) {
                AddedExternalPlayerActivity.this.D0(Boolean.FALSE);
                return;
            }
            AddedExternalPlayerActivity.this.D0(Boolean.TRUE);
            AddedExternalPlayerActivity addedExternalPlayerActivity = AddedExternalPlayerActivity.this;
            addedExternalPlayerActivity.recyclerView.setLayoutManager(new LinearLayoutManager(addedExternalPlayerActivity.f25297d, 1, false));
            AddedExternalPlayerActivity.this.recyclerView.setAdapter(new AddedExternalPlayerAdapter(AddedExternalPlayerActivity.this.f25297d, AddedExternalPlayerActivity.this.f25299f, AddedExternalPlayerActivity.this));
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            AddedExternalPlayerActivity.this.ll_no_data_found.setVisibility(8);
            AddedExternalPlayerActivity.this.recyclerView.setVisibility(8);
            AddedExternalPlayerActivity.this.ll_progressbar.setVisibility(0);
        }
    }

    public final Boolean C0() {
        d dVar = new d(this.f25297d);
        this.f25298e = dVar;
        ArrayList<ExternalPlayerModelClass> arrayListL = dVar.l();
        this.f25299f = arrayListL;
        if (arrayListL != null && arrayListL.size() > 0) {
            for (int i2 = 0; i2 < this.f25299f.size(); i2++) {
                String strA = this.f25299f.get(i2).a();
                if (!e.f(this.f25299f.get(i2).b(), this.f25297d)) {
                    this.f25298e.m(strA);
                }
            }
        }
        this.f25299f = new ArrayList<>();
        ArrayList<ExternalPlayerModelClass> arrayListL2 = this.f25298e.l();
        this.f25299f = arrayListL2;
        return (arrayListL2 == null || arrayListL2.size() <= 0) ? Boolean.FALSE : Boolean.TRUE;
    }

    public final void D0(Boolean bool) {
        if (bool.booleanValue()) {
            this.ll_add_player.setVisibility(0);
            this.ll_no_data_found.setVisibility(8);
            this.recyclerView.setVisibility(0);
        } else {
            this.ll_no_data_found.setVisibility(0);
            this.ll_add_player.setVisibility(8);
            this.recyclerView.setVisibility(8);
        }
    }

    public void E0() {
        new b(this, null).execute(new Boolean[0]);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f25297d = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f25297d);
        this.f25300g = aVar;
        setContentView(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_added_external_player_tv : R.layout.activity_added_external_player);
        ButterKnife.a(this);
        this.logo.setOnClickListener(new a());
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        E0();
    }

    @OnClick
    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.iv_add_player /* 2131428101 */:
            case R.id.ll_add_player /* 2131428284 */:
            case R.id.ll_no_data_found /* 2131428416 */:
            case R.id.tv_add_player /* 2131429284 */:
                startActivity(new Intent(this, (Class<?>) ExternalPlayerActivity.class));
                break;
        }
    }
}
