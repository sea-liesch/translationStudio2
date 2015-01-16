package com.door43.translationstudio.panes.right;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.door43.translationstudio.R;
import com.door43.translationstudio.projects.Term;
import com.door43.translationstudio.util.TranslatorBaseFragment;

/**
 * Created by joel on 8/26/2014.
 */
public class RightPaneFragment extends TranslatorBaseFragment {
    private ResourcesFragment mResourcesFragment = new ResourcesFragment();
    private int mLayoutWidth = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_pane_right, container, false);

        // insert resources layout
        getFragmentManager().beginTransaction().replace(R.id.right_pane_content, mResourcesFragment).addToBackStack(null).commit();

        if(mLayoutWidth != 0) {
            rootView.setLayoutParams(new ViewGroup.LayoutParams(mLayoutWidth, ViewGroup.LayoutParams.FILL_PARENT));
        }

        return rootView;
    }
    /**
     * Triggered whenever the pane is opened
     */
    public void onOpen() {

    }

    public void reloadTerm() {
        mResourcesFragment.showTerm();
    }
    public void showTerm(Term term) {
        mResourcesFragment.showTerm(term);
    }
    public void showNotes() {
        mResourcesFragment.showNotes();
    }

    /**
     * Specifies the width of the layout
     * @param width
     */
    public void setLayoutWidth(int width) {
        mLayoutWidth = width;
    }
}
