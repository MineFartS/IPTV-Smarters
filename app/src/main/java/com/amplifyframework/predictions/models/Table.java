package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.ImageFeature;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Table extends ImageFeature<List<Cell>> {
    private final int columnSize;
    private final int rowSize;

    public static final class Builder extends ImageFeature.Builder<Builder, Table, List<Cell>> {
        private List<Cell> cells;
        private int columnSize;
        private int rowSize;

        private Builder() {
            this.cells = Collections.emptyList();
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Table build() {
            return new Table(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder cells(List<Cell> list) {
            return (Builder) value(list);
        }

        public Builder columnSize(int i2) {
            this.columnSize = i2;
            return this;
        }

        public List<Cell> getCells() {
            List<Cell> list = this.cells;
            list.getClass();
            return list;
        }

        public int getColumnSize() {
            return this.columnSize;
        }

        public int getRowSize() {
            return this.rowSize;
        }

        public Builder rowSize(int i2) {
            this.rowSize = i2;
            return this;
        }
    }

    private Table(Builder builder) {
        super(builder);
        this.rowSize = builder.getRowSize();
        this.columnSize = builder.getColumnSize();
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<Cell> getCells() {
        return getValue();
    }

    public int getColumnSize() {
        return this.columnSize;
    }

    public int getRowSize() {
        return this.rowSize;
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.TABLE.getAlias();
    }
}
