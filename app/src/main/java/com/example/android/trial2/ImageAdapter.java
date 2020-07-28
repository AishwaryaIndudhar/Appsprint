package com.example.android.trial2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ImageAdapter extends ArrayAdapter<MyImage>{
    public ImageAdapter(Activity context, ArrayList<MyImage> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        MyImage currentImg = getItem(position);



               // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.img1);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentImg.getimgid1());
        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView2 = (ImageView) listItemView.findViewById(R.id.img2);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView2.setImageResource(currentImg.getimgid2());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView3 = (ImageView) listItemView.findViewById(R.id.img3);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView3.setImageResource(currentImg.getimgid3());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}