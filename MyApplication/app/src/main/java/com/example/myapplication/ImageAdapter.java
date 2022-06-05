package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private int currentImageId;
    private int countOfItems;
    private int currentCountOfImages;
    private ImageView imageViews[];
    public ImageAdapter(Context c, int countOfItems) {
        mContext = c;
        this.countOfItems = countOfItems;
        currentCountOfImages = 0;
        imageViews = new ImageView[countOfItems];
    }

    public void setCurrentCountOfImages(int count)
    {
        currentCountOfImages = count;
    }
    public void setImagesAtRandomPosition(int count)
    {
        int[] tempArray = new int[getCount()];
        setCurrentCountOfImages(count);
        for(int  i = 0; i < tempArray.length; i++) {
            imageViews[i].setVisibility(View.INVISIBLE);
            tempArray[i] = i;
        }
        for(int i = 0; i < count; i++)
        {
            int rand  = (int)(Math.random() * tempArray.length);
            if (rand == i) continue;

            int temp = tempArray[i];
            tempArray[i] = tempArray[rand];
            tempArray[rand] = temp;
        }
        for(int i = 0; i < count; i++ )
            imageViews[tempArray[i]].setVisibility(View.VISIBLE);
    }
    public int getCurrentCountOfImages()
    {
        return currentCountOfImages;
    }
    public int getCount() {
        return countOfItems;
    }

    public Object getItem(int position) {
        return currentImageId;
    }

    public long getItemId(int position) {
        return position;
    }

    public void setCurrentImageId(int currentImageId)//сохраняем id иконки
    {
        this.currentImageId = currentImageId;
    }
    public void changeImages()//устанавливаем новые изображения
    {
        for (int i = 0; i < getCount(); i++)
            imageViews[i].setImageResource(currentImageId);
    }
    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);

            imageView.setLayoutParams(new GridView.LayoutParams(((GridView)parent).getColumnWidth(), ((GridView)parent).getColumnWidth()));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageViews[position] = imageView;
            //imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(currentImageId);
        if(position == getCount() - 1)
            setImagesAtRandomPosition(currentCountOfImages);
        return imageView;
    }
}