package com.example.notesbyrishu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ChapterAdapter extends ArrayAdapter<String> {
    private Context context;
    private String[] chapterItems;

    public ChapterAdapter(Context context, String[] chapterItems) {
        super(context, R.layout.list_item, chapterItems);
        this.context = context;
        this.chapterItems = chapterItems;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        TextView textView = (TextView) view.findViewById(R.id.list_item_text);
        textView.setText(chapterItems[position]);

        return view;
    }
}