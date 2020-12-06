package ua.edu.ucu.collections.immutable;

// Delete comments because Jenkins codestyle treats
// them as long lines :/
public interface ImmutableList {

    ImmutableList add(Object e);

    ImmutableList add(int index, Object e);

    ImmutableList addAll(Object[] c);

    ImmutableList addAll(int index, Object[] c);

    Object get(int index);

    ImmutableList remove(int index);

    ImmutableList set(int index, Object e);

    int indexOf(Object e);

    int size();

    ImmutableList clear();

    boolean isEmpty();

    Object[] toArray();

    @Override
    String toString();
}
