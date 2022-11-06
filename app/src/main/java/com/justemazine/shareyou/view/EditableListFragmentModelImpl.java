package com.justemazine.shareyou.view;

import com.justemazine.shareyou.fragment.EditableListFragment;
import com.justemazine.shareyou.widget.EditableListAdapter;

public interface EditableListFragmentModelImpl<V extends EditableListAdapter.EditableViewHolder>
{
    void setLayoutClickListener(EditableListFragment.LayoutClickListener<V> clickListener);
}
