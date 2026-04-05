package io.realm.internal;

import e.a.d;
import e.a.g.e;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class RealmNotifier implements Closeable {
    private SharedRealm sharedRealm;
    private e<b> realmObserverPairs = new e<>();
    private final e.a<b> onChangeCallBack = new a();
    private List<Runnable> transactionCallbacks = new ArrayList();

    public class a implements e.a<b> {
        public a() {
        }

        @Override // e.a.g.e.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(b bVar, Object obj) {
            if (RealmNotifier.this.sharedRealm == null) {
                return;
            }
            SharedRealm unused = RealmNotifier.this.sharedRealm;
            throw null;
        }
    }

    public static class b<T> extends e.b<T, d<T>> {
        public b(T t, d<T> dVar) {
            super(t, dVar);
        }
    }

    public RealmNotifier(SharedRealm sharedRealm) {
    }

    private void removeAllChangeListeners() {
        this.realmObserverPairs.b();
    }

    public <T> void addChangeListener(T t, d<T> dVar) {
        this.realmObserverPairs.a(new b(t, dVar));
    }

    public void addTransactionCallback(Runnable runnable) {
        this.transactionCallbacks.add(runnable);
    }

    public void beforeNotify() {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        removeAllChangeListeners();
    }

    public void didChange() {
        this.realmObserverPairs.c(this.onChangeCallBack);
        if (this.transactionCallbacks.isEmpty()) {
            return;
        }
        List<Runnable> list = this.transactionCallbacks;
        this.transactionCallbacks = new ArrayList();
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public int getListenersListSize() {
        return this.realmObserverPairs.g();
    }

    public abstract boolean post(Runnable runnable);

    public <E> void removeChangeListener(E e2, d<E> dVar) {
        this.realmObserverPairs.e(e2, dVar);
    }

    public <E> void removeChangeListeners(E e2) {
        this.realmObserverPairs.f(e2);
    }
}
