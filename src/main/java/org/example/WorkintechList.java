package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<E> extends ArrayList<E> {

    @Override
    public boolean add(E e) {
        if (!this.contains(e)) {
            return super.add(e);
        }
        return false; // Zaten varsa ekleme
    }

    @Override
    public boolean addAll(java.util.Collection<? extends E> c) {
        boolean modified = false;
        for (E e : c) {
            if (!this.contains(e)) {
                super.add(e);
                modified = true;
            }
        }
        return modified;
    }

    // Remove metodu
    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        if (removed) {
            this.sort(); // Eleman silindikten sonra sıralama
        }
        return removed;
    }

    // Sort metodu
    public void sort() {
        Collections.sort((ArrayList<E>) this, null);
    }
}
