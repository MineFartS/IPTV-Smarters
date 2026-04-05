package com.amplifyframework.api.graphql;

import a.i.q.d;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class PaginatedResult<T> implements Iterable<T> {
    private final Iterable<T> items;
    private final GraphQLRequest<PaginatedResult<T>> requestForNextResult;

    public PaginatedResult(Iterable<T> iterable, GraphQLRequest<PaginatedResult<T>> graphQLRequest) {
        this.requestForNextResult = graphQLRequest;
        this.items = iterable;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PaginatedResult.class != obj.getClass()) {
            return false;
        }
        PaginatedResult paginatedResult = (PaginatedResult) obj;
        return d.a(this.requestForNextResult, paginatedResult.requestForNextResult) && d.a(this.items, paginatedResult.items);
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer<? super T> consumer) {
        this.items.forEach(consumer);
    }

    public Iterable<T> getItems() {
        return this.items;
    }

    public GraphQLRequest<PaginatedResult<T>> getRequestForNextResult() {
        return this.requestForNextResult;
    }

    public boolean hasNextResult() {
        return this.requestForNextResult != null;
    }

    public int hashCode() {
        return d.b(this.requestForNextResult, this.items);
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.items.iterator();
    }

    @Override // java.lang.Iterable
    public Spliterator<T> spliterator() {
        return this.items.spliterator();
    }

    public String toString() {
        return "PaginatedResult{requestForNextResult=" + this.requestForNextResult + ", items=" + this.items + '}';
    }
}
