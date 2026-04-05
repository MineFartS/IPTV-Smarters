package org.simpleframework.xml.util;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.simpleframework.xml.util.Match;

/* JADX INFO: loaded from: classes2.dex */
public class Resolver<M extends Match> extends AbstractSet<M> {
    public final Resolver<M>.Stack stack = new Stack();
    public final Resolver<M>.Cache cache = new Cache();

    public class Cache extends LimitedCache<List<M>> {
        public Cache() {
            super(1024);
        }
    }

    public class Stack extends LinkedList<M> {

        public class Sequence implements Iterator<M> {
            private int cursor;

            public Sequence() {
                this.cursor = Stack.this.size();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.cursor > 0;
            }

            @Override // java.util.Iterator
            public M next() {
                if (!hasNext()) {
                    return null;
                }
                Stack stack = Stack.this;
                int i2 = this.cursor - 1;
                this.cursor = i2;
                return (M) stack.get(i2);
            }

            @Override // java.util.Iterator
            public void remove() {
                Stack.this.purge(this.cursor);
            }
        }

        private Stack() {
        }

        public void purge(int i2) {
            Resolver.this.cache.clear();
            remove(i2);
        }

        @Override // java.util.LinkedList, java.util.Deque
        public void push(M m2) {
            Resolver.this.cache.clear();
            addFirst(m2);
        }

        public Iterator<M> sequence() {
            return new Sequence();
        }
    }

    private boolean match(char[] cArr, int i2, char[] cArr2, int i3) {
        while (i3 < cArr2.length && i2 < cArr.length) {
            if (cArr2[i3] == '*') {
                while (cArr2[i3] == '*') {
                    i3++;
                    if (i3 >= cArr2.length) {
                        return true;
                    }
                }
                if (cArr2[i3] == '?' && (i3 = i3 + 1) >= cArr2.length) {
                    return true;
                }
                while (i2 < cArr.length) {
                    if (cArr[i2] == cArr2[i3] || cArr2[i3] == '?') {
                        if (cArr2[i3 - 1] == '?') {
                            break;
                        }
                        if (match(cArr, i2, cArr2, i3)) {
                            return true;
                        }
                    }
                    i2++;
                }
                if (cArr.length == i2) {
                    return false;
                }
            }
            int i4 = i2 + 1;
            int i5 = i3 + 1;
            if (cArr[i2] != cArr2[i3] && cArr2[i5 - 1] != '?') {
                return false;
            }
            i2 = i4;
            i3 = i5;
        }
        if (cArr2.length == i3) {
            return cArr.length == i2;
        }
        while (cArr2[i3] == '*') {
            i3++;
            if (i3 >= cArr2.length) {
                return true;
            }
        }
        return false;
    }

    private boolean match(char[] cArr, char[] cArr2) {
        return match(cArr, 0, cArr2, 0);
    }

    private List<M> resolveAll(String str, char[] cArr) {
        ArrayList arrayList = new ArrayList();
        for (M m2 : this.stack) {
            if (match(cArr, m2.getPattern().toCharArray())) {
                this.cache.put(str, arrayList);
                arrayList.add(m2);
            }
        }
        return arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(M m2) {
        this.stack.push((Match) m2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.cache.clear();
        this.stack.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<M> iterator() {
        return this.stack.sequence();
    }

    public boolean remove(M m2) {
        this.cache.clear();
        return this.stack.remove(m2);
    }

    public M resolve(String str) {
        List<M> listResolveAll = (List) this.cache.get(str);
        if (listResolveAll == null) {
            listResolveAll = resolveAll(str);
        }
        if (listResolveAll.isEmpty()) {
            return null;
        }
        return listResolveAll.get(0);
    }

    public List<M> resolveAll(String str) {
        List<M> list = (List) this.cache.get(str);
        if (list != null) {
            return list;
        }
        char[] charArray = str.toCharArray();
        if (charArray == null) {
            return null;
        }
        return resolveAll(str, charArray);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.stack.size();
    }
}
